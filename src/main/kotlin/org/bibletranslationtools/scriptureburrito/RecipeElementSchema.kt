package org.bibletranslationtools.scriptureburrito

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyDescription
import com.fasterxml.jackson.annotation.JsonPropertyOrder


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "type", "nameId", "ingredient"
)
class RecipeElementSchema {



    @get:JsonProperty("type")
    @set:JsonProperty("type")
    @JsonProperty("type")
    var type: Any? = null
    
    
    
    @get:JsonProperty("nameId")
    @set:JsonProperty("nameId")
    @JsonProperty("nameId")
    @JsonPropertyDescription("Opaque system-specific identifier, without prefix.")
    var nameId: String? = null
    
    
    
    @get:JsonProperty("ingredient")
    @set:JsonProperty("ingredient")
    @JsonProperty("ingredient")
    @JsonPropertyDescription("A file path, delimited by forward slashes.")
    var ingredient: String? = null

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(RecipeElementSchema::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("type")
        sb.append('=')
        sb.append((if ((this.type == null)) "<null>" else this.type))
        sb.append(',')
        sb.append("nameId")
        sb.append('=')
        sb.append((if ((this.nameId == null)) "<null>" else this.nameId))
        sb.append(',')
        sb.append("ingredient")
        sb.append('=')
        sb.append((if ((this.ingredient == null)) "<null>" else this.ingredient))
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
        result = ((result * 31) + (if ((this.type == null)) 0 else type.hashCode()))
        result = ((result * 31) + (if ((this.nameId == null)) 0 else nameId.hashCode()))
        result = ((result * 31) + (if ((this.ingredient == null)) 0 else ingredient.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is RecipeElementSchema) == false) {
            return false
        }
        val rhs = other
        return ((((this.type === rhs.type) || ((this.type != null) && (this.type == rhs.type))) && ((this.nameId === rhs.nameId) || ((this.nameId != null) && (this.nameId == rhs.nameId)))) && ((this.ingredient === rhs.ingredient) || ((this.ingredient != null) && (this.ingredient == rhs.ingredient))))
    }
}
