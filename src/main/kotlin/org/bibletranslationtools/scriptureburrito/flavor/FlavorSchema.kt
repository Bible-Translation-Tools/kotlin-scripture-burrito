package org.bibletranslationtools.scriptureburrito.flavor

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.core.JsonProcessingException
import com.fasterxml.jackson.databind.*
import com.fasterxml.jackson.module.kotlin.KotlinModule
import org.bibletranslationtools.scriptureburrito.flavor.scripture.ScriptureFlavorSchema
import org.bibletranslationtools.scriptureburrito.flavor.scripture.audio.AudioFlavorSchema
import java.io.IOException

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "name"
)
@JsonSubTypes(
    JsonSubTypes.Type(value = ScriptureFlavorSchema::class, name = "textTranslation"),
    JsonSubTypes.Type(value = AudioFlavorSchema::class, name = "audioTranslation")
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

class FlavorSchemaDeserializer : JsonDeserializer<FlavorSchema?>() {
    val mapper = ObjectMapper().registerModules(KotlinModule())

    @Throws(IOException::class, JsonProcessingException::class)
    override fun deserialize(jp: JsonParser, ctx: DeserializationContext?): FlavorSchema {
        val node: JsonNode = jp.readValueAsTree() // Get the complete JSON structure

        // Extract the "format" field from the package object (assuming it's nested)
        val format = node["name"].asText()

        val flavor: FlavorSchema = when (format) {
            "textTranslation" -> mapper.readValue(node.toString(), ScriptureFlavorSchema::class.java)
            "audioTranslation" -> {
                val parsed = mapper.readValue(node.toString(), AudioFlavorSchema::class.java)
                parsed
            }
            else -> throw JsonMappingException("Unsupported format string: $format")
        }
        return flavor
    }
}