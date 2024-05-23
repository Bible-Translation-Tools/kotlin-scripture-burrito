package org.bibletranslationtools.scriptureburrito.flavor.parascriptural

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "user", "references"
)
class ManualAlignment {



    @get:JsonProperty("user")
    @set:JsonProperty("user")
    @JsonProperty("user")
    var user: String? = null


    @JsonProperty("references")
    private var references: List<Reference>? = ArrayList<Reference>()


    @JsonProperty("references")
    fun getReferences(): List<Reference>? {
        return references
    }


    @JsonProperty("references")
    fun setReferences(references: List<Reference>?) {
        this.references = references
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(ManualAlignment::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("user")
        sb.append('=')
        sb.append((if ((this.user == null)) "<null>" else this.user))
        sb.append(',')
        sb.append("references")
        sb.append('=')
        sb.append((if ((this.references == null)) "<null>" else this.references))
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
        result = ((result * 31) + (if ((this.references == null)) 0 else references.hashCode()))
        result = ((result * 31) + (if ((this.user == null)) 0 else user.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is ManualAlignment) == false) {
            return false
        }
        val rhs = other
        return (((this.references === rhs.references) || ((this.references != null) && (this.references == rhs.references))) && ((this.user === rhs.user) || ((this.user != null) && (this.user == rhs.user))))
    }
}
