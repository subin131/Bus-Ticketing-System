package register.main;
import java.sql.SQLException;
import java.util.Scanner;

import register.database.Database;
import register.model.Register;
public class MainClassRegister {
public static void main(String [] args) throws SQLException {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first name:");
	String fn=sc.nextLine();
	sc.nextLine();
	System.out.println("Enter the last name:");
	String ln=sc.nextLine();
	sc.nextLine();
	System.out.println("Enter the Username:");
	String un=sc.nextLine();
	sc.nextLine();
	System.out.println("Enter the password:");
	String p=sc.nextLine();
	sc.nextLine();
	System.out.println("Enter the confirm password:");
	String cp=sc.nextLine();
	
	Register r=new Register (fn,ln,un,p,cp);
	
	Database db=new Database();
	db.addRegister(r);
}
}
