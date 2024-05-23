package org.bibletranslationtools.scriptureburrito.flavor.scripture.audio

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
class AudioConventions {
    @get:JsonProperty("contentResourcesByChapter")
    @set:JsonProperty("contentResourcesByChapter")
    @JsonProperty("contentResourcesByChapter")
    var contentResourcesByChapter: String? = null

    @get:JsonProperty("bookDirs")
    @set:JsonProperty("bookDirs")
    @JsonProperty("bookDirs")
    var bookDirs: String? = null
}
