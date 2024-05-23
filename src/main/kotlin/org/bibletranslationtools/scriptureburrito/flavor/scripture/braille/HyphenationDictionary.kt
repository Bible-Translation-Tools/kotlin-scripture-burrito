package org.bibletranslationtools.scriptureburrito.flavor.scripture.braille

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "src", "name"
)
class HyphenationDictionary {



    @get:JsonProperty("src")
    @set:JsonProperty("src")
    @JsonProperty("src")
    var src: String? = null



    @get:JsonProperty("name")
    @set:JsonProperty("name")
    @JsonProperty("name")
    var name: String? = null

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(HyphenationDictionary::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("src")
        sb.append('=')
        sb.append((if ((this.src == null)) "<null>" else this.src))
        sb.append(',')
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
        result = ((result * 31) + (if ((this.src == null)) 0 else src.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is HyphenationDictionary) == false) {
            return false
        }
        val rhs = other
        return (((this.name === rhs.name) || ((this.name != null) && (this.name == rhs.name))) && ((this.src === rhs.src) || ((this.src != null) && (this.src == rhs.src))))
    }
}
