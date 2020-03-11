package client;

import dao.ConnectionProvider;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ClientDAOImpl implements ClientDAO {
    private static Connection connection;
    private static PreparedStatement ps;


    public int insertClient (Client client) {
        int status = 0;
        try {
            connection = ConnectionProvider.getConnection();
            ps = connection.prepareStatement("INSERT INTO client VALUES(?,?,?)");
            ps.setString(1, client.getEmail());
            ps.setString(2, client.getPassword());
            ps.setString(3, client.getName());
            status = ps.executeUpdate();
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }

    public Client getClient (String email, String password) {
        Client client = new Client();

        try {
            connection = ConnectionProvider.getConnection();
            ps.getConnection().prepareStatement("SELECT * FROM client WHERE email=? and password=?");
            ps.setString(1, email);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                client.setEmail(rs.getString(1));
                client.setPassword(rs.getString(2));
                client.setName(rs.getString(3));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return client;
    }
}
