package register.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import register.model.Register;

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
	
	public void addRegister( Register r) throws SQLException {
		sql= "Insert into user Values( ?,?,?,?,?);";
	    statement= con.prepareStatement(sql);
	    statement.setInt(1, r.getUserID());
	    statement.setString(2, r.getFirstName());
	    statement.setString(3,r.getlastName());
	    statement.setString(4,r.getUsername());
	    statement.setString(5,r.getPassword());
	    
	    
	    
	    statement.executeUpdate();
	    statement.close();
	    
		
	}
}
