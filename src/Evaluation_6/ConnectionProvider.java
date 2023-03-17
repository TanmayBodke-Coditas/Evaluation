package Evaluation_6;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {

    static Connection connection;
    public static Connection createConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/evaluation6", "root", "Coditas@23");
            System.out.println("Connection Established.....");
        }catch (Exception e){
            System.out.println("Exception");
        }

        return connection;
    }
}
