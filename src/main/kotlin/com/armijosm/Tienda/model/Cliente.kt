package com.armijosm.Tienda.model

import javax.persistence.*

@Entity
@Table(name = "cliente")

class Cliente {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null

    var nombre: String? = null
    var apellido: String? = null
    var edad: String? = null
    var cedula: String? = null
}