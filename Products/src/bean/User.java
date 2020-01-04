package bean;

public class User {
	private int loginid;
	private String password;
	private String email;

	public User(int loginid, String password, String email) {
		this.loginid = loginid;
		this.password = password;
		this.email = email;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

	public int getLoginid() {
		return loginid;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}

	public void setLoginid(int loginid) {
		this.loginid = loginid;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [loginid=" + loginid + ", password=" + password + ", email=" + email + "]";
	}
	
}
