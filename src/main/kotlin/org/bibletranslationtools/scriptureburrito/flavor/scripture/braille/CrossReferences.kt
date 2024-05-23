package org.bibletranslationtools.scriptureburrito.flavor.scripture.braille

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "emphasizedWord", "emphasizedPassageStart", "emphasizedPassageEnd"
)
class CrossReferences {
    @get:JsonProperty("emphasizedWord")
    @set:JsonProperty("emphasizedWord")
    @JsonProperty("emphasizedWord")
    var emphasizedWord: String? = null

    @get:JsonProperty("emphasizedPassageStart")
    @set:JsonProperty("emphasizedPassageStart")
    @JsonProperty("emphasizedPassageStart")
    var emphasizedPassageStart: String? = null

    @get:JsonProperty("emphasizedPassageEnd")
    @set:JsonProperty("emphasizedPassageEnd")
    @JsonProperty("emphasizedPassageEnd")
    var emphasizedPassageEnd: String? = null

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(CrossReferences::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("emphasizedWord")
        sb.append('=')
        sb.append((if ((this.emphasizedWord == null)) "<null>" else this.emphasizedWord))
        sb.append(',')
        sb.append("emphasizedPassageStart")
        sb.append('=')
        sb.append((if ((this.emphasizedPassageStart == null)) "<null>" else this.emphasizedPassageStart))
        sb.append(',')
        sb.append("emphasizedPassageEnd")
        sb.append('=')
        sb.append((if ((this.emphasizedPassageEnd == null)) "<null>" else this.emphasizedPassageEnd))
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
        result = ((result * 31) + (if ((this.emphasizedWord == null)) 0 else emphasizedWord.hashCode()))
        result = ((result * 31) + (if ((this.emphasizedPassageStart == null)) 0 else emphasizedPassageStart.hashCode()))
        result = ((result * 31) + (if ((this.emphasizedPassageEnd == null)) 0 else emphasizedPassageEnd.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if (other !is CrossReferences) {
            return false
        }
        val rhs = other
        return ((((this.emphasizedWord === rhs.emphasizedWord) || ((this.emphasizedWord != null) && (this.emphasizedWord == rhs.emphasizedWord))) && ((this.emphasizedPassageStart === rhs.emphasizedPassageStart) || ((this.emphasizedPassageStart != null) && (this.emphasizedPassageStart == rhs.emphasizedPassageStart)))) && ((this.emphasizedPassageEnd === rhs.emphasizedPassageEnd) || ((this.emphasizedPassageEnd != null) && (this.emphasizedPassageEnd == rhs.emphasizedPassageEnd))))
    }
}
