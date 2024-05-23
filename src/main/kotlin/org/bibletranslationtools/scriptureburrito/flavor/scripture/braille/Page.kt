package org.bibletranslationtools.scriptureburrito.flavor.scripture.braille

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "charsPerLine", "linesPerPage", "defaultMarginWidth", "versoLastLineBlank", "carryLines"
)
class Page {



    @get:JsonProperty("charsPerLine")
    @set:JsonProperty("charsPerLine")
    @JsonProperty("charsPerLine")
    var charsPerLine: Double? = null



    @get:JsonProperty("linesPerPage")
    @set:JsonProperty("linesPerPage")
    @JsonProperty("linesPerPage")
    var linesPerPage: Double? = null



    @get:JsonProperty("defaultMarginWidth")
    @set:JsonProperty("defaultMarginWidth")
    @JsonProperty("defaultMarginWidth")
    var defaultMarginWidth: Double? = null



    @get:JsonProperty("versoLastLineBlank")
    @set:JsonProperty("versoLastLineBlank")
    @JsonProperty("versoLastLineBlank")
    var versoLastLineBlank: Boolean? = null



    @get:JsonProperty("carryLines")
    @set:JsonProperty("carryLines")
    @JsonProperty("carryLines")
    var carryLines: Double? = null

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(Page::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("charsPerLine")
        sb.append('=')
        sb.append((if ((this.charsPerLine == null)) "<null>" else this.charsPerLine))
        sb.append(',')
        sb.append("linesPerPage")
        sb.append('=')
        sb.append((if ((this.linesPerPage == null)) "<null>" else this.linesPerPage))
        sb.append(',')
        sb.append("defaultMarginWidth")
        sb.append('=')
        sb.append((if ((this.defaultMarginWidth == null)) "<null>" else this.defaultMarginWidth))
        sb.append(',')
        sb.append("versoLastLineBlank")
        sb.append('=')
        sb.append((if ((this.versoLastLineBlank == null)) "<null>" else this.versoLastLineBlank))
        sb.append(',')
        sb.append("carryLines")
        sb.append('=')
        sb.append((if ((this.carryLines == null)) "<null>" else this.carryLines))
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
        result = ((result * 31) + (if ((this.versoLastLineBlank == null)) 0 else versoLastLineBlank.hashCode()))
        result = ((result * 31) + (if ((this.linesPerPage == null)) 0 else linesPerPage.hashCode()))
        result = ((result * 31) + (if ((this.charsPerLine == null)) 0 else charsPerLine.hashCode()))
        result = ((result * 31) + (if ((this.defaultMarginWidth == null)) 0 else defaultMarginWidth.hashCode()))
        result = ((result * 31) + (if ((this.carryLines == null)) 0 else carryLines.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is Page) == false) {
            return false
        }
        val rhs = other
        return ((((((this.versoLastLineBlank === rhs.versoLastLineBlank) || ((this.versoLastLineBlank != null) && (this.versoLastLineBlank == rhs.versoLastLineBlank))) && ((this.linesPerPage === rhs.linesPerPage) || ((this.linesPerPage != null) && linesPerPage!!.equals(
            rhs.linesPerPage
        )))) && ((this.charsPerLine === rhs.charsPerLine) || ((this.charsPerLine != null) && charsPerLine!!.equals(rhs.charsPerLine)))) && ((this.defaultMarginWidth === rhs.defaultMarginWidth) || ((this.defaultMarginWidth != null) && defaultMarginWidth!!.equals(
            rhs.defaultMarginWidth
        )))) && ((this.carryLines === rhs.carryLines) || ((this.carryLines != null) && carryLines!!.equals(rhs.carryLines))))
    }
}
