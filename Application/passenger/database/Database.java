package passenger.database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import passenger.model.Passenger;



public class Database {
	String url = "jdbc:mysql://localhost:4000/bus-passenger?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	String username = "root";
	String password = "";
	String name = "bus-passenger";
    String sql = "";
	Statement stmt;
	static Connection con;
	PreparedStatement statement;
	ResultSet resultSet;
	
	//creates a connection to the db at object creation
	public Database() throws SQLException {
		con = (Connection) DriverManager.getConnection(url, username, password);

	}
	
//	// adding the new passenger
	public void addPassenger(Passenger p) throws SQLException {

		sql= "Insert into table1 Values( ?,?,?,?);";
	    statement= con.prepareStatement(sql);

	    statement.setInt(1, p.getPassengerID());
	    statement.setString(2,p.getName());
	    statement.setInt(3,p.getContact());
	    statement.setString(4,p.getPassengerType());
	    
	    statement.executeUpdate();
	    statement.close();
	    
}
	 //retrieves all the passenger stored in db
	  public ArrayList<Passenger> viewPassenger() throws SQLException {
	    sql= "Select * from books;";
	    statement= con.prepareStatement(sql);
	    
	    ArrayList<Passenger> allPassenger= new ArrayList<>();

	    resultSet= statement.executeQuery();

	    while(resultSet.next()){
	      int passId = resultSet.getInt(1);
	      String passengerName= resultSet.getString(2);
	      int contact = resultSet.getInt(3);
	      String passengerType = resultSet.getString(4);

	      allPassenger.add(new Passenger(passId,passengerName,contact,passengerType));
	    }
	    statement.close();
	    return allPassenger;
	  }
//	  
//	//deletes a book from db according to book ID
	  public void deletePassenger( int passID) throws SQLException {
    sql= "Delete from table1 where pass_id = ?;";
	    statement= con.prepareStatement(sql);

	    statement.setInt(1,passID);

	    statement.executeUpdate();
	    statement.close();
	  }
//	//updates the name of passenger by id in db
	  public void updateBookName(String passId,String name) throws SQLException{
	    sql= "Update books set Name =? where pass_id =?;";
	    statement= con.prepareStatement(sql);

	    statement.setString(1,name);
	    statement.setString(2,passId);

	    statement.executeUpdate();
	    statement.close();
	  }
//
//	  //updates the name of author of a book in db
//	  public void updateBookAuthor(String bookID,String value) throws SQLException{
//	    sql= "Update books set Author =? where Book_id =?;";
//	    statement= con.prepareStatement(sql);
//
//	    statement.setString(1,value);
//	    statement.setString(2,bookID);
//
//	    statement.executeUpdate();
//	    statement.close();
//	  }
//
//	  //updates the price of a book in db
//	  public void updateBook(String bookID,int value) throws SQLException{
//	    sql= "Update books set Price=? where Book_id =?;";
//	    statement= con.prepareStatement(sql);
//
//	    statement.setInt(1,value);
//	    statement.setString(2,bookID);
//
//	    statement.executeUpdate();
//	    statement.close();
//	  }
//
//	  //updates the availability of a book in db
//	  public void updateBook(String bookID, boolean value) throws SQLException{
//	    sql= "Update books set Available=? where Book_id =?;";
//	    statement= con.prepareStatement(sql);
//
//	    statement.setBoolean(1,value);
//	    statement.setString(2,bookID);
//
//	    statement.executeUpdate();
//	    statement.close();
//	  }
//	
	//closes the connection to the db
	public static void closeConnection() throws SQLException {
	    con.close();
	  }

	public void close() {
		// TODO Auto-generated method stub
		
	}
	
	}	
			
			
			
			

		

