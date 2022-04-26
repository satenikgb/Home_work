package Creational_DP_HMW.Singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static Connection connection=null;
    static {
        String url = "jdbc:mysql://localhost:3306/example";
        String user = "root";
        String password = "root";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.printf("Driver loaded");
            connection = DriverManager.getConnection(url,user,password );
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
    public static Connection getConnection(){
        return connection;
    }
}
