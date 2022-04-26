package Creational_DP_HMW.Singleton;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        Person person=new Person("Satenik","Gabrielyan",31);
        String query = "Insert into example1(firstName, lastName )  " +
                "value('" + person.getFirstName() + "' , '" +
                person.getLastName()+ "')";
        String query1 = "Insert into example1(firstName, lastName )  " +
                "value('" + person.getFirstName() + "' , '" +
                person.getLastName()+ "')";
         Connection connection=DatabaseConnection.getConnection();
        Statement stmt = null;

        try {
            stmt = connection.createStatement();

            stmt.execute(query);



        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }




    }
}
