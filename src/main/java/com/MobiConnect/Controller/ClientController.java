package com.MobiConnect.Controller;

import com.MobiConnect.Entity.Client;
import com.MobiConnect.Repository.ClientRepository;
import com.MobiConnect.Service.ClientService;
import com.MobiConnect.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.ResourceAccessException;

import java.sql.ClientInfoStatus;
import java.util.List;

@RestController
public class ClientController {
    @Autowired
    private ClientRepository clientRepository;

    @GetMapping("clients")
    public List<Client> getClients(){
        return this.clientRepository.findAll();
    }

    @PostMapping("addClient")
    public Client addClient(@RequestBody Client client){
        return this.clientRepository.save(client);
    }

//    @PutMapping("updateClient/{id}")
//    public ResponseEntity<Client> updateClient(@PathVariable(value = "id") Long clientId, @RequestBody Client clientDetails) throws ResourceNotFoundException{
//        Client client = clientRepository.findById(clientId)
//                .orElseThrow(()-> new ResourceNotFoundException("Client not found for this id :: " + clientId));
//        client.setLocation(clientDetails.getLocation());
//        client.setStart_date(clientDetails.getStart_date());
//        client.setEnd_date(clientDetails.getEnd_date());
//        final Client updatedClient = clientRepository.save(client);
//        return ResponseEntity.ok(updatedClient);
//    }



}
