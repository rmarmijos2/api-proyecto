package com.armijosm.Tienda.service

import com.armijosm.Tienda.model.Cliente
import com.armijosm.Tienda.model.Producto
import com.armijosm.Tienda.repository.ProductoRepository
import org.springframework.stereotype.Service
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestBody

@Service
class ProductoService {
    @Autowired
    lateinit var productoRepository: ProductoRepository


    fun list(): List<Producto> {
        return productoRepository.findAll()
    }

    fun save(@RequestBody producto: Producto): Producto {
        return productoRepository.save(producto)
    }

    fun update(@RequestBody producto: Producto): Producto {
        return productoRepository.save(producto)
    }

    fun updateDescription (producto: Producto): Producto {
        val response = productoRepository.findById(producto.id)
            ?: throw Exception()
        response.apply {
            this.descripcion=producto.descripcion
        }
        return productoRepository.save(response)
    }

    fun delete (id:Long): Boolean{
        productoRepository.deleteById(id)
        return true
    }
}