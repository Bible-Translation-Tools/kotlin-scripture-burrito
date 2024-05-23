package org.bibletranslationtools.scriptureburrito

import com.fasterxml.jackson.annotation.*
import com.fasterxml.jackson.annotation.JsonSubTypes.Type
import org.bibletranslationtools.scriptureburrito.Category
import org.bibletranslationtools.scriptureburrito.MetaVersionSchema
import org.bibletranslationtools.scriptureburrito.NormalizationSchema
import java.util.*

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "category"
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "category")
@JsonSubTypes(
    Type(value = DerivedMetaSchema::class, name = "derived"),
    Type(value = SourceMetaSchema::class, name = "source"),
    Type(value = TemplateMetaSchema::class, name = "template")
)
abstract class Meta(
    @get:JsonProperty("dateCreated")
    @set:JsonProperty("dateCreated")
    @JsonProperty("dateCreated")
    var dateCreated: Date,


    @get:JsonProperty("version")
    @set:JsonProperty("version")
    @JsonProperty("version")
    @JsonPropertyDescription("Version of the Scripture Burrito specification this file follows.")
    var version: MetaVersionSchema,


    @get:JsonProperty("generator")
    @set:JsonProperty("generator")
    @JsonProperty("generator")
    var generator: SoftwareAndUserInfoSchema? = null,


    @get:JsonProperty("defaultLocale")
    @set:JsonProperty("defaultLocale")
    @JsonProperty("defaultLocale")
    @JsonPropertyDescription("A valid IETF language tag as specified by BCP 47.")
    var defaultLocale: String,

    @get:JsonProperty("normalization")
    @set:JsonProperty("normalization")
    @JsonProperty("normalization")
    @JsonPropertyDescription("Unicode normalization options. This applies to both ingredients and metadata.")
    var normalization: NormalizationSchema? = null,

    @get:JsonProperty("comments")
    @set:JsonProperty("comments")
    @JsonProperty("comments")
    @JsonPropertyDescription("Arbitrary text strings attached by users with no effect on the interpretation of the Scripture Burrito.")
    var comments: List<String> = ArrayList()
) {

//    @get:JsonProperty("category")
//    @set:JsonProperty("category")
//    @JsonProperty("category")
//    // Category gets read by Jackson in determining the subtype and won't get set via the constructor
//    // thus, we have to manually assign it as a lateinit
//    lateinit var category: Category

//    override fun toString(): String {
//        val sb = StringBuilder()
//        sb.append(Meta::class.java.name).append('@').append(
//            Integer.toHexString(
//                System.identityHashCode(
//                    this
//                )
//            )
//        ).append('[')
//        sb.append("category")
//        sb.append('=')
//        sb.append((if ((this.category == null)) "<null>" else this.category))
//        sb.append(',')
//        if (sb[sb.length - 1] == ',') {
//            sb.setCharAt((sb.length - 1), ']')
//        } else {
//            sb.append(']')
//        }
//        return sb.toString()
//    }
//
//    override fun hashCode(): Int {
//        var result = 1
//        result = ((result * 31) + (if ((this.category == null)) 0 else this.category.hashCode()))
//        return result
//    }
//
//    override fun equals(other: Any?): Boolean {
//        if (other === this) {
//            return true
//        }
//        if ((other is Meta) == false) {
//            return false
//        }
//        val rhs = other
//        return ((this.category == rhs.category) || ((this.category != null) && (this.category == rhs.category)))
//    }

}
