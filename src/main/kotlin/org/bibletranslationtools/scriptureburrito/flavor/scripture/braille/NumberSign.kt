package org.bibletranslationtools.scriptureburrito.flavor.scripture.braille

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "character", "useInMargin"
)
class NumberSign {

    @get:JsonProperty("character")
    @set:JsonProperty("character")
    @JsonProperty("character")
    var character: String? = null



    @get:JsonProperty("useInMargin")
    @set:JsonProperty("useInMargin")
    @JsonProperty("useInMargin")
    var useInMargin: Boolean? = null

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(NumberSign::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("character")
        sb.append('=')
        sb.append((if ((this.character == null)) "<null>" else this.character))
        sb.append(',')
        sb.append("useInMargin")
        sb.append('=')
        sb.append((if ((this.useInMargin == null)) "<null>" else this.useInMargin))
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
        result = ((result * 31) + (if ((this.character == null)) 0 else character.hashCode()))
        result = ((result * 31) + (if ((this.useInMargin == null)) 0 else useInMargin.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is NumberSign) == false) {
            return false
        }
        val rhs = other
        return (((this.character === rhs.character) || ((this.character != null) && (this.character == rhs.character))) && ((this.useInMargin === rhs.useInMargin) || ((this.useInMargin != null) && (this.useInMargin == rhs.useInMargin))))
    }
}
