package org.bibletranslationtools.scriptureburrito.flavor.scripture.braille

import com.fasterxml.jackson.annotation.*

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "lineIndicatorSpaced", "startIndicator", "lineIndicator", "endIndicator"
)
class ContinuousPoetry {



    @get:JsonProperty("lineIndicatorSpaced")
    @set:JsonProperty("lineIndicatorSpaced")
    @JsonProperty("lineIndicatorSpaced")
    var lineIndicatorSpaced: LineIndicatorSpaced? = null

    @get:JsonProperty("startIndicator")
    @set:JsonProperty("startIndicator")
    @JsonProperty("startIndicator")
    var startIndicator: String? = null

    @get:JsonProperty("lineIndicator")
    @set:JsonProperty("lineIndicator")
    @JsonProperty("lineIndicator")
    var lineIndicator: String? = null

    @get:JsonProperty("endIndicator")
    @set:JsonProperty("endIndicator")
    @JsonProperty("endIndicator")
    var endIndicator: String? = null

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(ContinuousPoetry::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("lineIndicatorSpaced")
        sb.append('=')
        sb.append((if ((this.lineIndicatorSpaced == null)) "<null>" else this.lineIndicatorSpaced))
        sb.append(',')
        sb.append("startIndicator")
        sb.append('=')
        sb.append((if ((this.startIndicator == null)) "<null>" else this.startIndicator))
        sb.append(',')
        sb.append("lineIndicator")
        sb.append('=')
        sb.append((if ((this.lineIndicator == null)) "<null>" else this.lineIndicator))
        sb.append(',')
        sb.append("endIndicator")
        sb.append('=')
        sb.append((if ((this.endIndicator == null)) "<null>" else this.endIndicator))
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
        result = ((result * 31) + (if ((this.lineIndicator == null)) 0 else lineIndicator.hashCode()))
        result = ((result * 31) + (if ((this.endIndicator == null)) 0 else endIndicator.hashCode()))
        result = ((result * 31) + (if ((this.lineIndicatorSpaced == null)) 0 else lineIndicatorSpaced.hashCode()))
        result = ((result * 31) + (if ((this.startIndicator == null)) 0 else startIndicator.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is ContinuousPoetry) == false) {
            return false
        }
        val rhs = other
        return (((((this.lineIndicator === rhs.lineIndicator) || ((this.lineIndicator != null) && (this.lineIndicator == rhs.lineIndicator))) && ((this.endIndicator === rhs.endIndicator) || ((this.endIndicator != null) && (this.endIndicator == rhs.endIndicator)))) && ((this.lineIndicatorSpaced == rhs.lineIndicatorSpaced) || ((this.lineIndicatorSpaced != null) && (this.lineIndicatorSpaced == rhs.lineIndicatorSpaced)))) && ((this.startIndicator === rhs.startIndicator) || ((this.startIndicator != null) && (this.startIndicator == rhs.startIndicator))))
    }

    enum class LineIndicatorSpaced(private val value: String) {
        NEVER("never"),
        ALWAYS("always"),
        SOMETIMES("sometimes");

        override fun toString(): String {
            return this.value
        }

        @JsonValue
        fun value(): String {
            return this.value
        }

        companion object {
            private val CONSTANTS: MutableMap<String, LineIndicatorSpaced> = HashMap()

            init {
                for (c in values()) {
                    CONSTANTS[c.value] = c
                }
            }

            @JsonCreator
            fun fromValue(value: String): LineIndicatorSpaced {
                val constant = CONSTANTS[value]
                requireNotNull(constant) { value }
                return constant
            }
        }
    }
}
