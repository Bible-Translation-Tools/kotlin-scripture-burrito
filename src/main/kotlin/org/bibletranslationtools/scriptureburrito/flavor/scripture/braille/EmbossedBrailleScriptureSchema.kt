package org.bibletranslationtools.scriptureburrito.flavor.scripture.braille

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "name",
    "isContracted",
    "processor",
    "hyphenationDictionary",
    "numberSign",
    "continuousPoetry",
    "content",
    "page",
    "conventions"
)
class EmbossedBrailleScriptureSchema {
    @get:JsonProperty("name")
    @set:JsonProperty("name")
    @JsonProperty("name")
    var name: String? = null



    @get:JsonProperty("isContracted")
    @set:JsonProperty("isContracted")
    @JsonProperty("isContracted")
    var isContracted: Boolean? = null


    @JsonProperty("processor")
    private var processor: Processor? = null

    @JsonProperty("hyphenationDictionary")
    private var hyphenationDictionary: HyphenationDictionary? = null


    @JsonProperty("numberSign")
    private var numberSign: NumberSign? = null

    @JsonProperty("continuousPoetry")
    private var continuousPoetry: ContinuousPoetry? = null


    @JsonProperty("content")
    private var content: Content? = null


    @JsonProperty("page")
    private var page: Page? = null

    @JsonProperty("conventions")
    private var conventions: org.bibletranslationtools.scriptureburrito.flavor.scripture.Conventions? = null


    @JsonProperty("processor")
    fun getProcessor(): Processor? {
        return processor
    }


    @JsonProperty("processor")
    fun setProcessor(processor: Processor?) {
        this.processor = processor
    }

    @JsonProperty("hyphenationDictionary")
    fun getHyphenationDictionary(): HyphenationDictionary? {
        return hyphenationDictionary
    }

    @JsonProperty("hyphenationDictionary")
    fun setHyphenationDictionary(hyphenationDictionary: HyphenationDictionary?) {
        this.hyphenationDictionary = hyphenationDictionary
    }


    @JsonProperty("numberSign")
    fun getNumberSign(): NumberSign? {
        return numberSign
    }


    @JsonProperty("numberSign")
    fun setNumberSign(numberSign: NumberSign?) {
        this.numberSign = numberSign
    }

    @JsonProperty("continuousPoetry")
    fun getContinuousPoetry(): ContinuousPoetry? {
        return continuousPoetry
    }

    @JsonProperty("continuousPoetry")
    fun setContinuousPoetry(continuousPoetry: ContinuousPoetry?) {
        this.continuousPoetry = continuousPoetry
    }


    @JsonProperty("content")
    fun getContent(): Content? {
        return content
    }


    @JsonProperty("content")
    fun setContent(content: Content?) {
        this.content = content
    }


    @JsonProperty("page")
    fun getPage(): Page? {
        return page
    }


    @JsonProperty("page")
    fun setPage(page: Page?) {
        this.page = page
    }

    @JsonProperty("conventions")
    fun getConventions(): org.bibletranslationtools.scriptureburrito.flavor.scripture.Conventions? {
        return conventions
    }

    @JsonProperty("conventions")
    fun setConventions(conventions: org.bibletranslationtools.scriptureburrito.flavor.scripture.Conventions) {
        this.conventions = conventions
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(EmbossedBrailleScriptureSchema::class.java.name).append('@').append(
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
        sb.append("isContracted")
        sb.append('=')
        sb.append((if ((this.isContracted == null)) "<null>" else this.isContracted))
        sb.append(',')
        sb.append("processor")
        sb.append('=')
        sb.append((if ((this.processor == null)) "<null>" else this.processor))
        sb.append(',')
        sb.append("hyphenationDictionary")
        sb.append('=')
        sb.append((if ((this.hyphenationDictionary == null)) "<null>" else this.hyphenationDictionary))
        sb.append(',')
        sb.append("numberSign")
        sb.append('=')
        sb.append((if ((this.numberSign == null)) "<null>" else this.numberSign))
        sb.append(',')
        sb.append("continuousPoetry")
        sb.append('=')
        sb.append((if ((this.continuousPoetry == null)) "<null>" else this.continuousPoetry))
        sb.append(',')
        sb.append("content")
        sb.append('=')
        sb.append((if ((this.content == null)) "<null>" else this.content))
        sb.append(',')
        sb.append("page")
        sb.append('=')
        sb.append((if ((this.page == null)) "<null>" else this.page))
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
        result = ((result * 31) + (if ((this.name == null)) 0 else name.hashCode()))
        result = ((result * 31) + (if ((this.conventions == null)) 0 else conventions.hashCode()))
        result = ((result * 31) + (if ((this.numberSign == null)) 0 else numberSign.hashCode()))
        result = ((result * 31) + (if ((this.isContracted == null)) 0 else isContracted.hashCode()))
        result = ((result * 31) + (if ((this.page == null)) 0 else page.hashCode()))
        result = ((result * 31) + (if ((this.hyphenationDictionary == null)) 0 else hyphenationDictionary.hashCode()))
        result = ((result * 31) + (if ((this.processor == null)) 0 else processor.hashCode()))
        result = ((result * 31) + (if ((this.content == null)) 0 else content.hashCode()))
        result = ((result * 31) + (if ((this.continuousPoetry == null)) 0 else continuousPoetry.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is EmbossedBrailleScriptureSchema) == false) {
            return false
        }
        val rhs = other
        return ((((((((((this.name === rhs.name) || ((this.name != null) && (this.name == rhs.name))) && ((this.conventions === rhs.conventions) || ((this.conventions != null) && conventions?.equals(
            rhs.conventions
        ) == true))) && ((this.numberSign === rhs.numberSign) || ((this.numberSign != null) && numberSign?.equals(rhs.numberSign) == true))) && ((this.isContracted === rhs.isContracted) || ((this.isContracted != null) && (this.isContracted == rhs.isContracted)))) && ((this.page === rhs.page) || ((this.page != null) && page?.equals(
            rhs.page
        ) == true))) && ((this.hyphenationDictionary === rhs.hyphenationDictionary) || ((this.hyphenationDictionary != null) && hyphenationDictionary?.equals(
            rhs.hyphenationDictionary
        ) == true))) && ((this.processor === rhs.processor) || ((this.processor != null) && processor?.equals(rhs.processor) == true))) && ((this.content === rhs.content) || ((this.content != null) && content?.equals(
            rhs.content
        ) == true))) && ((this.continuousPoetry === rhs.continuousPoetry) || ((this.continuousPoetry != null) && continuousPoetry?.equals(
            rhs.continuousPoetry
        ) == true)))
    }
}
