package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider implements Provider {
    static Connection connection = null;

    public static Connection getConnection () {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(connectionUrl, username, password);
            System.out.println("Connection to Store DB succesfull!");

        } catch (Exception e) {
            System.out.println("Connection failed...");
            System.out.println(e);
        }
        return connection;
    }

}
