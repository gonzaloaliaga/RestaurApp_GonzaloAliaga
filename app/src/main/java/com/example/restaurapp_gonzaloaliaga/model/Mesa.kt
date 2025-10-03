package com.example.restaurapp_gonzaloaliaga.model

class Mesa (
    val id: Int,
    val cantidadMaxPersonas: Int,
) {
    override fun toString(): String {
        return "Mesa(id=$id, cantidadMaxPersonas=${cantidadMaxPersonas}"
    }
}