package login.main;
import java.sql.SQLException;
import java.util.Scanner;

import login.database.Database;
import login.model.Login;

public class MainClassLogin {
	public static void main(String [] args) throws SQLException {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the username:");
	String un=sc.nextLine();
	sc.nextLine();
	System.out.print("Enter the password:");
	String pass=sc.nextLine();
	
	Login l=new Login(un,pass);
	Database db=new Database();
//	db.addLogin(l);
	db.viewLogin();
//	db.deleteLogin(un);
//	db.updateLoginPassword(un,pass);
	}
}
