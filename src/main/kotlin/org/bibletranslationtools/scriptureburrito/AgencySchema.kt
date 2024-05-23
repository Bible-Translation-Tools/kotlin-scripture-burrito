package org.bibletranslationtools.scriptureburrito

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyDescription
import com.fasterxml.jackson.annotation.JsonPropertyOrder


class Agencies: ArrayList<AgencySchema>()

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "id", "name", "abbr", "url", "roles"
)
class AgencySchema(
    @get:JsonProperty("id")
    @set:JsonProperty("id")
    @JsonProperty("id")
    @JsonPropertyDescription("Opaque system-specific identifier, prefixed with the name of the system as declared in idAuthorities.")
    var id: String,

    @get:JsonProperty("name")
    @set:JsonProperty("name")
    @JsonProperty("name")
    @JsonPropertyDescription("A textual string specified in one or multiple languages, indexed by IETF language tag.")
    var name: LocalizedText,

    @get:JsonProperty("roles")
    @set:JsonProperty("roles")
    @JsonProperty("roles")
    @JsonPropertyDescription("A list of roles indicating in which respects this agency was involved with the production of this burrito.")
    var roles: List<Role>? = ArrayList()
) {
    @get:JsonProperty("abbr")
    @set:JsonProperty("abbr")
    @JsonProperty("abbr")
    @JsonPropertyDescription("A textual string specified in one or multiple languages, indexed by IETF language tag.")
    var abbr: LocalizedText? = null

    @get:JsonProperty("url")
    @set:JsonProperty("url")
    @JsonProperty("url")
    @JsonPropertyDescription("A valid **Uniform Resource Locator**.")
    var url: String? = null

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(AgencySchema::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("id")
        sb.append('=')
        sb.append((if ((this.id == null)) "<null>" else this.id))
        sb.append(',')
        sb.append("name")
        sb.append('=')
        sb.append((if ((this.name == null)) "<null>" else this.name))
        sb.append(',')
        sb.append("abbr")
        sb.append('=')
        sb.append((if ((this.abbr == null)) "<null>" else this.abbr))
        sb.append(',')
        sb.append("url")
        sb.append('=')
        sb.append((if ((this.url == null)) "<null>" else this.url))
        sb.append(',')
        sb.append("roles")
        sb.append('=')
        sb.append((if ((this.roles == null)) "<null>" else this.roles))
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
        result = ((result * 31) + (if ((this.id == null)) 0 else id.hashCode()))
        result = ((result * 31) + (if ((this.abbr == null)) 0 else abbr.hashCode()))
        result = ((result * 31) + (if ((this.url == null)) 0 else url.hashCode()))
        result = ((result * 31) + (if ((this.roles == null)) 0 else roles.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is AgencySchema) == false) {
            return false
        }
        val rhs = other
        return ((((((this.name === rhs.name) || ((this.name != null) && (this.name == rhs.name))) && ((this.id === rhs.id) || ((this.id != null) && (this.id == rhs.id)))) && ((this.abbr === rhs.abbr) || ((this.abbr != null) && (this.abbr == rhs.abbr)))) && ((this.url === rhs.url) || ((this.url != null) && (this.url == rhs.url)))) && ((this.roles === rhs.roles) || ((this.roles != null) && (this.roles == rhs.roles))))
    }
}
