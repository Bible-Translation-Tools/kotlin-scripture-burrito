package org.bibletranslationtools.scriptureburrito

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "dateStarted", "dateCompleted"
)
class ProgressSchema {
    @get:JsonProperty("dateStarted")
    @set:JsonProperty("dateStarted")
    @JsonProperty("dateStarted")
    var dateStarted: String? = null

    @get:JsonProperty("dateCompleted")
    @set:JsonProperty("dateCompleted")
    @JsonProperty("dateCompleted")
    var dateCompleted: String? = null

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(ProgressSchema::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("dateStarted")
        sb.append('=')
        sb.append((if ((this.dateStarted == null)) "<null>" else this.dateStarted))
        sb.append(',')
        sb.append("dateCompleted")
        sb.append('=')
        sb.append((if ((this.dateCompleted == null)) "<null>" else this.dateCompleted))
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
        result = ((result * 31) + (if ((this.dateStarted == null)) 0 else dateStarted.hashCode()))
        result = ((result * 31) + (if ((this.dateCompleted == null)) 0 else dateCompleted.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is ProgressSchema) == false) {
            return false
        }
        val rhs = other
        return (((this.dateStarted === rhs.dateStarted) || ((this.dateStarted != null) && (this.dateStarted == rhs.dateStarted))) && ((this.dateCompleted === rhs.dateCompleted) || ((this.dateCompleted != null) && (this.dateCompleted == rhs.dateCompleted))))
    }
}
