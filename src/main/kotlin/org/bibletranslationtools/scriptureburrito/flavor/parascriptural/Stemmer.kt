package org.bibletranslationtools.scriptureburrito.flavor.parascriptural

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "name", "version", "affixes"
)
class Stemmer {
    @get:JsonProperty("name")
    @set:JsonProperty("name")
    @JsonProperty("name")
    var name: String? = null

    @get:JsonProperty("version")
    @set:JsonProperty("version")
    @JsonProperty("version")
    var version: String? = null

    @get:JsonProperty("affixes")
    @set:JsonProperty("affixes")
    @JsonProperty("affixes")
    var affixes: Boolean? = null

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(Stemmer::class.java.name).append('@').append(
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
        sb.append("version")
        sb.append('=')
        sb.append((if ((this.version == null)) "<null>" else this.version))
        sb.append(',')
        sb.append("affixes")
        sb.append('=')
        sb.append((if ((this.affixes == null)) "<null>" else this.affixes))
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
        result = ((result * 31) + (if ((this.version == null)) 0 else version.hashCode()))
        result = ((result * 31) + (if ((this.affixes == null)) 0 else affixes.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is Stemmer) == false) {
            return false
        }
        val rhs = other
        return ((((this.name === rhs.name) || ((this.name != null) && (this.name == rhs.name))) && ((this.version === rhs.version) || ((this.version != null) && (this.version == rhs.version)))) && ((this.affixes === rhs.affixes) || ((this.affixes != null) && (this.affixes == rhs.affixes))))
    }
}
