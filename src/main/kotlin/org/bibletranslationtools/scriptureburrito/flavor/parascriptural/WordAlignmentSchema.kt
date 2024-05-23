package org.bibletranslationtools.scriptureburrito.flavor.parascriptural

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "name", "autoAlignerVersion", "stopWords", "stemmer", "manualAlignment"
)
class WordAlignmentSchema {



    @get:JsonProperty("name")
    @set:JsonProperty("name")
    @JsonProperty("name")
    var name: Any? = null



    @get:JsonProperty("autoAlignerVersion")
    @set:JsonProperty("autoAlignerVersion")
    @JsonProperty("autoAlignerVersion")
    var autoAlignerVersion: String? = null



    @get:JsonProperty("stopWords")
    @set:JsonProperty("stopWords")
    @JsonProperty("stopWords")
    var stopWords: Boolean? = null


    @JsonProperty("stemmer")
    private var stemmer: Stemmer? = null


    @JsonProperty("manualAlignment")
    private var manualAlignment: ManualAlignment? = null


    @JsonProperty("stemmer")
    fun getStemmer(): Stemmer? {
        return stemmer
    }


    @JsonProperty("stemmer")
    fun setStemmer(stemmer: Stemmer?) {
        this.stemmer = stemmer
    }


    @JsonProperty("manualAlignment")
    fun getManualAlignment(): ManualAlignment? {
        return manualAlignment
    }


    @JsonProperty("manualAlignment")
    fun setManualAlignment(manualAlignment: ManualAlignment?) {
        this.manualAlignment = manualAlignment
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(WordAlignmentSchema::class.java.name).append('@').append(
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
        sb.append("autoAlignerVersion")
        sb.append('=')
        sb.append((if ((this.autoAlignerVersion == null)) "<null>" else this.autoAlignerVersion))
        sb.append(',')
        sb.append("stopWords")
        sb.append('=')
        sb.append((if ((this.stopWords == null)) "<null>" else this.stopWords))
        sb.append(',')
        sb.append("stemmer")
        sb.append('=')
        sb.append((if ((this.stemmer == null)) "<null>" else this.stemmer))
        sb.append(',')
        sb.append("manualAlignment")
        sb.append('=')
        sb.append((if ((this.manualAlignment == null)) "<null>" else this.manualAlignment))
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
        result = ((result * 31) + (if ((this.stemmer == null)) 0 else stemmer.hashCode()))
        result = ((result * 31) + (if ((this.stopWords == null)) 0 else stopWords.hashCode()))
        result = ((result * 31) + (if ((this.autoAlignerVersion == null)) 0 else autoAlignerVersion.hashCode()))
        result = ((result * 31) + (if ((this.manualAlignment == null)) 0 else manualAlignment.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is WordAlignmentSchema) == false) {
            return false
        }
        val rhs = other
        return ((((((this.name === rhs.name) || ((this.name != null) && (this.name == rhs.name))) && ((this.stemmer === rhs.stemmer) || ((this.stemmer != null) && stemmer == rhs.stemmer))) && ((this.stopWords === rhs.stopWords) || ((this.stopWords != null) && (this.stopWords == rhs.stopWords)))) && ((this.autoAlignerVersion === rhs.autoAlignerVersion) || ((this.autoAlignerVersion != null) && (this.autoAlignerVersion == rhs.autoAlignerVersion)))) && ((this.manualAlignment === rhs.manualAlignment) || ((this.manualAlignment != null) && manualAlignment == rhs.manualAlignment)))
    }
}
