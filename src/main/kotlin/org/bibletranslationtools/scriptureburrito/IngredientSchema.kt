package org.bibletranslationtools.scriptureburrito

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyDescription
import com.fasterxml.jackson.annotation.JsonPropertyOrder


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "size", "lang", "mimeType", "checksum", "scope", "role"
)
class IngredientSchema {
    
    @get:JsonProperty("size")
    @set:JsonProperty("size")
    @JsonProperty("size")
    @JsonPropertyDescription("The number of bytes that this ingredient takes up on disk.")
    var size: Int? = null
    
    @get:JsonProperty("lang")
    @set:JsonProperty("lang")
    @JsonProperty("lang")
    @JsonPropertyDescription("A valid IETF language tag as specified by BCP 47.")
    var lang: String? = null

    @get:JsonProperty("mimeType")
    @set:JsonProperty("mimeType")
    @JsonProperty("mimeType")
    @JsonPropertyDescription("An IANA media type (also known as MIME type)")
    var mimeType: String? = null

    @get:JsonProperty("checksum")
    @set:JsonProperty("checksum")
    @JsonProperty("checksum")
    var checksum: Checksum? = null

    @get:JsonProperty("scope")
    @set:JsonProperty("scope")
    @JsonProperty("scope")
    @JsonPropertyDescription("Scope specification, used for the whole burrito and for specific ingredients. In both cases it describes the actual content, not future translation goals.")
    var scope: ScopeSchema? = null

    @get:JsonProperty("role")
    @set:JsonProperty("role")
    @JsonProperty("role")
    @JsonPropertyDescription("Roles which may be optionally attached to an ingredient.")
    var role: String? = null

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(IngredientSchema::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("size")
        sb.append('=')
        sb.append((if ((this.size == null)) "<null>" else this.size))
        sb.append(',')
        sb.append("lang")
        sb.append('=')
        sb.append((if ((this.lang == null)) "<null>" else this.lang))
        sb.append(',')
        sb.append("mimeType")
        sb.append('=')
        sb.append((if ((this.mimeType == null)) "<null>" else this.mimeType))
        sb.append(',')
        sb.append("checksum")
        sb.append('=')
        sb.append((if ((this.checksum == null)) "<null>" else this.checksum))
        sb.append(',')
        sb.append("scope")
        sb.append('=')
        sb.append((if ((this.scope == null)) "<null>" else this.scope))
        sb.append(',')
        sb.append("role")
        sb.append('=')
        sb.append((if ((this.role == null)) "<null>" else this.role))
        sb.append(',')
        if (sb[sb.length - 1] == ',') {
            sb.setCharAt((sb.length - 1), ']')
        } else {
            sb.append(']')
        }
        return sb.toString()
    }

    override fun hashCode(): Int {
        var result = 1
        result = ((result * 31) + (if ((this.checksum == null)) 0 else checksum.hashCode()))
        result = ((result * 31) + (if ((this.mimeType == null)) 0 else mimeType.hashCode()))
        result = ((result * 31) + (if ((this.role == null)) 0 else role.hashCode()))
        result = ((result * 31) + (if ((this.size == null)) 0 else size.hashCode()))
        result = ((result * 31) + (if ((this.lang == null)) 0 else lang.hashCode()))
        result = ((result * 31) + (if ((this.scope == null)) 0 else scope.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is IngredientSchema) == false) {
            return false
        }
        val rhs = other
        return (((((((this.checksum === rhs.checksum) || ((this.checksum != null) && (this.checksum == rhs.checksum))) && ((this.mimeType === rhs.mimeType) || ((this.mimeType != null) && (this.mimeType == rhs.mimeType)))) && ((this.role === rhs.role) || ((this.role != null) && (this.role == rhs.role)))) && ((this.size === rhs.size) || ((this.size != null) && (this.size == rhs.size)))) && ((this.lang === rhs.lang) || ((this.lang != null) && (this.lang == rhs.lang)))) && ((this.scope === rhs.scope) || ((this.scope != null) && (this.scope == rhs.scope))))
    }
}
