package myConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class myConnection {
	public static Connection getConnection(){
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost:4000/individual-project?useSSL=false","root","");
        }catch(Exception ex){
            System.out.println(ex.getMessage());
           
        }
        return con;
       
    }
}
