import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB {
    public static Connection connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/evaluation_8","root", "Coditas@23");
            return con;
        }catch (Exception e){
            System.out.println("Exception in connection");
        }
        return null;
    }
}
