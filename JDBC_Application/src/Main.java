import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Main {
	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Connection conn = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		try {
			conn = DBUtil.getConnection(DBType.MySql);
			
			//statement = conn.createStatement();
			statement = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			
			resultSet = statement.executeQuery("select * from country;");
			//resultSet.last();
			//System.out.println("No of rows : "+resultSet.getRow());

			
			while(resultSet.next()){
				System.out.println("Code : "+resultSet.getString("code")+"\t Name : "+resultSet.getString("Name"));
			}
			System.out.println("***************************");
			while(resultSet.previous()){
				System.out.println("Code : "+resultSet.getString("code")+"\t Name : "+resultSet.getString("Name"));
			}
			
		} catch (SQLException e) {
			//System.out.println("Not Connected");
			DBUtil.showErrorMessage(e);
		}finally{
			
			if(resultSet !=null)
				resultSet.close();
			if(statement !=null)
				statement.close();
			if(conn !=null)
				conn.close();
		}
	}

}
