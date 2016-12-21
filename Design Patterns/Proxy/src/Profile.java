/**
 * User Profile Class
 * @author Nitinkumar Gove *
 */
public class Profile {
	
	private  String username;
	private String emailid;
	private String password;
	
	public Profile(String username, String emailid, String password) {
		super();
		this.username = username;
		this.emailid = emailid;
		this.password = password;
	}

	public Profile() {
		this.username = "admin";
		this.emailid = "admin@sjsu.edu";
		this.password = "abc123LMN";
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
