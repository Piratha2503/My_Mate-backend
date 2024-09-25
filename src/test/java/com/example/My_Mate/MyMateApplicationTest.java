package com.example.My_Mate;

import com.example.My_Mate.Controllers.ClientController;
import com.example.My_Mate.DTO.Requests.ClientRequest;
import org.aspectj.weaver.ast.Var;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMateApplicationTest {

    @Test
    void saveClient(){

        ClientRequest clientRequest = new ClientRequest();
        clientRequest.setName("Name");
        clientRequest.setRasi("Rasi");
        clientRequest.setNadchathiram("Nadchathiram");

        var clientController = new ClientController();
        assertEquals("ok",clientController.addClient(clientRequest));
    }

}