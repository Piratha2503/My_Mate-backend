package com.example.My_Mate.Services;

import com.example.My_Mate.DTO.Requests.ClientRequest;
import com.example.My_Mate.Entities.Client;

public interface ClientService {
    Client saveClient(ClientRequest clientRequest);
}
