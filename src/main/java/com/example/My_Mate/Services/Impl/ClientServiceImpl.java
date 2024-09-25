package com.example.My_Mate.Services.Impl;

import com.example.My_Mate.DTO.Requests.ClientRequest;
import com.example.My_Mate.Entities.Client;
import com.example.My_Mate.Repositories.ClientRepository;
import com.example.My_Mate.Services.ClientService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;


    @Override
    public Client saveClient(ClientRequest clientRequest) {
        Client client = new Client();
        BeanUtils.copyProperties(clientRequest,client);
        return clientRepository.save(client);
    }
}
