import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	static final String oraUser = "root";
	static final String oraPassword = "root";
	static final String oraDBUrl = "jdbc:mysql://localhost:3306/world";
	
	static final String mysqlUser = "root";
	static final String mysqlPassword = "root";
	static final String mysqlDBUrl = "jdbc:mysql://localhost:3306/kiran";
	
	public static Connection getConnection(DBType type) throws SQLException{
		switch(type){
		case Oracle:
			return DriverManager.getConnection(oraDBUrl,oraUser,oraPassword);
		case MySql : 
			return DriverManager.getConnection(mysqlDBUrl,mysqlUser,mysqlPassword);
			
		default: return null;
		}
	}
	
	public static void showErrorMessage(SQLException ex){
		System.err.println("Error : "+ex.getMessage());
		System.err.println("Error Code: "+ex.getErrorCode());
	}
}
