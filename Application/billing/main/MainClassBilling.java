package billing.main;

import java.sql.SQLException;
import java.util.Scanner;

import billing.database.Database;
import billing.model.Billing;



public class MainClassBilling {
	public static void main(String[]args) throws SQLException{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the billing id:");
		String billNo=sc.nextLine();
		System.out.println("Enter the Number of days:");
		int nd=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the price per seat:");
		double price=sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter the PaymentType:");
		String pay=sc.nextLine();
		Billing b=new Billing(billNo, nd,price, pay);
		
		Database db=new Database();
//		db.addBills(b);
//        db.viewBilling();
//        db.deleteBilling(billNo);
        db.updateBillingDetails(billNo, nd);
		 }
		
}
