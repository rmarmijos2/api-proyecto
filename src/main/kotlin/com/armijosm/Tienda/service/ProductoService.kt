package com.armijosm.Tienda.service

import com.armijosm.Tienda.model.Producto
import com.armijosm.Tienda.repository.ProductoRepository
import org.springframework.stereotype.Service
import org.springframework.beans.factory.annotation.Autowired

@Service
class ProductoService {
    @Autowired
    lateinit var productoRepository: ProductoRepository


    fun list(): List<Producto> {
        return productoRepository.findAll()
    }
}