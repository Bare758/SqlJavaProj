
public class UserInfo 
{
	private String fname,lname,address,email;

	public UserInfo() {
		super();
	}

	public UserInfo( String fname, String lname, String address, String email) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.email = email;
	}
	
	public String getFirstName() {
		return fname;
	}
	
	public void setUname(String fname) {
		this.fname = fname;
	}
	
	public String getLastName() {
		return lname;
	}
	
	public void setLanme(String lname) {
		this.lname = lname;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

}
