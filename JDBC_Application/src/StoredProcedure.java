import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class StoredProcedure {

	public static void main(String[] args) {
		
		try{
			Connection conn = DBUtil.getConnection(DBType.MySql);
			
			//Calling Store Procedure
			CallableStatement statement = conn.prepareCall("{call InsertData(?,?,?,?)}");
			statement.setInt(1, 2);
			statement.setString(2, "Kiran");
			statement.setString(3,"Bengaluru");
			statement.setInt(4, 67000);
			statement.execute();
			
			System.out.println("Inserted !....");
			
			
			
			//Calling stored Functions
			CallableStatement statement2 = conn.prepareCall("{? = call GetSum(?,?)}");
			statement2.setInt(2, 10);
			statement2.setInt(3, 20);
			statement2.registerOutParameter(1, Types.INTEGER);
			statement2.execute();
			
			System.out.println(statement2.getInt(1));  
		}
		catch(SQLException ex){
			DBUtil.showErrorMessage(ex);
		}
	}

}
