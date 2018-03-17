import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class TransactionManagement {

	public static void main(String[] args) throws SQLException {
		
		Connection conn = null;
		try{
			conn = DBUtil.getConnection(DBType.MySql);
			conn.setAutoCommit(false);
			
			Statement statement = conn.createStatement();
			statement.executeUpdate("Insert into employees values(9,'DP','Chennai',75000)");
			statement.executeUpdate("Insert into employees values(10,'hshs','Chennai',75000)");
			
			conn.commit();
			System.out.println("Committed successfully");
		}
		catch(SQLException e){
			conn.rollback();
			DBUtil.showErrorMessage(e);
		}finally {
			conn.close();
		}

	}

}
