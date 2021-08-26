package billing.database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import billing.model.Billing;



public class Database {
	String url = "jdbc:mysql://localhost:4000/bus-billing?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	String username = "root";
	String password = "";
	String name = "bus-billing";
    String sql = "";
	Statement stmt;
	static Connection con;
	PreparedStatement statement;
	ResultSet resultSet;
	
	
	//creates a connection to the db at object creation
	public Database() throws SQLException {
		con = (Connection) DriverManager.getConnection(url, username, password);

	} 
	
	public void addBills(Billing bi) throws SQLException {
		sql= "Insert into user1 Values( ?,?,?,?,?);";
	    statement= con.prepareStatement(sql);

	    statement.setString(1, bi.getBillId());
	    statement.setInt(2,bi.getNoOfDays());
	    statement.setDouble(3,bi.getPricePerSeat());
	    statement.setDouble(4,bi.getTotalAmount());
	    statement.setString(5,bi.getPaymentType());
	    
	    
	    statement.executeUpdate();
	    statement.close();
	    
		
	}
	//retrieves all the login details stored in db
	  public ArrayList<Billing> viewBilling() throws SQLException {
	    sql= "Select * from user1;";
	    statement= con.prepareStatement(sql);
	    
	    ArrayList<Billing> allBilling= new ArrayList<>();

	    resultSet= statement.executeQuery();

	    while(resultSet.next()){
	      String billId = resultSet.getString(1);
	      int noOfDays= resultSet.getInt(2);
	      double pricePerSeat= resultSet.getDouble(3);
	      double totalAmount= resultSet.getDouble(4);
	      String paymentType= resultSet.getString(5);
	      
	      

	      allBilling.add(new Billing(billId,noOfDays,pricePerSeat,paymentType));
	    }
	   
	    for (Billing b : allBilling) {
			System.out.println(b);
		}
	    statement.close();
	    return allBilling;
	  }
	//deletes a billing from db according to billing id.
	  public void deleteBilling( String billId) throws SQLException {
      sql= "Delete from user1 where BillId = ?;";
	    statement= con.prepareStatement(sql);

	    statement.setString(1,billId);

	    statement.executeUpdate();
	    statement.close();
	  }
	  //updates the number of seat of a customer in db by their billID.....
	  public void updateBillingDetails(String billId,int noOfDays) throws SQLException{
	    sql= "Update user1 set NumberOfDays=? where BillId =?;";
	    statement= con.prepareStatement(sql);

	    statement.setInt(1,noOfDays);
	    statement.setString(2,billId);

	    statement.executeUpdate();
	    statement.close();
	  }


}
