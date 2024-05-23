package org.bibletranslationtools.scriptureburrito

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyDescription
import com.fasterxml.jackson.annotation.JsonPropertyOrder


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "licenses", "publicDomain", "shortStatements"
)
class CopyrightSchema {

    @get:JsonProperty("licenses")
    @set:JsonProperty("licenses")
    @JsonProperty("licenses")
    @JsonPropertyDescription("The licenses, which state under which terms the burrito may be used, can be specified either as URL or as path to an ingredient.")
    var licenses: List<License>? = ArrayList()
    
    
    
    @get:JsonProperty("publicDomain")
    @set:JsonProperty("publicDomain")
    @JsonProperty("publicDomain")
    @JsonPropertyDescription("If set to true, the contents of this burrito are in the public domain.")
    var publicDomain: Boolean? = null
    
    
    
    @get:JsonProperty("shortStatements")
    @set:JsonProperty("shortStatements")
    @JsonProperty("shortStatements")
    @JsonPropertyDescription("A short statement to explain the copyright / license information to readers")
    var shortStatements: List<ShortStatement> = ArrayList()

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(CopyrightSchema::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("licenses")
        sb.append('=')
        sb.append((if ((this.licenses == null)) "<null>" else this.licenses))
        sb.append(',')
        sb.append("publicDomain")
        sb.append('=')
        sb.append((if ((this.publicDomain == null)) "<null>" else this.publicDomain))
        sb.append(',')
        sb.append("shortStatements")
        sb.append('=')
        sb.append((if ((this.shortStatements == null)) "<null>" else this.shortStatements))
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
        result = ((result * 31) + (if ((this.licenses == null)) 0 else licenses.hashCode()))
        result = ((result * 31) + (if ((this.publicDomain == null)) 0 else publicDomain.hashCode()))
        result = ((result * 31) + (if ((this.shortStatements == null)) 0 else shortStatements.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is CopyrightSchema) == false) {
            return false
        }
        val rhs = other
        return ((((this.licenses === rhs.licenses) || ((this.licenses != null) && (this.licenses == rhs.licenses))) && ((this.publicDomain === rhs.publicDomain) || ((this.publicDomain != null) && (this.publicDomain == rhs.publicDomain)))) && ((this.shortStatements === rhs.shortStatements) || ((this.shortStatements != null) && (this.shortStatements == rhs.shortStatements))))
    }
}
