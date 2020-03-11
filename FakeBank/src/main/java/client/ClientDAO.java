package client;

public interface ClientDAO {
    int insertClient (Client client);

    Client getClient (String email, String password);
}
