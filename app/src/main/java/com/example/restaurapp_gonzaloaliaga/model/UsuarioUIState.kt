package com.example.restaurapp_gonzaloaliaga.model

data class UsuarioUIState (
    val nombre: String = "",
    val correo: String = "",
    val clave: String = "",
    val aceptaTerminos: Boolean = false,
    val errores: UsuarioErrores = UsuarioErrores()
)