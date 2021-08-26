package register.model;

public class Register {
private String firstName;
private String lastName;
private String Username;
private String Password;
private String ConfirmPassword;

public Register (String fm,String ln,String un,String p,String cp) {
	firstName=fm;
	lastName=ln;
	Username=un;
	Password=p;
	ConfirmPassword=cp;
	
}
public Register() {
	// TODO Auto-generated constructor stub
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
public String getConfirmPassword() {
	return ConfirmPassword;
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
