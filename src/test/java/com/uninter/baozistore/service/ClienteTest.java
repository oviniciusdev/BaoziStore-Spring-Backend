package com.uninter.baozistore.service;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.uninter.baozistore.model.Cliente;
import com.uninter.baozistore.repository.ClienteRepository;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class ClienteTest {

    @Autowired
    private ClienteRepository repository;

    @Test
    @Order(1)
    public void testInsereCliente() {
        Cliente cliente = new Cliente();
        cliente.setNome("Vinicius Junio dos Santos - RU 5053547");
        cliente.setClienteDesde(LocalDate.now());
        
        Cliente salvo = repository.save(cliente);
        
        assertNotNull(salvo.getId());
        assertEquals("Vinicius Junio dos Santos - RU 5053547", salvo.getNome());
    }
}
