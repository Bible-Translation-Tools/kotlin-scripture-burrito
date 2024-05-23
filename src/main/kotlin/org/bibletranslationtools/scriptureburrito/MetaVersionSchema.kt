package org.bibletranslationtools.scriptureburrito

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

data class MetaVersionSchema(private val value: String) {

    override fun toString(): String {
        return this.value
    }

    @JsonValue
    fun value(): String {
        return this.value
    }

    companion object {
        @JsonCreator
        fun fromValue(value: String): MetaVersionSchema {
            return MetaVersionSchema(value)
        }
    }
}