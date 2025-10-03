package com.example.restaurapp_gonzaloaliaga.model

class DetalleProducto (
    val producto: Producto,
    var cantidad: Int
) {
    fun aumentarCantidad() {
        cantidad = cantidad+1
    }
    fun reducirCantidad() : String {
        if (cantidad > 1) {
            cantidad = cantidad-1
            return "Proceso exitoso."
        } else {
            return "No se ha podido reducir la cantidad porque ya ha llegado al mínimo."
        }
    }
}