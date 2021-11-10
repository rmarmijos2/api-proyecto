package com.armijosm.Tienda.repository

import com.armijosm.Tienda.model.Producto
import org.springframework.data.jpa.repository.JpaRepository

interface ProductoRepository:JpaRepository <Producto,Long> {
    fun findById (id: Long?): Producto?
}