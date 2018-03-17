import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;


public class ResultSetMetadata {

	public static void main(String[] args) {
		
		try{
			Connection conn = DBUtil.getConnection(DBType.MySql);
			Statement stmnt = conn.createStatement();
			ResultSet rs = stmnt.executeQuery("select * from employees");
			ResultSetMetaData rsmd = rs.getMetaData();
			
			System.out.println("Total columns: "+rsmd.getColumnCount());
			System.out.println("First column name: "+rsmd.getColumnName(1));
			System.out.println("First column type: "+rsmd.getColumnType(1));
			System.out.println("Table name: "+rsmd.getTableName(3));
			
			System.out.println("***********************************");
			
			DatabaseMetaData dbmd = conn.getMetaData();
			System.out.println("Driver Name: "+dbmd.getDriverName());  
			System.out.println("Driver Version: "+dbmd.getDriverVersion());  
			System.out.println("UserName: "+dbmd.getUserName());  
			System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());  
			System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion());  
		}
		catch(SQLException ex){
			DBUtil.showErrorMessage(ex);
		}
	}

}
