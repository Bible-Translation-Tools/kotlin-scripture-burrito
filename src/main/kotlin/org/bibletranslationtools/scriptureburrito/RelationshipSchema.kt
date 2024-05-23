package org.bibletranslationtools.scriptureburrito

import com.fasterxml.jackson.annotation.*


class Relationships: ArrayList<RelationshipSchema>()

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "relationType", "flavor", "id", "revision", "variant"
)
class RelationshipSchema {



    @get:JsonProperty("relationType")
    @set:JsonProperty("relationType")
    @JsonProperty("relationType")
    var relationType: RelationType? = null



    @get:JsonProperty("flavor")
    @set:JsonProperty("flavor")
    @JsonProperty("flavor")
    var flavor: String? = null
    
    
    
    @get:JsonProperty("id")
    @set:JsonProperty("id")
    @JsonProperty("id")
    @JsonPropertyDescription("Opaque system-specific identifier, prefixed with the name of the system as declared in idAuthorities.")
    var id: String? = null
    
    
    
    @get:JsonProperty("revision")
    @set:JsonProperty("revision")
    @JsonProperty("revision")
    @JsonPropertyDescription("Opaque system-specific revision identifier.")
    var revision: String? = null

    @get:JsonProperty("variant")
    @set:JsonProperty("variant")
    @JsonProperty("variant")
    var variant: String? = null

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(RelationshipSchema::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("relationType")
        sb.append('=')
        sb.append((if ((this.relationType == null)) "<null>" else this.relationType))
        sb.append(',')
        sb.append("flavor")
        sb.append('=')
        sb.append((if ((this.flavor == null)) "<null>" else this.flavor))
        sb.append(',')
        sb.append("id")
        sb.append('=')
        sb.append((if ((this.id == null)) "<null>" else this.id))
        sb.append(',')
        sb.append("revision")
        sb.append('=')
        sb.append((if ((this.revision == null)) "<null>" else this.revision))
        sb.append(',')
        sb.append("variant")
        sb.append('=')
        sb.append((if ((this.variant == null)) "<null>" else this.variant))
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
        result = ((result * 31) + (if ((this.relationType == null)) 0 else relationType.hashCode()))
        result = ((result * 31) + (if ((this.flavor == null)) 0 else flavor.hashCode()))
        result = ((result * 31) + (if ((this.variant == null)) 0 else variant.hashCode()))
        result = ((result * 31) + (if ((this.id == null)) 0 else id.hashCode()))
        result = ((result * 31) + (if ((this.revision == null)) 0 else revision.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is RelationshipSchema) == false) {
            return false
        }
        val rhs = other
        return ((((((this.relationType == rhs.relationType) || ((this.relationType != null) && (this.relationType == rhs.relationType))) && ((this.flavor === rhs.flavor) || ((this.flavor != null) && (this.flavor == rhs.flavor)))) && ((this.variant === rhs.variant) || ((this.variant != null) && (this.variant == rhs.variant)))) && ((this.id === rhs.id) || ((this.id != null) && (this.id == rhs.id)))) && ((this.revision === rhs.revision) || ((this.revision != null) && (this.revision == rhs.revision))))
    }

    enum class RelationType(private val value: String) {
        SOURCE("source"),
        TARGET("target"),
        EXPRESSION("expression"),
        PARASCRIPTURAL("parascriptural"),
        PERIPHERAL("peripheral");

        override fun toString(): String {
            return this.value
        }

        @JsonValue
        fun value(): String {
            return this.value
        }

        companion object {
            private val CONSTANTS: MutableMap<String, RelationType> = HashMap()

            init {
                for (c in values()) {
                    CONSTANTS[c.value] = c
                }
            }

            @JsonCreator
            fun fromValue(value: String): RelationType {
                val constant = CONSTANTS[value]
                requireNotNull(constant) { value }
                return constant
            }
        }
    }
}
