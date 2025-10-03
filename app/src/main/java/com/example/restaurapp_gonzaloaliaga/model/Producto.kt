package com.example.restaurapp_gonzaloaliaga.model

class Producto (
    val nombre: String,
    val precio: Int,
    val categoria: String,
    val clasificacion: String
) {
    override fun toString(): String {
        return "Producto(nombre='$nombre', precio=$precio, categoria='$categoria', clasificacion='$clasificacion')"
    }
}