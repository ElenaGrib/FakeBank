package client;

import client.Client;

public interface ClientDAO {

    int insertClient (Client client);

    Client getClient (String email, String password);
}