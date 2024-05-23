package org.bibletranslationtools.scriptureburrito

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "idAuthority", "operation", "data"
)
class RecipeSchema(
    @get:JsonProperty("idAuthority")
    @set:JsonProperty("idAuthority")
    @JsonProperty("idAuthority")
    var idAuthority: String,

    @get:JsonProperty("operation")
    @set:JsonProperty("operation")
    @JsonProperty("operation")
    var operation: String,

    @get:JsonProperty("data")
    @set:JsonProperty("data")
    @JsonProperty("data")
    var data: Data
) {
    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(RecipeSchema::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("idAuthority")
        sb.append('=')
        sb.append((if ((this.idAuthority == null)) "<null>" else this.idAuthority))
        sb.append(',')
        sb.append("operation")
        sb.append('=')
        sb.append((if ((this.operation == null)) "<null>" else this.operation))
        sb.append(',')
        sb.append("data")
        sb.append('=')
        sb.append((if ((this.data == null)) "<null>" else this.data))
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
        result = ((result * 31) + (if ((this.data == null)) 0 else data.hashCode()))
        result = ((result * 31) + (if ((this.operation == null)) 0 else operation.hashCode()))
        result = ((result * 31) + (if ((this.idAuthority == null)) 0 else idAuthority.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is RecipeSchema) == false) {
            return false
        }
        val rhs = other
        return ((((this.data === rhs.data) || ((this.data != null) && (this.data == rhs.data))) && ((this.operation === rhs.operation) || ((this.operation != null) && (this.operation == rhs.operation)))) && ((this.idAuthority === rhs.idAuthority) || ((this.idAuthority != null) && (this.idAuthority == rhs.idAuthority))))
    }
}
