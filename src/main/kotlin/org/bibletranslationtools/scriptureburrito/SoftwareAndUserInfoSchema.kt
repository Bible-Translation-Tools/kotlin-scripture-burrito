package org.bibletranslationtools.scriptureburrito

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyDescription
import com.fasterxml.jackson.annotation.JsonPropertyOrder


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "softwareName", "softwareVersion", "userId", "userName"
)
class SoftwareAndUserInfoSchema {
    
    
    
    @get:JsonProperty("softwareName")
    @set:JsonProperty("softwareName")
    @JsonProperty("softwareName")
    @JsonPropertyDescription("The name of the program used.")
    var softwareName: String? = null
    
    
    
    @get:JsonProperty("softwareVersion")
    @set:JsonProperty("softwareVersion")
    @JsonProperty("softwareVersion")
    @JsonPropertyDescription("The version of the program used.")
    var softwareVersion: String? = null
    
    
    
    @get:JsonProperty("userId")
    @set:JsonProperty("userId")
    @JsonProperty("userId")
    @JsonPropertyDescription("Opaque system-specific identifier, prefixed with the name of the system as declared in idAuthorities.")
    var userId: String? = null
    
    
    
    @get:JsonProperty("userName")
    @set:JsonProperty("userName")
    @JsonProperty("userName")
    @JsonPropertyDescription("The user's full name, if known.")
    var userName: String? = null

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(SoftwareAndUserInfoSchema::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("softwareName")
        sb.append('=')
        sb.append((if ((this.softwareName == null)) "<null>" else this.softwareName))
        sb.append(',')
        sb.append("softwareVersion")
        sb.append('=')
        sb.append((if ((this.softwareVersion == null)) "<null>" else this.softwareVersion))
        sb.append(',')
        sb.append("userId")
        sb.append('=')
        sb.append((if ((this.userId == null)) "<null>" else this.userId))
        sb.append(',')
        sb.append("userName")
        sb.append('=')
        sb.append((if ((this.userName == null)) "<null>" else this.userName))
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
        result = ((result * 31) + (if ((this.softwareName == null)) 0 else softwareName.hashCode()))
        result = ((result * 31) + (if ((this.userName == null)) 0 else userName.hashCode()))
        result = ((result * 31) + (if ((this.userId == null)) 0 else userId.hashCode()))
        result = ((result * 31) + (if ((this.softwareVersion == null)) 0 else softwareVersion.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is SoftwareAndUserInfoSchema) == false) {
            return false
        }
        val rhs = other
        return (((((this.softwareName === rhs.softwareName) || ((this.softwareName != null) && (this.softwareName == rhs.softwareName))) && ((this.userName === rhs.userName) || ((this.userName != null) && (this.userName == rhs.userName)))) && ((this.userId === rhs.userId) || ((this.userId != null) && (this.userId == rhs.userId)))) && ((this.softwareVersion === rhs.softwareVersion) || ((this.softwareVersion != null) && (this.softwareVersion == rhs.softwareVersion))))
    }
}
