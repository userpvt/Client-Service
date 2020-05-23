package by.dorozhynski.rest_application.service;

import by.dorozhynski.rest_application.model.Client;

import java.util.List;

public interface ClientService {

    //Create New Client
    void create(Client client);

    //Get All Clients
    List<Client> readAll();

    //Get All Clients by Id
    Client read(int id);

    //Update Client with specific Id
    boolean update(Client client, int id);

    //Delete Client by Id
    boolean delete(int id);

}
