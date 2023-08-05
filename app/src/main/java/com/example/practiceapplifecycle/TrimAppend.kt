package com.example.practiceapplifecycle

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
 * Example of property delegate
 */
class TrimAppend: ReadWriteProperty<Any, String> {
    private var trimAppendString = ""
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
       return trimAppendString
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: String) {
        trimAppendString = "${value.trim()} is a String"
    }
}