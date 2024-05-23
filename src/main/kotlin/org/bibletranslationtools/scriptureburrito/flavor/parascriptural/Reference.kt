package org.bibletranslationtools.scriptureburrito.flavor.parascriptural

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "start", "end"
)
class Reference {



    @get:JsonProperty("start")
    @set:JsonProperty("start")
    @JsonProperty("start")
    var start: Double? = null

    @get:JsonProperty("end")
    @set:JsonProperty("end")
    @JsonProperty("end")
    var end: Double? = null

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(Reference::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("start")
        sb.append('=')
        sb.append((if ((this.start == null)) "<null>" else this.start))
        sb.append(',')
        sb.append("end")
        sb.append('=')
        sb.append((if ((this.end == null)) "<null>" else this.end))
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
        result = ((result * 31) + (if ((this.start == null)) 0 else start.hashCode()))
        result = ((result * 31) + (if ((this.end == null)) 0 else end.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is Reference) == false) {
            return false
        }
        val rhs = other
        return (((this.start === rhs.start) || ((this.start != null) && start!!.equals(rhs.start))) && ((this.end === rhs.end) || ((this.end != null) && end!!.equals(
            rhs.end
        ))))
    }
}
