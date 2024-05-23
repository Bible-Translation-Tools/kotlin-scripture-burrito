package org.bibletranslationtools.scriptureburrito.flavor

import com.fasterxml.jackson.annotation.*
import org.bibletranslationtools.scriptureburrito.Flavor
import org.bibletranslationtools.scriptureburrito.ScopeSchema

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "name",
    "flavor",
    "currentScope"
)
class FlavorType(
    @get:JsonProperty("name")
    @set:JsonProperty("name")
    @JsonProperty("name")
    var name: Flavor
) {

    @get:JsonProperty("flavor")
    @set:JsonProperty("flavor")
    @JsonProperty("flavor")
    var flavor: FlavorSchema? = null

    @get:JsonProperty("currentScope")
    @set:JsonProperty("currentScope")
    @JsonProperty("currentScope")
    var currentScope: ScopeSchema? = null

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(FlavorType::class.java.name).append('@').append(
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
        if ((other is FlavorType) == false) {
            return false
        }
        val rhs = other
        return ((this.name == rhs.name) || ((this.name != null) && (this.name == rhs.name)))
    }

}