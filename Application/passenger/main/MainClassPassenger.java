package passenger.main;

import java.sql.SQLException;
import java.util.Scanner;

import passenger.database.Database;
import passenger.model.Passenger;




public class MainClassPassenger {
	public static void main(String[]args) throws SQLException{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the passenger id:");
		int passengerId=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the fullName:");
		String fullName=sc.nextLine();
		sc.nextLine();
		System.out.println("Enter the contact number:");
		int contact=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Passenger Type:");
		String passengerType=sc.nextLine();
		
		Passenger p=new Passenger(passengerId,fullName,contact,passengerType);
		Database db=new Database();
        db.addPassenger(p);
		
}
}	
