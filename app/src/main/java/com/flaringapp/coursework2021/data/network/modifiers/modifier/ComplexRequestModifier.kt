package com.flaringapp.coursework2021.data.network.modifiers.modifier

import okhttp3.Request

class ComplexRequestModifier(
    private val modifiers: Collection<RequestModifier>
): RequestModifier {

    override fun applyChanges(builder: Request.Builder) {
        modifiers.forEach { it.applyChanges(builder) }
    }
}