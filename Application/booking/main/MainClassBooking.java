package booking.main;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import booking.model.Booking;

import booking.database.Database;

public class MainClassBooking {
	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to our Booking Service:");
		System.out.println("Please enter your first Name:");
		String firstName=sc.nextLine();
		sc.nextLine();
		System.out.println("Please enter your last Name:");
		String lastName=sc.nextLine();
		sc.nextLine();
		System.out.println("Please enter your address:");
		String address=sc.nextLine();
		sc.nextLine();
		System.out.println("Please enter the name of place which you want to visit:");
		String Destination=sc.nextLine();
		sc.nextLine();
		System.out.println("Please enter how many days you want to visit:");
		int  numberOfDays=sc.nextInt();
		sc.nextLine();
        System.out.println("Enter the bus details:");
        String Bus=sc.nextLine();
		System.out.println("Please enter how many seat do you want to book:");
		int numberOfSeatBooking=sc.nextInt();
		sc.nextLine();
		System.out.println("There are two types of bus :ac or non-ac");
		String BusType=sc.nextLine();
		
		System.out.println("Payment Method: Cash or E-pay");
		String paymentType=sc.nextLine();
	
	
		Booking b1=new Booking(firstName,lastName,address,Destination,numberOfDays,Bus,numberOfSeatBooking,BusType,paymentType);

		
		Database db = new Database();
   	    db.addBooking(b1);
//   	    db.viewBooking();
//		db.deleteBooking(Bus);
//        db.updateBookingDetails(firstName, address);  	    
//		
		
		 
		
		

	}

}
