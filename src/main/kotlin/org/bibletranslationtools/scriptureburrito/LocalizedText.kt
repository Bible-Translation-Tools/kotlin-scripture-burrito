package org.bibletranslationtools.scriptureburrito

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import org.bibletranslationtools.scriptureburrito.Format


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "abbr",
    "short",
    "long"
)
class LocalizedText(
    @get:JsonProperty("short")
    @set:JsonProperty("short")
    @JsonProperty("short")
    var short: HashMap<String, String>
) {
    @get:JsonProperty("abbr")
    @set:JsonProperty("abbr")
    @JsonProperty("abbr")
    var abbr: HashMap<String, String> = HashMap()

    @get:JsonProperty("long")
    @set:JsonProperty("long")
    @JsonProperty("long")
    var long: HashMap<String, String> = HashMap()
}
