package booking.main;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import booking.model.Booking;

import booking.database.Database;

public class MainClassBooking {
	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		int randNo = (int) Math.round(Math.random() * ((999 - 1) + 1) + 1);
        int bookID = (randNo);
		sc.nextLine();
		System.out.println("Please enter your first Name:");
		String firstName=sc.nextLine();
		sc.nextLine();
		System.out.println("Please enter your last Name:");
		String lastName=sc.nextLine();
		sc.nextLine();
		System.out.println("Please enter your mobile number:");
		String mobileNo=sc.nextLine();
		sc.nextLine();
		System.out.println("Please enter your address:");
		String address=sc.nextLine();
		sc.nextLine();
		System.out.println("Please enter your gender:");
		String gender=sc.nextLine();
		sc.nextLine();
		System.out.println("Please enter date for booking:");
		 String BookingDate=sc.nextLine();
		sc.nextLine();
		System.out.println("Please enter the name of place which you want to visit:");
		String Destination=sc.nextLine();
		sc.nextLine();
		System.out.println("Please enter how many days you want to visit:");
		String  numberOfDays=sc.nextLine();
		sc.nextLine();
        
		System.out.println("Please enter how many seat do you want to book:");
		String numberOfSeatBooking=sc.nextLine();
		sc.nextLine();
		System.out.println("There are two types of bus :ac or non-ac");
		String BusType=sc.nextLine();
		
		System.out.println("Payment Method: Cash or E-pay");
		String paymentType=sc.nextLine();
	
	
		Booking b1=new Booking(bookID,firstName,lastName,mobileNo,address,gender,BookingDate,Destination,numberOfDays,numberOfSeatBooking,BusType,paymentType);

		
		Database db = new Database();
//   	    db.addBooking(b1);


//		db.viewBooking(bookID);
//		db.deleteBooking(Bus);
//        db.updateBookingDetails(firstName, address);  	    
//		
		
		 
		
		

	}

}
