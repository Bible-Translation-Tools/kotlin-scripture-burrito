package org.bibletranslationtools.scriptureburrito.flavor.scripture.print

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "top", "bottom", "inside", "outside"
)
class EdgeSpace {
    @get:JsonProperty("top")
    @set:JsonProperty("top")
    @JsonProperty("top")
    var top: String? = null

    @get:JsonProperty("bottom")
    @set:JsonProperty("bottom")
    @JsonProperty("bottom")
    var bottom: String? = null

    @get:JsonProperty("inside")
    @set:JsonProperty("inside")
    @JsonProperty("inside")
    var inside: String? = null

    @get:JsonProperty("outside")
    @set:JsonProperty("outside")
    @JsonProperty("outside")
    var outside: String? = null

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(EdgeSpace::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("top")
        sb.append('=')
        sb.append((if ((this.top == null)) "<null>" else this.top))
        sb.append(',')
        sb.append("bottom")
        sb.append('=')
        sb.append((if ((this.bottom == null)) "<null>" else this.bottom))
        sb.append(',')
        sb.append("inside")
        sb.append('=')
        sb.append((if ((this.inside == null)) "<null>" else this.inside))
        sb.append(',')
        sb.append("outside")
        sb.append('=')
        sb.append((if ((this.outside == null)) "<null>" else this.outside))
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
        result = ((result * 31) + (if ((this.top == null)) 0 else top.hashCode()))
        result = ((result * 31) + (if ((this.inside == null)) 0 else inside.hashCode()))
        result = ((result * 31) + (if ((this.bottom == null)) 0 else bottom.hashCode()))
        result = ((result * 31) + (if ((this.outside == null)) 0 else outside.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is EdgeSpace) == false) {
            return false
        }
        val rhs = other
        return (((((this.top === rhs.top) || ((this.top != null) && (this.top == rhs.top))) && ((this.inside === rhs.inside) || ((this.inside != null) && (this.inside == rhs.inside)))) && ((this.bottom === rhs.bottom) || ((this.bottom != null) && (this.bottom == rhs.bottom)))) && ((this.outside === rhs.outside) || ((this.outside != null) && (this.outside == rhs.outside))))
    }
}
