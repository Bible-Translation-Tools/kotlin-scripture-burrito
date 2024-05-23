package org.bibletranslationtools.scriptureburrito

import com.fasterxml.jackson.annotation.*
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.core.JsonProcessingException
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonDeserializer
import com.fasterxml.jackson.databind.JsonMappingException
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.module.SimpleModule
import com.fasterxml.jackson.module.kotlin.KotlinModule
import org.bibletranslationtools.scriptureburrito.flavor.FlavorSchema
import org.bibletranslationtools.scriptureburrito.flavor.FlavorSchemaDeserializer
import java.io.IOException


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "meta",
    "type"
)
// @JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "meta")
@JsonSubTypes(
    JsonSubTypes.Type(value = DerivedMetadataSchema::class, name = "derived"),
    JsonSubTypes.Type(value = SourceMetadataSchema::class, name = "source"),
    JsonSubTypes.Type(value = TemplateMetadataSchema::class, name = "template")
)
abstract class MetadataSchema(
    @get:JsonProperty("format")
    @set:JsonProperty("format")
    @JsonProperty("format")
    var format: org.bibletranslationtools.scriptureburrito.Format,

    @get:JsonProperty("meta")
    @set:JsonProperty("meta")
    @JsonProperty("meta")
    open var meta: Meta,

    @get:JsonProperty("copyright")
    @set:JsonProperty("copyright")
    @JsonProperty("copyright")
    @JsonPropertyDescription("Describes the copyright holders and license terms of the burrito.")
    var copyright: CopyrightSchema,

    @get:JsonProperty("idAuthorities")
    @set:JsonProperty("idAuthorities")
    @JsonProperty("idAuthorities")
    @JsonPropertyDescription("Declares one or more identity authorities which may later be referred to using identifier prefixes.")
    var idAuthorities: IdAuthoritiesSchema? = null,

    @get:JsonProperty("identification")
    @set:JsonProperty("identification")
    @JsonProperty("identification")
    @JsonPropertyDescription("Identification section.")
    var identification: IdentificationSchema? = null,

    @get:JsonProperty("confidential")
    @set:JsonProperty("confidential")
    @JsonProperty("confidential")
    @JsonPropertyDescription("a true value indicates that the project should not be publicly known and that the identity of project members needs to be kept confidential.")
    var confidential: Boolean? = null,

    @get:JsonProperty("type")
    @set:JsonProperty("type")
    @JsonProperty("type")
    @JsonPropertyDescription("Contains properties describing the burrito flavor type.")
    open var type: TypeSchema? = null,

    @get:JsonProperty("relationships")
    @set:JsonProperty("relationships")
    @JsonProperty("relationships")
    @JsonPropertyDescription("Describes a relationship to another burrito that may be obtained from an indicated server.")
    var relationships: List<RelationshipSchema> = ArrayList(),

    @get:JsonProperty("languages")
    @set:JsonProperty("languages")
    @JsonProperty("languages")
    @JsonPropertyDescription("A list of all the languages of the contents of this burrito.")
    var languages: Languages = Languages(),

    @get:JsonProperty("targetAreas")
    @set:JsonProperty("targetAreas")
    @JsonProperty("targetAreas")
    @JsonPropertyDescription("A list of areas of the primary target audience of this burrito.")
    var targetAreas: List<org.bibletranslationtools.scriptureburrito.TargetAreaSchema> = ArrayList(),

    @get:JsonProperty("agencies")
    @set:JsonProperty("agencies")
    @JsonProperty("agencies")
    @JsonPropertyDescription("A list of agencies involved with the contents of the burrito or the work it is derived from.")
    var agencies: List<AgencySchema> = ArrayList(),

    @get:JsonProperty("ingredients")
    @set:JsonProperty("ingredients")
    @JsonProperty("ingredients")
    @JsonPropertyDescription("Describes the various files contained by the burrito, keyed by the canonical forward-slashed pathname of the file.")
    var ingredients: IngredientsSchema = IngredientsSchema(),

    @get:JsonProperty("localizedNames")
    @set:JsonProperty("localizedNames")
    @JsonProperty("localizedNames")
    @JsonPropertyDescription("Contains localized names for books, etc.")
    var localizedNames: LocalizedNamesSchema = LocalizedNamesSchema()
)

class MetadataDeserializer : JsonDeserializer<MetadataSchema?>() {

    val mapper = ObjectMapper()
        .registerModules(
            KotlinModule(),
            SimpleModule().addDeserializer(FlavorSchema::class.java, FlavorSchemaDeserializer())
        )

    @Throws(IOException::class, JsonProcessingException::class)
    override fun deserialize(jp: JsonParser, ctx: DeserializationContext?): MetadataSchema {
        val node: JsonNode = jp.readValueAsTree() // Get the complete JSON structure

        val category = node["meta"]["category"].asText()

        val meta: Meta = mapper.readValue(node["meta"].toString(), Meta::class.java)
        // Category gets read by Jackson in determining the subtype and won't get set via the constructor
        // thus, we have to manually assign it as a lateinit
        //meta.category = mapper.readValue(node["meta"]["category"].toString(), Category::class.java)

        val type: TypeSchema = mapper.readValue(node["type"].toString(), TypeSchema::class.java)
        val format = mapper.readValue(node["format"].toString(), org.bibletranslationtools.scriptureburrito.Format::class.java)
        val idAuthorities = mapper.readValue(node["idAuthorities"].toString(), IdAuthoritiesSchema::class.java)
        val identification = mapper.readValue(node["identification"].toString(), IdentificationSchema::class.java)
        val confidential = mapper.readValue(node["confidential"].toString(), Boolean::class.java)

//        val targetAreas = mapper.readValue(node["targetAreas"].toString(), TargetAreas::class.java)
//      val agencies = mapper.readValue(node["agencies"].toString(), Agencies::class.java)
//        val relationships = mapper.readValue(node["relationships"].toString(), Relationships::class.java)
        val copyright = mapper.readValue(node["copyright"].toString(), CopyrightSchema::class.java)


        val languages = mapper.readValue(node["languages"].toString(), Languages::class.java)
        val ingredients = mapper.readValue(node["ingredients"].toString(), IngredientsSchema::class.java)
        val localizedNames = mapper.readValue(node["localizedNames"].toString(), LocalizedNamesSchema::class.java)

        val metadata: MetadataSchema = when (category) {
            "source" -> {
                val out = SourceMetadataSchema(
                    format,
                    meta as SourceMetaSchema,
                    idAuthorities,
                    identification,
                    confidential,
                    type,
                    copyright,
                    languages = languages,
                    ingredients = ingredients,
                    localizedNames = localizedNames
                )
                out
            }

            "derived" -> {
                val out = DerivedMetadataSchema(
                    format,
                    meta as DerivedMetaSchema,
                    idAuthorities,
                    identification,
                    confidential,
                    type,
                    copyright,
                    languages = languages,
                    ingredients = ingredients,
                    localizedNames = localizedNames
                )
                out
            }
            "template" -> {
                val out = TemplateMetadataSchema(
                    format,
                    meta as TemplateMetaSchema,
                    idAuthorities,
                    identification,
                    confidential,
                    type,
                    copyright,
                    languages = languages,
                    ingredients = ingredients,
                    localizedNames = localizedNames
                )
                out
            }

            else -> throw JsonMappingException("Unsupported format string: $category")
        }
        return metadata
    }
}