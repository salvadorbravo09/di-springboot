package com.sbravoc.di.spring.boot.di.controller;

import com.sbravoc.di.spring.boot.di.dto.ClientDTO;
import com.sbravoc.di.spring.boot.di.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/client")
public class ClientController {

    /***
     * Primera forma de hacer inyeccion de dependencias
     * con @Autowired
     */
    //@Autowired
    //private ClientService clientService;

    /***
     * Segunda forma de hacer inyeccion de dependencias
     * con un Constructor
     */
    //public ClientController(ClientService clientService) {
    //    this.clientService = clientService;
    //}

    /***
     * Tercera forma de hacer inyeccion de dependencias
     * con un Lombok
     */
    private final ClientService clientService;


    @GetMapping
    public ResponseEntity<List<ClientDTO>> getAll() {
        return new ResponseEntity<>(clientService.getAll(), HttpStatus.OK);
    }
}
