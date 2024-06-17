package org.bibletranslationtools.scriptureburrito.flavor

import com.fasterxml.jackson.annotation.*
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.core.JsonProcessingException
import com.fasterxml.jackson.databind.*
import com.fasterxml.jackson.module.kotlin.KotlinModule
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import org.bibletranslationtools.scriptureburrito.flavor.scripture.ScriptureFlavorSchema
import org.bibletranslationtools.scriptureburrito.flavor.scripture.audio.AudioFlavorSchema
import org.bibletranslationtools.scriptureburrito.flavor.scripture.braille.EmbossedBrailleScriptureSchema
import org.bibletranslationtools.scriptureburrito.flavor.scripture.print.TypesetScriptureSchema
import org.bibletranslationtools.scriptureburrito.flavor.scripture.text.TextTranslationSchema
import org.bibletranslationtools.scriptureburrito.flavor.scripture.video.SignLanguageVideoTranslationSchema
import java.io.IOException

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "name"
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "name")
@JsonSubTypes(
    JsonSubTypes.Type(value = TextTranslationSchema::class, name = "textTranslation"),
    JsonSubTypes.Type(value = AudioFlavorSchema::class, name = "audioTranslation"),
    JsonSubTypes.Type(value = SignLanguageVideoTranslationSchema::class, name = "signLanguageVideoTranslation"),
    JsonSubTypes.Type(value = EmbossedBrailleScriptureSchema::class, name = "embossedBrailleScripture"),
    JsonSubTypes.Type(value = TypesetScriptureSchema::class, name = "typesetScripture")
)
abstract class FlavorSchema {

    @get:JsonProperty("name")
    @set:JsonProperty("name")
    @JsonProperty("name")
    open lateinit var name: String
    // abstract var name: String
//    override fun equals(other: Any?): Boolean {
//        if (this === other) return true
//        if (other !is FlavorSchema) return false
//
//        if (name != other.name) return false
//
//        return true
//    }
//
//    override fun hashCode(): Int {
//        return name.hashCode()
//    }
//
//    override fun toString(): String {
//        return "FlavorSchema(name='$name')"
//    }
}

//class FlavorSchemaDeserializer : JsonDeserializer<FlavorSchema?>() {
//    val mapper = ObjectMapper().registerKotlinModule()
//
//    @Throws(IOException::class, JsonProcessingException::class)
//    override fun deserialize(jp: JsonParser, ctx: DeserializationContext?): FlavorSchema {
//        val node: JsonNode = jp.readValueAsTree() // Get the complete JSON structure
//
//        // Extract the "format" field from the package object (assuming it's nested)
//        val format = node["name"].asText()
//
//        val flavor: FlavorSchema = when (format) {
//            "textTranslation" -> mapper.readValue(node.toString(), ScriptureFlavorSchema::class.java)
//            "audioTranslation" -> {
//                val parsed = mapper.readValue(node.toString(), AudioFlavorSchema::class.java)
//                parsed
//            }
//
//            else -> throw JsonMappingException("Unsupported format string: $format")
//        }
//        return flavor
//    }
//}