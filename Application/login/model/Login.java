package login.model;

public class Login {
	private String username;
	private String password;
	
	
	public Login (String un,String pass) {
		username=un;
		password=pass;
	}
	
	public Login() {
		// TODO Auto-generated constructor stub
	}

	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String toString() {
		return "Login [ Username=" + username + ", Password=" + password + "]";
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}


