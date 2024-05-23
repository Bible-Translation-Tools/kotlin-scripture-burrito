package org.bibletranslationtools.scriptureburrito

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "noSpaceBetweenBookAndChapter",
    "chapterVerseSeparator",
    "rangeIndicator",
    "sequenceIndicator",
    "chapterRangeSeparator",
    "chapterNumberSeparator",
    "bookSequenceSeparator",
    "referenceExtraMaterial",
    "referenceFinalPunctuation",
    "bookSourceForMarkerXt",
    "bookSourceForMarkerR"
)
class ReferenceFormatSchema {
    @get:JsonProperty("noSpaceBetweenBookAndChapter")
    @set:JsonProperty("noSpaceBetweenBookAndChapter")
    @JsonProperty("noSpaceBetweenBookAndChapter")
    var noSpaceBetweenBookAndChapter: Boolean? = null

    @get:JsonProperty("chapterVerseSeparator")
    @set:JsonProperty("chapterVerseSeparator")
    @JsonProperty("chapterVerseSeparator")
    var chapterVerseSeparator: String? = null

    @get:JsonProperty("rangeIndicator")
    @set:JsonProperty("rangeIndicator")
    @JsonProperty("rangeIndicator")
    var rangeIndicator: String? = null

    @get:JsonProperty("sequenceIndicator")
    @set:JsonProperty("sequenceIndicator")
    @JsonProperty("sequenceIndicator")
    var sequenceIndicator: String? = null

    @get:JsonProperty("chapterRangeSeparator")
    @set:JsonProperty("chapterRangeSeparator")
    @JsonProperty("chapterRangeSeparator")
    var chapterRangeSeparator: String? = null

    @get:JsonProperty("chapterNumberSeparator")
    @set:JsonProperty("chapterNumberSeparator")
    @JsonProperty("chapterNumberSeparator")
    var chapterNumberSeparator: String? = null

    @get:JsonProperty("bookSequenceSeparator")
    @set:JsonProperty("bookSequenceSeparator")
    @JsonProperty("bookSequenceSeparator")
    var bookSequenceSeparator: String? = null

    @get:JsonProperty("referenceExtraMaterial")
    @set:JsonProperty("referenceExtraMaterial")
    @JsonProperty("referenceExtraMaterial")
    var referenceExtraMaterial: List<String>? = ArrayList()

    @get:JsonProperty("referenceFinalPunctuation")
    @set:JsonProperty("referenceFinalPunctuation")
    @JsonProperty("referenceFinalPunctuation")
    var referenceFinalPunctuation: String? = null

    @get:JsonProperty("bookSourceForMarkerXt")
    @set:JsonProperty("bookSourceForMarkerXt")
    @JsonProperty("bookSourceForMarkerXt")
    var bookSourceForMarkerXt: String? = null

    @get:JsonProperty("bookSourceForMarkerR")
    @set:JsonProperty("bookSourceForMarkerR")
    @JsonProperty("bookSourceForMarkerR")
    var bookSourceForMarkerR: String? = null

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(ReferenceFormatSchema::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("noSpaceBetweenBookAndChapter")
        sb.append('=')
        sb.append((if ((this.noSpaceBetweenBookAndChapter == null)) "<null>" else this.noSpaceBetweenBookAndChapter))
        sb.append(',')
        sb.append("chapterVerseSeparator")
        sb.append('=')
        sb.append((if ((this.chapterVerseSeparator == null)) "<null>" else this.chapterVerseSeparator))
        sb.append(',')
        sb.append("rangeIndicator")
        sb.append('=')
        sb.append((if ((this.rangeIndicator == null)) "<null>" else this.rangeIndicator))
        sb.append(',')
        sb.append("sequenceIndicator")
        sb.append('=')
        sb.append((if ((this.sequenceIndicator == null)) "<null>" else this.sequenceIndicator))
        sb.append(',')
        sb.append("chapterRangeSeparator")
        sb.append('=')
        sb.append((if ((this.chapterRangeSeparator == null)) "<null>" else this.chapterRangeSeparator))
        sb.append(',')
        sb.append("chapterNumberSeparator")
        sb.append('=')
        sb.append((if ((this.chapterNumberSeparator == null)) "<null>" else this.chapterNumberSeparator))
        sb.append(',')
        sb.append("bookSequenceSeparator")
        sb.append('=')
        sb.append((if ((this.bookSequenceSeparator == null)) "<null>" else this.bookSequenceSeparator))
        sb.append(',')
        sb.append("referenceExtraMaterial")
        sb.append('=')
        sb.append((if ((this.referenceExtraMaterial == null)) "<null>" else this.referenceExtraMaterial))
        sb.append(',')
        sb.append("referenceFinalPunctuation")
        sb.append('=')
        sb.append((if ((this.referenceFinalPunctuation == null)) "<null>" else this.referenceFinalPunctuation))
        sb.append(',')
        sb.append("bookSourceForMarkerXt")
        sb.append('=')
        sb.append((if ((this.bookSourceForMarkerXt == null)) "<null>" else this.bookSourceForMarkerXt))
        sb.append(',')
        sb.append("bookSourceForMarkerR")
        sb.append('=')
        sb.append((if ((this.bookSourceForMarkerR == null)) "<null>" else this.bookSourceForMarkerR))
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
        result =
            ((result * 31) + (if ((this.noSpaceBetweenBookAndChapter == null)) 0 else noSpaceBetweenBookAndChapter.hashCode()))
        result = ((result * 31) + (if ((this.chapterRangeSeparator == null)) 0 else chapterRangeSeparator.hashCode()))
        result = ((result * 31) + (if ((this.chapterNumberSeparator == null)) 0 else chapterNumberSeparator.hashCode()))
        result = ((result * 31) + (if ((this.referenceExtraMaterial == null)) 0 else referenceExtraMaterial.hashCode()))
        result = ((result * 31) + (if ((this.sequenceIndicator == null)) 0 else sequenceIndicator.hashCode()))
        result = ((result * 31) + (if ((this.bookSourceForMarkerXt == null)) 0 else bookSourceForMarkerXt.hashCode()))
        result = ((result * 31) + (if ((this.bookSequenceSeparator == null)) 0 else bookSequenceSeparator.hashCode()))
        result =
            ((result * 31) + (if ((this.referenceFinalPunctuation == null)) 0 else referenceFinalPunctuation.hashCode()))
        result = ((result * 31) + (if ((this.chapterVerseSeparator == null)) 0 else chapterVerseSeparator.hashCode()))
        result = ((result * 31) + (if ((this.rangeIndicator == null)) 0 else rangeIndicator.hashCode()))
        result = ((result * 31) + (if ((this.bookSourceForMarkerR == null)) 0 else bookSourceForMarkerR.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is ReferenceFormatSchema) == false) {
            return false
        }
        val rhs = other
        return ((((((((((((this.noSpaceBetweenBookAndChapter === rhs.noSpaceBetweenBookAndChapter) || ((this.noSpaceBetweenBookAndChapter != null) && (this.noSpaceBetweenBookAndChapter == rhs.noSpaceBetweenBookAndChapter))) && ((this.chapterRangeSeparator === rhs.chapterRangeSeparator) || ((this.chapterRangeSeparator != null) && (this.chapterRangeSeparator == rhs.chapterRangeSeparator)))) && ((this.chapterNumberSeparator === rhs.chapterNumberSeparator) || ((this.chapterNumberSeparator != null) && (this.chapterNumberSeparator == rhs.chapterNumberSeparator)))) && ((this.referenceExtraMaterial === rhs.referenceExtraMaterial) || ((this.referenceExtraMaterial != null) && (this.referenceExtraMaterial == rhs.referenceExtraMaterial)))) && ((this.sequenceIndicator === rhs.sequenceIndicator) || ((this.sequenceIndicator != null) && (this.sequenceIndicator == rhs.sequenceIndicator)))) && ((this.bookSourceForMarkerXt === rhs.bookSourceForMarkerXt) || ((this.bookSourceForMarkerXt != null) && (this.bookSourceForMarkerXt == rhs.bookSourceForMarkerXt)))) && ((this.bookSequenceSeparator === rhs.bookSequenceSeparator) || ((this.bookSequenceSeparator != null) && (this.bookSequenceSeparator == rhs.bookSequenceSeparator)))) && ((this.referenceFinalPunctuation === rhs.referenceFinalPunctuation) || ((this.referenceFinalPunctuation != null) && (this.referenceFinalPunctuation == rhs.referenceFinalPunctuation)))) && ((this.chapterVerseSeparator === rhs.chapterVerseSeparator) || ((this.chapterVerseSeparator != null) && (this.chapterVerseSeparator == rhs.chapterVerseSeparator)))) && ((this.rangeIndicator === rhs.rangeIndicator) || ((this.rangeIndicator != null) && (this.rangeIndicator == rhs.rangeIndicator)))) && ((this.bookSourceForMarkerR === rhs.bookSourceForMarkerR) || ((this.bookSourceForMarkerR != null) && (this.bookSourceForMarkerR == rhs.bookSourceForMarkerR))))
    }
}
