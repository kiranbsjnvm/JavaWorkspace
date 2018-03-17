import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class BatchProccessing {

	public static void main(String[] args) {
		
		try{
			Connection conn = DBUtil.getConnection(DBType.MySql);
			CallableStatement statement = conn.prepareCall("{call InsertData(?,?,?,?)}");
			
			statement.setInt(1, 4);
			statement.setString(2, "Sai");
			statement.setString(3,"Hydarabhad");
			statement.setInt(4, 80000);
			
			statement.addBatch();
			
			statement.setInt(1, 5);
			statement.setString(2, "Arghya");
			statement.setString(3,"Kolkat");
			statement.setInt(4, 120000);
			
			statement.addBatch();
			
			int[] rowsinseted = statement.executeBatch();
			
			System.out.println("Rows inserted are : "+rowsinseted.length);
		}
		catch(SQLException e){
			DBUtil.showErrorMessage(e);
		}
	}

}
