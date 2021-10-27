package com.armijosm.Tienda.service

import com.armijosm.Tienda.model.Cliente
import com.armijosm.Tienda.repository.ClienteRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ClienteService {
    @Autowired
    lateinit var clienteRepository: ClienteRepository


    fun list(): List<Cliente> {
        return clienteRepository.findAll()
    }
}