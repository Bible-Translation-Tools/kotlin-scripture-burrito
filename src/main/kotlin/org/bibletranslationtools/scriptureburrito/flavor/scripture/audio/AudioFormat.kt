package org.bibletranslationtools.scriptureburrito.flavor.scripture.audio

import com.fasterxml.jackson.annotation.*

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "compression",
    "trackConfiguration",
    "bitRate",
    "bitDepth",
    "samplingRate",
    "timingDir"
)
class AudioFormat(
    @get:JsonProperty("compression")
    @set:JsonProperty("compression")
    @JsonProperty("compression")
    @JsonPropertyDescription("A textual string specified in one or multiple languages, indexed by IETF language tag.")
    var compression: Compression
) {

    @get:JsonProperty("trackConfiguration")
    @set:JsonProperty("trackConfiguration")
    @JsonProperty("trackConfiguration")
    @JsonPropertyDescription("A textual string specified in one or multiple languages, indexed by IETF language tag.")
    var trackConfiguration: TrackConfiguration? = null

    @get:JsonProperty("bitRate")
    @set:JsonProperty("bitRate")
    @JsonProperty("bitRate")
    @JsonPropertyDescription("A textual string specified in one or multiple languages, indexed by IETF language tag.")
    var bitRate: Int? = null

    @get:JsonProperty("bitDepth")
    @set:JsonProperty("bitDepth")
    @JsonProperty("bitDepth")
    @JsonPropertyDescription("A textual string specified in one or multiple languages, indexed by IETF language tag.")
    var bitDepth: Int? = null

    @get:JsonProperty("samplingRate")
    @set:JsonProperty("samplingRate")
    @JsonProperty("samplingRate")
    @JsonPropertyDescription("A textual string specified in one or multiple languages, indexed by IETF language tag.")
    var samplingRate: Int? = null

    @get:JsonProperty("timingDir")
    @set:JsonProperty("timingDir")
    @JsonProperty("timingDir")
    @JsonPropertyDescription("A textual string specified in one or multiple languages, indexed by IETF language tag.")
    var timingDir: String? = null
}