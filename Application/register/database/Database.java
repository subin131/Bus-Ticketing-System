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
	String url = "jdbc:mysql://localhost:4000/bus-register?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	String username = "root";
	String password = "";
	String name = "bus-register";
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

	    statement.setString(1, r.getFirstName());
	    statement.setString(2,r.getlastName());
	    statement.setString(3,r.getUsername());
	    statement.setString(4,r.getPassword());
	    statement.setString(5,r.getConfirmPassword());
	    
	    
	    statement.executeUpdate();
	    statement.close();
	    
		
	}
}
