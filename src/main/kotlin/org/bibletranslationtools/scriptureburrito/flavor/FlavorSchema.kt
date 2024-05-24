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

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(FlavorSchema::class.java.name).append('@').append(
            Integer.toHexString(
                System.identityHashCode(
                    this
                )
            )
        ).append('[')
        if (sb[sb.length - 1] == ',') {
            sb.setCharAt((sb.length - 1), ']')
        } else {
            sb.append(']')
        }
        return sb.toString()
    }

    override fun hashCode(): Int {
        val result = 1
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if (other !is FlavorSchema) {
            return false
        }
        return true
    }
}