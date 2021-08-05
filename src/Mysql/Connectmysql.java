

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connectmysql {


    static final String URL = "jdbc:mysql://localhost:3306/thutest";
    static final String USER = "root";
    static final String PASSWORD = "Duythu@0942328401";
    public static void main(String[] args) {
        try {
            Connection connection =   DriverManager.getConnection( URL, USER, PASSWORD );
            System.out.println("Connected to the database!");
        } catch (SQLException throwables) {
            System.out.println("EROR !");
            throwables.printStackTrace();
        }


    }
}
