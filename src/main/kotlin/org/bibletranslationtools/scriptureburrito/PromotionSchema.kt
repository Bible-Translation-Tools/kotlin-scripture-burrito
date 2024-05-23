package org.bibletranslationtools.scriptureburrito

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyDescription
import com.fasterxml.jackson.annotation.JsonPropertyOrder


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "statementPlain", "statementRich"
)
class PromotionSchema {
    
    
    
    @get:JsonProperty("statementPlain")
    @set:JsonProperty("statementPlain")
    @JsonProperty("statementPlain")
    @JsonPropertyDescription("A textual string specified in one or multiple languages, indexed by IETF language tag.")
    var statementPlain: LocalizedText? = null
    
    
    
    @get:JsonProperty("statementRich")
    @set:JsonProperty("statementRich")
    @JsonProperty("statementRich")
    @JsonPropertyDescription("A simplified XHTML string specified in one or multiple languages, indexed by IETF language tag.")
    var statementRich: LocalizedRichText? = null

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(PromotionSchema::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("statementPlain")
        sb.append('=')
        sb.append((if ((this.statementPlain == null)) "<null>" else this.statementPlain))
        sb.append(',')
        sb.append("statementRich")
        sb.append('=')
        sb.append((if ((this.statementRich == null)) "<null>" else this.statementRich))
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
        result = ((result * 31) + (if ((this.statementPlain == null)) 0 else statementPlain.hashCode()))
        result = ((result * 31) + (if ((this.statementRich == null)) 0 else statementRich.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is PromotionSchema) == false) {
            return false
        }
        val rhs = other
        return (((this.statementPlain === rhs.statementPlain) || ((this.statementPlain != null) && (this.statementPlain == rhs.statementPlain))) && ((this.statementRich === rhs.statementRich) || ((this.statementRich != null) && (this.statementRich == rhs.statementRich))))
    }
}
