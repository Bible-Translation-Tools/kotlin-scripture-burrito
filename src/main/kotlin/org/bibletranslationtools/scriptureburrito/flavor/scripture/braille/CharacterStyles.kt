package org.bibletranslationtools.scriptureburrito.flavor.scripture.braille

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "callerSymbol"
)
class CharacterStyles {

    @get:JsonProperty("callerSymbol")
    @set:JsonProperty("callerSymbol")
    @JsonProperty("callerSymbol")
    var callerSymbol: String? = null

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(CharacterStyles::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("callerSymbol")
        sb.append('=')
        sb.append((if ((this.callerSymbol == null)) "<null>" else this.callerSymbol))
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
        result = ((result * 31) + (if ((this.callerSymbol == null)) 0 else callerSymbol.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is CharacterStyles) == false) {
            return false
        }
        val rhs = other
        return ((this.callerSymbol === rhs.callerSymbol) || ((this.callerSymbol != null) && (this.callerSymbol == rhs.callerSymbol)))
    }
}
