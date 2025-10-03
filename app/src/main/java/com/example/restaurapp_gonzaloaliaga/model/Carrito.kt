package com.example.restaurapp_gonzaloaliaga.model

class Carrito (
    val cliente: Cliente,
    var productos: MutableList<DetalleProducto>
) {
    fun añadirProducto(producto: DetalleProducto) {
        productos.add(producto)
    }
    fun eliminarProducto(producto: DetalleProducto) {
        productos.remove(producto)
    }
}