package login.database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import login.model.Login;


public class Database {

	String url = "jdbc:mysql://localhost:4000/individual-project?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	String username = "root";
	String password = "";
	String name = "individual-project";
    String sql = "";
	Statement stmt;
	static Connection con;
	PreparedStatement statement;
	ResultSet resultSet;
	
	
	//creates a connection to the db at object creation
	public Database() throws SQLException {
		con = (Connection) DriverManager.getConnection(url, username, password);

	} 
	
	public void addLogin(Login l) throws SQLException {
		sql= "Insert into user Values( ?,?);";
	    statement= con.prepareStatement(sql);

	    statement.setString(1, l.getUsername());
	    statement.setString(2, l.getPassword());
	    
	    
	    statement.executeUpdate();
	    statement.close();
	    
		
	}
	
	//retrieves all the login details stored in db
	  public ArrayList<Login> viewLogin() throws SQLException {
	    sql= "SELECT * FROM user WHERE Username=? AND Password=?";
	    statement= con.prepareStatement(sql);
	    
	    ArrayList<Login> allLogin= new ArrayList<>();

	    resultSet= statement.executeQuery();

	    while(resultSet.next()){
	      String username = resultSet.getString(1);
	      String password= resultSet.getString(2);
	      

	      allLogin.add(new Login(username,password));
	    }
	   
	    for (Login l : allLogin) {
			System.out.println(l);
		}
	    statement.close();
	    return allLogin;
	  }

	//deletes a login from db according to username
	  public void deleteLogin( String name) throws SQLException {
  sql= "Delete from login1 where Username = ?;";
	    statement= con.prepareStatement(sql);

	    statement.setString(1,name);

	    statement.executeUpdate();
	    statement.close();
	  }

	  //updates the password of a username in db
	  public void updateLoginPassword(String username,String password) throws SQLException{
	    sql= "Update login1 set Password=? where Username =?;";
	    statement= con.prepareStatement(sql);

	    statement.setString(1,password);
	    statement.setString(2,username);

	    statement.executeUpdate();
	    statement.close();
	  }

	
	
}
