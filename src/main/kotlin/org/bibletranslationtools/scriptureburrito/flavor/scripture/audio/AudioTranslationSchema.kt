package org.bibletranslationtools.scriptureburrito.flavor.scripture.audio

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import org.bibletranslationtools.scriptureburrito.flavor.FlavorSchema

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "name", "performance", "formats", "conventions"
)
class AudioFlavorSchema(
    @get:JsonProperty("performance")
    @set:JsonProperty("performance")
    @JsonProperty("performance")
    @JsonDeserialize(`as` = LinkedHashSet::class)
    private var performance: MutableSet<Performance> = LinkedHashSet(),

    @get:JsonProperty("formats")
    @set:JsonProperty("formats")
    @JsonProperty("formats")
    private var formats: Formats
) : FlavorSchema() {
    @get:JsonProperty("name")
    @set:JsonProperty("name")
    @JsonProperty("name")
    override lateinit var name: String

    @JsonProperty("conventions")
    private var conventions: AudioConventions? = null

    @JsonProperty("performance")
    fun getPerformance(): MutableSet<Performance> {
        return performance
    }

    @JsonProperty("performance")
    fun setPerformance(performance: MutableSet<Performance>) {
        this.performance = performance
    }

    @JsonProperty("formats")
    fun getFormats(): Formats {
        return formats
    }

    @JsonProperty("formats")
    fun setFormats(formats: Formats) {
        this.formats = formats
    }

    @JsonProperty("conventions")
    fun getAudioConventions(): AudioConventions? {
        return conventions
    }

    @JsonProperty("conventions")
    fun setAudioConventions(conventions: AudioConventions?) {
        this.conventions = conventions
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AudioFlavorSchema) return false
        if (!super.equals(other)) return false

        if (performance != other.performance) return false
        if (formats != other.formats) return false
        if (name != other.name) return false
        if (conventions != other.conventions) return false

        return true
    }

    override fun hashCode(): Int {
        var result = super.hashCode()
        result = 31 * result + performance.hashCode()
        result = 31 * result + formats.hashCode()
        result = 31 * result + name.hashCode()
        result = 31 * result + (conventions?.hashCode() ?: 0)
        return result
    }

    override fun toString(): String {
        return "AudioFlavorSchema(performance=$performance, formats=$formats, name='$name', conventions=$conventions)"
    }
}
