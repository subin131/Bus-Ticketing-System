package register.model;

public class Register {

private int userID;
private String firstName;
private String lastName;
private String Username;
private String Password;


public Register (int userID,String fm,String ln,String un,String p) {
	this.userID=userID;
	firstName=fm;
	lastName=ln;
	Username=un;
	Password=p;
	
	
}
public Register() {
	// TODO Auto-generated constructor stub
}
public int getUserID() {
	return userID;
}
public String getFirstName() {
	return firstName;
}
public String getlastName() {
	return lastName;
}
public String getUsername() {
	return Username;
}
public String getPassword() {
	return Password;
}

public void setDefaultCloseOperation(int exitOnClose) {
	// TODO Auto-generated method stub
	
}
public void setLocationRelativeTo(Object object) {
	// TODO Auto-generated method stub
	
}
public void pack() {
	// TODO Auto-generated method stub
	
}
public void setVisible(boolean b) {
	// TODO Auto-generated method stub
	
}


}
