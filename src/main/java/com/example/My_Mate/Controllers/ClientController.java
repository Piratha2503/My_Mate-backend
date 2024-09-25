package com.example.My_Mate.Controllers;

import com.example.My_Mate.DTO.Requests.ClientRequest;
import com.example.My_Mate.Entities.Client;
import com.example.My_Mate.Services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ClientController {
    @Autowired
    private ClientService clientService;

    @PostMapping("/addClient")
    public String addClient(@RequestBody ClientRequest clientRequest){
        clientService.saveClient(clientRequest);
        return "ok";
    }
}
