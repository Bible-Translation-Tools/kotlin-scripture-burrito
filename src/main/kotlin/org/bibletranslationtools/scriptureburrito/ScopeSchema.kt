package org.bibletranslationtools.scriptureburrito

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonPropertyOrder


//@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonPropertyOrder
typealias ScopeSchema = MutableMap<String, MutableList<String>>
//class ScopeSchema {
//
//    override fun toString(): String {
//        val sb = StringBuilder()
//        sb.append(ScopeSchema::class.java.name).append('@').append(
//            Integer.toHexString(
//                System.identityHashCode(
//                    this
//                )
//            )
//        ).append('[')
//        if (sb[sb.length - 1] == ',') {
//            sb.setCharAt((sb.length - 1), ']')
//        } else {
//            sb.append(']')
//        }
//        return sb.toString()
//    }
//
//    override fun hashCode(): Int {
//        val result = 1
//        return result
//    }
//
//    override fun equals(other: Any?): Boolean {
//        if (other === this) {
//            return true
//        }
//        if ((other is ScopeSchema) == false) {
//            return false
//        }
//        return true
//    }
//}
