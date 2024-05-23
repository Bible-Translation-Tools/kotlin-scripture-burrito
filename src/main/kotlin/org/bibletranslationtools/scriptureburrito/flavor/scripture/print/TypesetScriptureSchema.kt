package org.bibletranslationtools.scriptureburrito.flavor.scripture.print

import com.fasterxml.jackson.annotation.*
import org.bibletranslationtools.scriptureburrito.flavor.scripture.Conventions

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "name",
    "contentType",
    "pod",
    "pageCount",
    "width",
    "height",
    "scale",
    "orientation",
    "colorSpace",
    "edgeSpace",
    "fonts",
    "conventions"
)
class TypesetScriptureSchema {

    @get:JsonProperty("name")
    @set:JsonProperty("name")
    @JsonProperty("name")
    var name: String? = null



    @get:JsonProperty("contentType")
    @set:JsonProperty("contentType")
    @JsonProperty("contentType")
    var contentType: String? = null



    @get:JsonProperty("pod")
    @set:JsonProperty("pod")
    @JsonProperty("pod")
    var pod: Boolean? = null



    @get:JsonProperty("pageCount")
    @set:JsonProperty("pageCount")
    @JsonProperty("pageCount")
    var pageCount: Int? = null



    @get:JsonProperty("width")
    @set:JsonProperty("width")
    @JsonProperty("width")
    var width: String? = null



    @get:JsonProperty("height")
    @set:JsonProperty("height")
    @JsonProperty("height")
    var height: String? = null



    @get:JsonProperty("scale")
    @set:JsonProperty("scale")
    @JsonProperty("scale")
    var scale: String? = null

    @get:JsonProperty("orientation")
    @set:JsonProperty("orientation")
    @JsonProperty("orientation")
    var orientation: Orientation? = null



    @get:JsonProperty("colorSpace")
    @set:JsonProperty("colorSpace")
    @JsonProperty("colorSpace")
    var colorSpace: ColorSpace? = null

    @JsonProperty("edgeSpace")
    private var edgeSpace: EdgeSpace? = null

    @get:JsonProperty("fonts")
    @set:JsonProperty("fonts")
    @JsonProperty("fonts")
    var fonts: List<String>? = ArrayList()

    @JsonProperty("conventions")
    private var conventions: org.bibletranslationtools.scriptureburrito.flavor.scripture.Conventions? = null

    @JsonProperty("edgeSpace")
    fun getEdgeSpace(): EdgeSpace? {
        return edgeSpace
    }

    @JsonProperty("edgeSpace")
    fun setEdgeSpace(edgeSpace: EdgeSpace?) {
        this.edgeSpace = edgeSpace
    }

    @JsonProperty("conventions")
    fun getConventions(): org.bibletranslationtools.scriptureburrito.flavor.scripture.Conventions? {
        return conventions
    }

    @JsonProperty("conventions")
    fun setConventions(conventions: org.bibletranslationtools.scriptureburrito.flavor.scripture.Conventions?) {
        this.conventions = conventions
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(TypesetScriptureSchema::class.java.name).append('@').append(
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
        sb.append("contentType")
        sb.append('=')
        sb.append((if ((this.contentType == null)) "<null>" else this.contentType))
        sb.append(',')
        sb.append("pod")
        sb.append('=')
        sb.append((if ((this.pod == null)) "<null>" else this.pod))
        sb.append(',')
        sb.append("pageCount")
        sb.append('=')
        sb.append((if ((this.pageCount == null)) "<null>" else this.pageCount))
        sb.append(',')
        sb.append("width")
        sb.append('=')
        sb.append((if ((this.width == null)) "<null>" else this.width))
        sb.append(',')
        sb.append("height")
        sb.append('=')
        sb.append((if ((this.height == null)) "<null>" else this.height))
        sb.append(',')
        sb.append("scale")
        sb.append('=')
        sb.append((if ((this.scale == null)) "<null>" else this.scale))
        sb.append(',')
        sb.append("orientation")
        sb.append('=')
        sb.append((if ((this.orientation == null)) "<null>" else this.orientation))
        sb.append(',')
        sb.append("colorSpace")
        sb.append('=')
        sb.append((if ((this.colorSpace == null)) "<null>" else this.colorSpace))
        sb.append(',')
        sb.append("edgeSpace")
        sb.append('=')
        sb.append((if ((this.edgeSpace == null)) "<null>" else this.edgeSpace))
        sb.append(',')
        sb.append("fonts")
        sb.append('=')
        sb.append((if ((this.fonts == null)) "<null>" else this.fonts))
        sb.append(',')
        sb.append("conventions")
        sb.append('=')
        sb.append((if ((this.conventions == null)) "<null>" else this.conventions))
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
        result = ((result * 31) + (if ((this.colorSpace == null)) 0 else colorSpace.hashCode()))
        result = ((result * 31) + (if ((this.pageCount == null)) 0 else pageCount.hashCode()))
        result = ((result * 31) + (if ((this.orientation == null)) 0 else orientation.hashCode()))
        result = ((result * 31) + (if ((this.pod == null)) 0 else pod.hashCode()))
        result = ((result * 31) + (if ((this.fonts == null)) 0 else fonts.hashCode()))
        result = ((result * 31) + (if ((this.name == null)) 0 else name.hashCode()))
        result = ((result * 31) + (if ((this.width == null)) 0 else width.hashCode()))
        result = ((result * 31) + (if ((this.conventions == null)) 0 else conventions.hashCode()))
        result = ((result * 31) + (if ((this.scale == null)) 0 else scale.hashCode()))
        result = ((result * 31) + (if ((this.contentType == null)) 0 else contentType.hashCode()))
        result = ((result * 31) + (if ((this.height == null)) 0 else height.hashCode()))
        result = ((result * 31) + (if ((this.edgeSpace == null)) 0 else edgeSpace.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is TypesetScriptureSchema) == false) {
            return false
        }
        val rhs = other
        return (((((((((((((this.colorSpace == rhs.colorSpace) || ((this.colorSpace != null) && (this.colorSpace == rhs.colorSpace))) && ((this.pageCount === rhs.pageCount) || ((this.pageCount != null) && (this.pageCount == rhs.pageCount)))) && ((this.orientation == rhs.orientation) || ((this.orientation != null) && (this.orientation == rhs.orientation)))) && ((this.pod === rhs.pod) || ((this.pod != null) && (this.pod == rhs.pod)))) && ((this.fonts === rhs.fonts) || ((this.fonts != null) && (this.fonts == rhs.fonts)))) && ((this.name === rhs.name) || ((this.name != null) && (this.name == rhs.name)))) && ((this.width === rhs.width) || ((this.width != null) && (this.width == rhs.width)))) && ((this.conventions === rhs.conventions) || ((this.conventions != null) && conventions?.equals(
            rhs.conventions
        ) == true))) && ((this.scale === rhs.scale) || ((this.scale != null) && (this.scale == rhs.scale)))) && ((this.contentType === rhs.contentType) || ((this.contentType != null) && (this.contentType == rhs.contentType)))) && ((this.height === rhs.height) || ((this.height != null) && (this.height == rhs.height)))) && ((this.edgeSpace === rhs.edgeSpace) || ((this.edgeSpace != null) && edgeSpace?.equals(
            rhs.edgeSpace
        ) == true)))
    }

    enum class ColorSpace(private val value: String) {
        CMYK("cmyk"),
        RGB("rgb");

        override fun toString(): String {
            return this.value
        }

        @JsonValue
        fun value(): String {
            return this.value
        }

        companion object {
            private val CONSTANTS: MutableMap<String, ColorSpace> = HashMap()

            init {
                for (c in values()) {
                    CONSTANTS[c.value] = c
                }
            }

            @JsonCreator
            fun fromValue(value: String): ColorSpace {
                val constant = CONSTANTS[value]
                requireNotNull(constant) { value }
                return constant
            }
        }
    }

    enum class Orientation(private val value: String) {
        PORTRAIT("portrait"),
        LANDSCAPE("landscape");

        override fun toString(): String {
            return this.value
        }

        @JsonValue
        fun value(): String {
            return this.value
        }

        companion object {
            private val CONSTANTS: MutableMap<String, Orientation> = HashMap()

            init {
                for (c in values()) {
                    CONSTANTS[c.value] = c
                }
            }

            @JsonCreator
            fun fromValue(value: String): Orientation {
                val constant = CONSTANTS[value]
                requireNotNull(constant) { value }
                return constant
            }
        }
    }
}
