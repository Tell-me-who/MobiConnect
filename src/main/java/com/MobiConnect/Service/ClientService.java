package com.MobiConnect.Service;

import com.MobiConnect.Entity.Client;
import com.MobiConnect.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

//    static
//    List<Client> clientList = new ArrayList<>();
//
//    public ClientService(){
//        clientList.add(new Client(1L,"New York", "2020/02/10","2022/02/10"));
//        clientList.add(new Client(2L,"London","2019/05/20","2020/01/10"));
//
//
//    }
//
    public List<Client> getAllClients(){
        List<Client> clientList = new ArrayList<>();
        clientRepository.findAll().forEach(clientList::add);
        return clientList;
    }

    //get client - GetMapping
    public Client getClient(long id){
        Optional<Client> optionalClient = clientRepository.findById(id);
        if(optionalClient.isPresent()){
            return optionalClient.get();
        }
        return null;
    }


    //add client PostMapping
    public void addClient(Client client){
        clientRepository.save(client);
    }

    //update client PutMapping
    public void updateClient(Client client){
        clientRepository.save(client);
    }





}
