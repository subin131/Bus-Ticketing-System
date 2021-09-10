package booking.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTable;

import booking.model.Booking;



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
	public void addBooking(Booking b) throws SQLException {
		sql= "Insert into booking Values( ?,?,?,?,?,?,?,?,?,?,?,?);";
	    statement= con.prepareStatement(sql);
	    statement.setInt(1, b.getBookingID());
	    statement.setString(2, b.getFirstName());
	    statement.setString(3,b.getlastName());
	    statement.setString(4,b.getMobileNo());
	    statement.setString(5,b.getAddress());
	    statement.setString(6,b.getGender());
	    statement.setString(7,b.getBookingDate());
	    statement.setString(8,b.getDestination());
	    statement.setString(9,b.getNumberOfDays());
	    statement.setString(10,b.getNumberOfSeatBoking());
	    statement.setString(11,b.getBusType());
	    statement.setString(12,b.getPaymentType());
	    
	    
	    statement.executeUpdate();
	    statement.close();
	    
		
	}
	//retrieves all the login details stored in db
	  public ArrayList<Booking> viewBooking(int bookID,JTable table) throws SQLException {
	    sql= "Select * from booking where Booking_ID="+bookID;
	    statement= con.prepareStatement(sql);
	    
	    ArrayList<Booking> allBooking= new ArrayList<>();

	    resultSet= statement.executeQuery();
	    System.out.println(resultSet);

	    while(resultSet.next()){
	      table.setValueAt(resultSet.getInt(1), 0, 1);
	      table.setValueAt(resultSet.getString(2), 1, 1);
	      table.setValueAt(resultSet.getString(3), 2, 1);
	      table.setValueAt(resultSet.getString(4), 3, 1);
	      table.setValueAt(resultSet.getString(5), 4, 1);
	      table.setValueAt(resultSet.getString(6), 5, 1);
	      table.setValueAt(resultSet.getString(7), 6, 1);
	      table.setValueAt(resultSet.getString(8), 7, 1);
	      table.setValueAt(resultSet.getString(9), 8, 1);
	      table.setValueAt(resultSet.getString(10), 9, 1);
	      table.setValueAt(resultSet.getString(11), 10, 1);
	      table.setValueAt(resultSet.getString(12), 11, 1);
	      int id=resultSet.getInt(1);
	      String fn = resultSet.getString(2);
	      String ln = resultSet.getString(3);
	      String mn=resultSet.getString(4);
	      String add = resultSet.getString(5);
          String gen=resultSet.getString(6);
          String bd=resultSet.getString(7);
	      String des = resultSet.getString(8);
	      String noOfDays= resultSet.getString(9);
	      String numberOfSeatBooking = resultSet.getString(10);
	      String bt = resultSet.getString(11);
	      String pt= resultSet.getString(12);
	      
	      

	      allBooking.add(new Booking(id,fn,ln,mn,add,gen,bd,des,noOfDays,numberOfSeatBooking,bt,pt));
	    }
	   
	    for (Booking b : allBooking) {
			System.out.println(b);
		}
	    statement.close();
	    return allBooking;
	  }
	  
	  
	//deletes a booking from db according to bus details.
	  public void deleteBooking( String bus) throws SQLException {
      sql= "Delete from booking where Bus = ?;";
	    statement= con.prepareStatement(sql);

	    statement.setString(1,bus);

	    statement.executeUpdate();
	    statement.close();
	  }
	//updates the address  of a customer in db by their firstname.....
	  public void updateBookingDetails(String fn,String address) throws SQLException{
	    sql= "Update booking set Address=? where firstName =?;";
	    statement= con.prepareStatement(sql);

	    statement.setString(1,address);
	    statement.setString(2,fn);

	    statement.executeUpdate();
	    statement.close();
	  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
			
			
			
			

		
}


