package org.bibletranslationtools.scriptureburrito

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyDescription
import com.fasterxml.jackson.annotation.JsonPropertyOrder


class TargetAreas: ArrayList<org.bibletranslationtools.scriptureburrito.TargetAreaSchema>()

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "code", "name"
)
class TargetAreaSchema {



    @get:JsonProperty("code")
    @set:JsonProperty("code")
    @JsonProperty("code")
    var code: Any? = null
    
    
    
    @get:JsonProperty("name")
    @set:JsonProperty("name")
    @JsonProperty("name")
    @JsonPropertyDescription("A textual string specified in one or multiple languages, indexed by IETF language tag.")
    var name: org.bibletranslationtools.scriptureburrito.LocalizedText? = null

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(org.bibletranslationtools.scriptureburrito.TargetAreaSchema::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("code")
        sb.append('=')
        sb.append((if ((this.code == null)) "<null>" else this.code))
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
        result = ((result * 31) + (if ((this.code == null)) 0 else code.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is org.bibletranslationtools.scriptureburrito.TargetAreaSchema) == false) {
            return false
        }
        val rhs = other
        return (((this.name === rhs.name) || ((this.name != null) && (this.name == rhs.name))) && ((this.code === rhs.code) || ((this.code != null) && (this.code == rhs.code))))
    }
}
