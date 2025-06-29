package database;
import java.sql.*;
import java.lang.*;

public class ConnectionProvider {
    public static Connection getConnection(){
        String url = "jdbc:mysql://localhost:3306/gms";
        String username = "root";
        String password = "deepak";
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connnection = DriverManager.getConnection(url,username,password);
            return connnection;
        }catch(Exception e){
            return null;
        }
    }

    
}
