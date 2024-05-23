package org.bibletranslationtools.scriptureburrito.flavor.scripture.braille

import com.fasterxml.jackson.annotation.*

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "chapterNumberStyle",
    "chapterHeadingsNumberFirst",
    "versedParagraphs",
    "verseSeparator",
    "includeIntros",
    "footnotes",
    "characterStyles",
    "crossReferences"
)
class Content {

    @get:JsonProperty("chapterNumberStyle")
    @set:JsonProperty("chapterNumberStyle")
    @JsonProperty("chapterNumberStyle")
    var chapterNumberStyle: ChapterNumberStyle? = null



    @get:JsonProperty("chapterHeadingsNumberFirst")
    @set:JsonProperty("chapterHeadingsNumberFirst")
    @JsonProperty("chapterHeadingsNumberFirst")
    var chapterHeadingsNumberFirst: Boolean? = null



    @get:JsonProperty("versedParagraphs")
    @set:JsonProperty("versedParagraphs")
    @JsonProperty("versedParagraphs")
    var versedParagraphs: Boolean? = null



    @get:JsonProperty("verseSeparator")
    @set:JsonProperty("verseSeparator")
    @JsonProperty("verseSeparator")
    var verseSeparator: String? = null



    @get:JsonProperty("includeIntros")
    @set:JsonProperty("includeIntros")
    @JsonProperty("includeIntros")
    var includeIntros: Boolean? = null

    @JsonProperty("footnotes")
    private var footnotes: Footnotes? = null

    @JsonProperty("characterStyles")
    private var characterStyles: CharacterStyles? = null

    @JsonProperty("crossReferences")
    private var crossReferences: CrossReferences? = null

    @JsonProperty("footnotes")
    fun getFootnotes(): Footnotes? {
        return footnotes
    }

    @JsonProperty("footnotes")
    fun setFootnotes(footnotes: Footnotes?) {
        this.footnotes = footnotes
    }

    @JsonProperty("characterStyles")
    fun getCharacterStyles(): CharacterStyles? {
        return characterStyles
    }

    @JsonProperty("characterStyles")
    fun setCharacterStyles(characterStyles: CharacterStyles?) {
        this.characterStyles = characterStyles
    }

    @JsonProperty("crossReferences")
    fun getCrossReferences(): CrossReferences? {
        return crossReferences
    }

    @JsonProperty("crossReferences")
    fun setCrossReferences(crossReferences: CrossReferences?) {
        this.crossReferences = crossReferences
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(Content::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        sb.append("chapterNumberStyle")
        sb.append('=')
        sb.append((if ((this.chapterNumberStyle == null)) "<null>" else this.chapterNumberStyle))
        sb.append(',')
        sb.append("chapterHeadingsNumberFirst")
        sb.append('=')
        sb.append((if ((this.chapterHeadingsNumberFirst == null)) "<null>" else this.chapterHeadingsNumberFirst))
        sb.append(',')
        sb.append("versedParagraphs")
        sb.append('=')
        sb.append((if ((this.versedParagraphs == null)) "<null>" else this.versedParagraphs))
        sb.append(',')
        sb.append("verseSeparator")
        sb.append('=')
        sb.append((if ((this.verseSeparator == null)) "<null>" else this.verseSeparator))
        sb.append(',')
        sb.append("includeIntros")
        sb.append('=')
        sb.append((if ((this.includeIntros == null)) "<null>" else this.includeIntros))
        sb.append(',')
        sb.append("footnotes")
        sb.append('=')
        sb.append((if ((this.footnotes == null)) "<null>" else this.footnotes))
        sb.append(',')
        sb.append("characterStyles")
        sb.append('=')
        sb.append((if ((this.characterStyles == null)) "<null>" else this.characterStyles))
        sb.append(',')
        sb.append("crossReferences")
        sb.append('=')
        sb.append((if ((this.crossReferences == null)) "<null>" else this.crossReferences))
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
        result = ((result * 31) + (if ((this.versedParagraphs == null)) 0 else versedParagraphs.hashCode()))
        result =
            ((result * 31) + (if ((this.chapterHeadingsNumberFirst == null)) 0 else chapterHeadingsNumberFirst.hashCode()))
        result = ((result * 31) + (if ((this.chapterNumberStyle == null)) 0 else chapterNumberStyle.hashCode()))
        result = ((result * 31) + (if ((this.includeIntros == null)) 0 else includeIntros.hashCode()))
        result = ((result * 31) + (if ((this.verseSeparator == null)) 0 else verseSeparator.hashCode()))
        result = ((result * 31) + (if ((this.characterStyles == null)) 0 else characterStyles.hashCode()))
        result = ((result * 31) + (if ((this.footnotes == null)) 0 else footnotes.hashCode()))
        result = ((result * 31) + (if ((this.crossReferences == null)) 0 else crossReferences.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is Content) == false) {
            return false
        }
        val rhs = other
        return (((((((((this.versedParagraphs === rhs.versedParagraphs) || ((this.versedParagraphs != null) && (this.versedParagraphs == rhs.versedParagraphs))) && ((this.chapterHeadingsNumberFirst === rhs.chapterHeadingsNumberFirst) || ((this.chapterHeadingsNumberFirst != null) && (this.chapterHeadingsNumberFirst == rhs.chapterHeadingsNumberFirst)))) && ((this.chapterNumberStyle == rhs.chapterNumberStyle) || ((this.chapterNumberStyle != null) && (this.chapterNumberStyle == rhs.chapterNumberStyle)))) && ((this.includeIntros === rhs.includeIntros) || ((this.includeIntros != null) && (this.includeIntros == rhs.includeIntros)))) && ((this.verseSeparator === rhs.verseSeparator) || ((this.verseSeparator != null) && (this.verseSeparator == rhs.verseSeparator)))) && ((this.characterStyles === rhs.characterStyles) || ((this.characterStyles != null) && characterStyles == rhs.characterStyles))) && ((this.footnotes === rhs.footnotes) || ((this.footnotes != null) && footnotes == rhs.footnotes))) && ((this.crossReferences === rhs.crossReferences) || ((this.crossReferences != null) && crossReferences == rhs.crossReferences)))
    }

    enum class ChapterNumberStyle(private val value: String) {
        UPPER("upper"),
        LOWER("lower");

        override fun toString(): String {
            return this.value
        }

        @JsonValue
        fun value(): String {
            return this.value
        }

        companion object {
            private val CONSTANTS: MutableMap<String, ChapterNumberStyle> = HashMap()

            init {
                for (c in values()) {
                    CONSTANTS[c.value] = c
                }
            }

            @JsonCreator
            fun fromValue(value: String): ChapterNumberStyle {
                val constant = CONSTANTS[value]
                requireNotNull(constant) { value }
                return constant
            }
        }
    }
}
