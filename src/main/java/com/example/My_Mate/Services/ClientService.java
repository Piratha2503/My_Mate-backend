package com.example.My_Mate.Services;

import com.example.My_Mate.DTO.Requests.ClientRequest;
import lombok.Getter;


public interface ClientService {
    void saveClient(ClientRequest clientRequest);
}
