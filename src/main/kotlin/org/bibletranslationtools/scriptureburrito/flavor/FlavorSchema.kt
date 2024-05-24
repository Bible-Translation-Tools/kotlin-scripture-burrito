package org.bibletranslationtools.scriptureburrito.flavor

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.core.JsonProcessingException
import com.fasterxml.jackson.databind.*
import com.fasterxml.jackson.module.kotlin.KotlinModule
import org.bibletranslationtools.scriptureburrito.flavor.scripture.ScriptureFlavorSchema
import org.bibletranslationtools.scriptureburrito.flavor.scripture.audio.AudioFlavorSchema
import org.bibletranslationtools.scriptureburrito.flavor.scripture.braille.EmbossedBrailleScriptureSchema
import org.bibletranslationtools.scriptureburrito.flavor.scripture.print.TypesetScriptureSchema
import org.bibletranslationtools.scriptureburrito.flavor.scripture.text.TextTranslationSchema
import org.bibletranslationtools.scriptureburrito.flavor.scripture.video.SignLanguageVideoTranslationSchema
import java.io.IOException

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "name"
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "name")
@JsonSubTypes(
    JsonSubTypes.Type(value = TextTranslationSchema::class, name = "textTranslation"),
    JsonSubTypes.Type(value = AudioFlavorSchema::class, name = "audioTranslation"),
    JsonSubTypes.Type(value = SignLanguageVideoTranslationSchema::class, name = "signLanguageVideoTranslation"),
    JsonSubTypes.Type(value = EmbossedBrailleScriptureSchema::class, name = "embossedBrailleScripture"),
    JsonSubTypes.Type(value = TypesetScriptureSchema::class, name = "typesetScripture")
)
abstract class FlavorSchema {

    abstract var name: String
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FlavorSchema) return false

        if (name != other.name) return false

        return true
    }

    override fun hashCode(): Int {
        return name.hashCode()
    }

    override fun toString(): String {
        return "FlavorSchema(name='$name')"
    }
}