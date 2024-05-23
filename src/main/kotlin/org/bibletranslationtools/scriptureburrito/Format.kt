package org.bibletranslationtools.scriptureburrito

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class Format(private val value: String) {
    SCRIPTURE_BURRITO("scripture burrito");

    override fun toString(): String {
        return this.value
    }

    @JsonValue
    fun value(): String {
        return this.value
    }

    companion object {
        private val CONSTANTS: MutableMap<String, org.bibletranslationtools.scriptureburrito.Format> = HashMap()

        init {
            for (c in values()) {
                org.bibletranslationtools.scriptureburrito.Format.Companion.CONSTANTS[c.value] = c
            }
        }

        @JsonCreator
        fun fromValue(value: String): org.bibletranslationtools.scriptureburrito.Format {
            val constant = org.bibletranslationtools.scriptureburrito.Format.Companion.CONSTANTS[value]
            requireNotNull(constant) { value }
            return constant
        }
    }
}