package com.armijosm.Tienda.repository

import com.armijosm.Tienda.model.Cliente
import com.armijosm.Tienda.model.Producto
import org.springframework.data.jpa.repository.JpaRepository

interface ClienteRepository: JpaRepository<Cliente, Long> {
    fun findById (id: Long?): Cliente?
}