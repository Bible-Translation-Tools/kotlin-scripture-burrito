package org.bibletranslationtools.scriptureburrito.flavor.scripture

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import org.bibletranslationtools.scriptureburrito.flavor.FlavorSchema

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "name",
    "usfmVersion",
    "translationType",
    "audience",
    "projectType"
    
)
class ScriptureFlavorSchema: FlavorSchema() {
    @get:JsonProperty("name")
    @set:JsonProperty("name")
    @JsonProperty("name")
    override lateinit var name: String

    @get:JsonProperty("usfmVersion")
    @set:JsonProperty("usfmVersion")
    @JsonProperty("usfmVersion")
    var usfmVersion: String? = null

    @get:JsonProperty("translationType")
    @set:JsonProperty("translationType")
    @JsonProperty("translationType")
    var translationType: String? = null

    @get:JsonProperty("audience")
    @set:JsonProperty("audience")
    @JsonProperty("audience")
    var audience: String? = null

    @get:JsonProperty("projectType")
    @set:JsonProperty("projectType")
    @JsonProperty("projectType")
    var projectType: String? = null

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(ScriptureFlavorSchema::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("flavorType")
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
        if ((other is ScriptureFlavorSchema) == false) {
            return false
        }
        val rhs = other
        return ((this.name === rhs.name) || ((this.name != null) && (this.name == rhs.name)))
    }
}
