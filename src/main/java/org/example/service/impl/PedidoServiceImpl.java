package org.example.service.impl;

import org.example.domain.repository.Pedidos;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl {

    private Pedidos repository;

    public PedidoServiceImpl(Pedidos repository) {
        this.repository = repository;
    }
}
