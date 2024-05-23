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
    private var performance: Set<Performance> = LinkedHashSet(),

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
    fun getPerformance(): Set<Performance> {
        return performance
    }

    @JsonProperty("performance")
    fun setPerformance(performance: Set<Performance>) {
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
}
