package com.example.restaurapp_gonzaloaliaga.model

class Boleta (
    val cliente: Cliente,
    val carrito: Carrito,
    var precioTotal: Double
) {
    fun calcularPrecio() : Double {
        val total = carrito.productos.sumOf { it.producto.precio * it.cantidad }.toDouble()
        precioTotal = total
        return total
    }

    fun calcularDescuento() : Double {
        return (cliente.puntosAcumula/100).toDouble() // 3 puntos por compra -> 0.03 de descuento
    }

    fun aplicarDescuento() : Double {
        val descuento = calcularDescuento()
        val total = calcularPrecio()
        precioTotal = total * (1-descuento)
        return precioTotal
    }
}