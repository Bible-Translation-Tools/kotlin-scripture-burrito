package org.bibletranslationtools.scriptureburrito

import org.bibletranslationtools.scriptureburrito.MetaVersionSchema
import org.bibletranslationtools.scriptureburrito.NormalizationSchema
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyDescription
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import org.bibletranslationtools.scriptureburrito.Category
import java.util.*


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "category", "dateCreated", "version", "generator", "defaultLocale", "normalization", "comments"
)
class SourceMetaSchema(
    @JsonProperty("dateCreated")
    dateCreated: Date,

    @JsonProperty("version")
    version: MetaVersionSchema,

    @JsonProperty("generator")
    generator: SoftwareAndUserInfoSchema,

    @JsonProperty("defaultLocale")
    defaultLocale: String,

    @JsonProperty("normalization")
    normalization: NormalizationSchema? = null,

    @JsonProperty("comments")
    comments: List<String> = ArrayList()
) : Meta(
    dateCreated,
    version,
    generator,
    defaultLocale,
    normalization,
    comments
)