package com.example.restaurapp_gonzaloaliaga.model

class Reserva (
    val id: Int,
    val mesa: Mesa,
    var clientes: MutableList<Cliente>,
    val horaReserva: String
) {

    override fun toString(): String {
        return "Reserva(id=$id, mesa=$mesa, clientes=$clientes, horaReserva='$horaReserva')"
    }

    fun addCliente(cliente: Cliente) : String {
        if (clientes.size < mesa.cantidadMaxPersonas) {
            clientes.add(cliente)
            return "Se ha añadido al cliente correctamente."
        } else {
            return "No se ha añadido al cliente debido a que la mesa está llena."
        }
    }
}