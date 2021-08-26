package booking.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import booking.model.Booking;



public class Database {
	String url = "jdbc:mysql://localhost:4000/bus-booking?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	String username = "root";
	String password = "";
	String name = "bus-booking";
    String sql = "";
	Statement stmt;
	static Connection con;
	PreparedStatement statement;
	ResultSet resultSet;
	
	
	//creates a connection to the db at object creation
	public Database() throws SQLException {
		con = (Connection) DriverManager.getConnection(url, username, password);

	} 
	public void addBooking(Booking b) throws SQLException {
		sql= "Insert into user1 Values( ?,?,?,?,?,?,?,?,?);";
	    statement= con.prepareStatement(sql);

	    statement.setString(1, b.getFirstName());
	    statement.setString(2,b.getlastName());
	    statement.setString(3,b.getAddress());
	    statement.setString(4,b.getDestination());
	    statement.setInt(5,b.getNumberOfDays());
	    statement.setString(6,b.getBus());
	    statement.setInt(7,b.getNumberOfSeatBoking());
	    statement.setString(8,b.getBusType());
	    statement.setString(9,b.getPaymentType());
	    
	    
	    statement.executeUpdate();
	    statement.close();
	    
		
	}
	//retrieves all the login details stored in db
	  public ArrayList<Booking> viewBooking() throws SQLException {
	    sql= "Select * from user1;";
	    statement= con.prepareStatement(sql);
	    
	    ArrayList<Booking> allBooking= new ArrayList<>();

	    resultSet= statement.executeQuery();

	    while(resultSet.next()){
	      String fn = resultSet.getString(1);
	      String ln = resultSet.getString(2);
	      String add = resultSet.getString(3);
	      String des = resultSet.getString(4);
	      int noOfDays= resultSet.getInt(5);
	      String bus = resultSet.getString(6);
	      int numberOfSeatBooking = resultSet.getInt(7);
	      String bt = resultSet.getString(8);
	      String pt= resultSet.getString(9);
	      
	      

	      allBooking.add(new Booking(fn,ln,add,des,noOfDays,bus,numberOfSeatBooking,bt,pt));
	    }
	   
	    for (Booking b : allBooking) {
			System.out.println(b);
		}
	    statement.close();
	    return allBooking;
	  }
	//deletes a booking from db according to bus details.
	  public void deleteBooking( String bus) throws SQLException {
      sql= "Delete from user1 where Bus = ?;";
	    statement= con.prepareStatement(sql);

	    statement.setString(1,bus);

	    statement.executeUpdate();
	    statement.close();
	  }
	//updates the address  of a customer in db by their firstname.....
	  public void updateBookingDetails(String fn,String address) throws SQLException{
	    sql= "Update user1 set Address=? where firstName =?;";
	    statement= con.prepareStatement(sql);

	    statement.setString(1,address);
	    statement.setString(2,fn);

	    statement.executeUpdate();
	    statement.close();
	  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
			
			
			
			

		
}


