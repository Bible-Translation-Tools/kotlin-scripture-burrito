package org.bibletranslationtools.scriptureburrito.flavor.scripture.text

import com.fasterxml.jackson.annotation.*
import org.bibletranslationtools.scriptureburrito.flavor.scripture.Conventions


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "name", "projectType", "translationType", "audience", "usfmVersion", "conventions"
)
class TextTranslationSchema {



    @get:JsonProperty("name")
    @set:JsonProperty("name")
    @JsonProperty("name")
    var name: String? = null



    @get:JsonProperty("projectType")
    @set:JsonProperty("projectType")
    @JsonProperty("projectType")
    var projectType: ProjectType? = null



    @get:JsonProperty("translationType")
    @set:JsonProperty("translationType")
    @JsonProperty("translationType")
    var translationType: TranslationType? = null



    @get:JsonProperty("audience")
    @set:JsonProperty("audience")
    @JsonProperty("audience")
    var audience: Audience? = null



    @get:JsonProperty("usfmVersion")
    @set:JsonProperty("usfmVersion")
    @JsonProperty("usfmVersion")
    var usfmVersion: String? = null

    @JsonProperty("conventions")
    private var conventions: org.bibletranslationtools.scriptureburrito.flavor.scripture.Conventions? = null

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
        sb.append(TextTranslationSchema::class.java.name).append('@').append(
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
        sb.append("projectType")
        sb.append('=')
        sb.append((if ((this.projectType == null)) "<null>" else this.projectType))
        sb.append(',')
        sb.append("translationType")
        sb.append('=')
        sb.append((if ((this.translationType == null)) "<null>" else this.translationType))
        sb.append(',')
        sb.append("audience")
        sb.append('=')
        sb.append((if ((this.audience == null)) "<null>" else this.audience))
        sb.append(',')
        sb.append("usfmVersion")
        sb.append('=')
        sb.append((if ((this.usfmVersion == null)) "<null>" else this.usfmVersion))
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
        result = ((result * 31) + (if ((this.projectType == null)) 0 else projectType.hashCode()))
        result = ((result * 31) + (if ((this.conventions == null)) 0 else conventions.hashCode()))
        result = ((result * 31) + (if ((this.audience == null)) 0 else audience.hashCode()))
        result = ((result * 31) + (if ((this.translationType == null)) 0 else translationType.hashCode()))
        result = ((result * 31) + (if ((this.usfmVersion == null)) 0 else usfmVersion.hashCode()))
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if ((other is TextTranslationSchema) == false) {
            return false
        }
        val rhs = other
        return (((((((this.name === rhs.name) || ((this.name != null) && (this.name == rhs.name))) && ((this.projectType == rhs.projectType) || ((this.projectType != null) && (this.projectType == rhs.projectType)))) && ((this.conventions === rhs.conventions) || ((this.conventions != null) && conventions == rhs.conventions))) && ((this.audience == rhs.audience) || ((this.audience != null) && (this.audience == rhs.audience)))) && ((this.translationType == rhs.translationType) || ((this.translationType != null) && (this.translationType == rhs.translationType)))) && ((this.usfmVersion === rhs.usfmVersion) || ((this.usfmVersion != null) && (this.usfmVersion == rhs.usfmVersion))))
    }

    enum class Audience(private val value: String) {
        BASIC("basic"),
        COMMON("common"),
        COMMON_LITERARY("common-literary"),
        LITERARY("literary"),
        LITURGICAL("liturgical"),
        CHILDREN("children");

        override fun toString(): String {
            return this.value
        }

        @JsonValue
        fun value(): String {
            return this.value
        }

        companion object {
            private val CONSTANTS: MutableMap<String, Audience> = HashMap()

            init {
                for (c in values()) {
                    CONSTANTS[c.value] = c
                }
            }

            @JsonCreator
            fun fromValue(value: String): Audience {
                val constant = CONSTANTS[value]
                requireNotNull(constant) { value }
                return constant
            }
        }
    }

    enum class ProjectType(private val value: String) {
        STANDARD("standard"),
        DAUGHTER("daughter"),
        STUDY_BIBLE("studyBible"),
        STUDY_BIBLE_ADDITIONS("studyBibleAdditions"),
        BACK_TRANSLATION("backTranslation"),
        AUXILIARY("auxiliary"),
        TRANSLITERATION_MANUAL("transliterationManual"),
        TRANSLITERATION_WITH_ENCODER("transliterationWithEncoder");

        override fun toString(): String {
            return this.value
        }

        @JsonValue
        fun value(): String {
            return this.value
        }

        companion object {
            private val CONSTANTS: MutableMap<String, ProjectType> = HashMap()

            init {
                for (c in values()) {
                    CONSTANTS[c.value] = c
                }
            }

            @JsonCreator
            fun fromValue(value: String): ProjectType {
                val constant = CONSTANTS[value]
                requireNotNull(constant) { value }
                return constant
            }
        }
    }

    enum class TranslationType(private val value: String) {
        FIRST_TRANSLATION("firstTranslation"),
        NEW_TRANSLATION("newTranslation"),
        REVISION("revision"),
        STUDY_OR_HELP_MATERIAL("studyOrHelpMaterial");

        override fun toString(): String {
            return this.value
        }

        @JsonValue
        fun value(): String {
            return this.value
        }

        companion object {
            private val CONSTANTS: MutableMap<String, TranslationType> = HashMap()

            init {
                for (c in values()) {
                    CONSTANTS[c.value] = c
                }
            }

            @JsonCreator
            fun fromValue(value: String): TranslationType {
                val constant = CONSTANTS[value]
                requireNotNull(constant) { value }
                return constant
            }
        }
    }
}
