package org.bibletranslationtools.scriptureburrito.flavor.scripture.video

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import org.bibletranslationtools.scriptureburrito.flavor.scripture.audio.Formats

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "name", "contentByChapter", "formats", "conventions"
)
class SignLanguageVideoTranslationSchema {

    @get:JsonProperty("name")
    @set:JsonProperty("name")
    @JsonProperty("name")
    var name: String? = null



    @get:JsonProperty("contentByChapter")
    @set:JsonProperty("contentByChapter")
    @JsonProperty("contentByChapter")
    var contentByChapter: Boolean? = null


    @JsonProperty("formats")
    private var formats: Formats? = null

    @JsonProperty("conventions")
    private var conventions: org.bibletranslationtools.scriptureburrito.flavor.scripture.Conventions? = null


    @JsonProperty("formats")
    fun getFormats(): Formats? {
        return formats
    }


    @JsonProperty("formats")
    fun setFormats(formats: Formats?) {
        this.formats = formats
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
        sb.append(SignLanguageVideoTranslationSchema::class.java.name).append('@').append(
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
        sb.append("contentByChapter")
        sb.append('=')
        sb.append((if ((this.contentByChapter == null)) "<null>" else this.contentByChapter))
        sb.append(',')
        sb.append("formats")
        sb.append('=')
        sb.append((if ((this.formats == null)) "<null>" else this.formats))
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
        result = ((result * 31) + (if ((this.formats == null)) 0 else formats.hashCode()))
        result = ((result * 31) + (if ((this.contentByChapter == null)) 0 else contentByChapter.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is SignLanguageVideoTranslationSchema) == false) {
            return false
        }
        val rhs = other
        return (((((this.name === rhs.name) || ((this.name != null) && (this.name == rhs.name))) && ((this.conventions === rhs.conventions) || ((this.conventions != null) && conventions?.equals(rhs.conventions) == true))) && ((this.formats === rhs.formats) || ((this.formats != null) && formats?.equals(rhs.formats) == true))) && ((this.contentByChapter === rhs.contentByChapter) || ((this.contentByChapter != null) && (this.contentByChapter == rhs.contentByChapter))))
    }
}
