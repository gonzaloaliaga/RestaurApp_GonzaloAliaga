package com.example.restaurapp_gonzaloaliaga.model

class Cliente (
    val id: Int,
    val nombre: Int,
    val edad: Int,
    var puntosAcumula: Int
) {
    override fun toString(): String {
        return "Cliente(id=$id, nombre=$nombre, edad=$edad, puntosAcumula=$puntosAcumula)"
    }
}