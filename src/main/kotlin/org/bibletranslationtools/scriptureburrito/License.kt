package org.bibletranslationtools.scriptureburrito

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyDescription
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "url", "ingredient"
)
class License {
    
    
    
    @get:JsonProperty("url")
    @set:JsonProperty("url")
    @JsonProperty("url")
    @JsonPropertyDescription("A valid **Uniform Resource Locator**.")
    var url: String? = null
    
    
    
    @get:JsonProperty("ingredient")
    @set:JsonProperty("ingredient")
    @JsonProperty("ingredient")
    @JsonPropertyDescription("A file path, delimited by forward slashes.")
    var ingredient: String? = null

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(License::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("url")
        sb.append('=')
        sb.append((if ((this.url == null)) "<null>" else this.url))
        sb.append(',')
        sb.append("ingredient")
        sb.append('=')
        sb.append((if ((this.ingredient == null)) "<null>" else this.ingredient))
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
        result = ((result * 31) + (if ((this.url == null)) 0 else url.hashCode()))
        result = ((result * 31) + (if ((this.ingredient == null)) 0 else ingredient.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is License) == false) {
            return false
        }
        val rhs = other
        return (((this.url === rhs.url) || ((this.url != null) && (this.url == rhs.url))) && ((this.ingredient === rhs.ingredient) || ((this.ingredient != null) && (this.ingredient == rhs.ingredient))))
    }
}
