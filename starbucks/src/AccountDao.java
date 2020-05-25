import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AccountDao 
{
	private String dburl="jdbc:mysql://localhost:3306/userdb?serverTimezone=UTC";
	private String dbuname="root";
	private String dbpassword="";
	private String dbdriver="com.mysql.jdbc.Driver";
	public void loadDriver(String dbDriver) 
	{
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	public Connection getConnection() 
	{
		
		Connection con = null;
		try {
			con = DriverManager.getConnection(dburl, dbuname, dbpassword);
		
		} catch (SQLException e) {
		
		e.printStackTrace();
	}
		return con;

}
	public String insert(UserInfo userinfo)
	{
		loadDriver(dbdriver);
		Connection con = getConnection();
		String result = "Data enterd successfully";
		String sql="insert into userdb.UserInfo values(?,?,?,?)";
		
		try {
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userinfo.getFirstName());
			ps.setString(2, userinfo.getLastName());
			ps.setString(3, userinfo.getAddress());
			ps.setString(4, userinfo.getEmail());
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = "Data not enterd";
		}
		return result;
		
	}
}
