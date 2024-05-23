package org.bibletranslationtools.scriptureburrito

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "md5", "sha3-256", "sha3-512"
)
class Checksum {



    @get:JsonProperty("md5")
    @set:JsonProperty("md5")
    @JsonProperty("md5")
    var md5: String? = null

    @get:JsonProperty("sha3-256")
    @set:JsonProperty("sha3-256")
    @JsonProperty("sha3-256")
    var sha3256: String? = null

    @get:JsonProperty("sha3-512")
    @set:JsonProperty("sha3-512")
    @JsonProperty("sha3-512")
    var sha3512: String? = null

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(Checksum::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("md5")
        sb.append('=')
        sb.append((if ((this.md5 == null)) "<null>" else this.md5))
        sb.append(',')
        sb.append("sha3256")
        sb.append('=')
        sb.append((if ((this.sha3256 == null)) "<null>" else this.sha3256))
        sb.append(',')
        sb.append("sha3512")
        sb.append('=')
        sb.append((if ((this.sha3512 == null)) "<null>" else this.sha3512))
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
        result = ((result * 31) + (if ((this.sha3512 == null)) 0 else sha3512.hashCode()))
        result = ((result * 31) + (if ((this.md5 == null)) 0 else md5.hashCode()))
        result = ((result * 31) + (if ((this.sha3256 == null)) 0 else sha3256.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is Checksum) == false) {
            return false
        }
        val rhs = other
        return ((((this.sha3512 === rhs.sha3512) || ((this.sha3512 != null) && (this.sha3512 == rhs.sha3512))) && ((this.md5 === rhs.md5) || ((this.md5 != null) && (this.md5 == rhs.md5)))) && ((this.sha3256 === rhs.sha3256) || ((this.sha3256 != null) && (this.sha3256 == rhs.sha3256))))
    }
}
