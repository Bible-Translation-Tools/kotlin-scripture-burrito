package org.bibletranslationtools.scriptureburrito.flavor

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "name"
)
class XFlavorSchema {



    @get:JsonProperty("name")
    @set:JsonProperty("name")
    @JsonProperty("name")
    var name: String? = null

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(XFlavorSchema::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("name")
        sb.append('=')
        sb.append((if ((this.name == null)) "<null>" else this.name))
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
        result = ((result * 31) + (if ((this.name == null)) 0 else name.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is XFlavorSchema) == false) {
            return false
        }
        val rhs = other
        return ((this.name === rhs.name) || ((this.name != null) && (this.name == rhs.name)))
    }
}
