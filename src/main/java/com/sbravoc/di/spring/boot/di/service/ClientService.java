package com.sbravoc.di.spring.boot.di.service;

import com.sbravoc.di.spring.boot.di.dto.ClientDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    public List<ClientDTO> getAll() {
        return List.of(
                new ClientDTO(1, "Alejandro", "alejandro@gmail.com"),
                new ClientDTO(2, "Maria", "maria@gmail.com"),
                new ClientDTO(3, "Jorge", "jorge@gmail.com"),
                new ClientDTO(4, "Diego", "diego@gmail.com")
        );
    }
}
