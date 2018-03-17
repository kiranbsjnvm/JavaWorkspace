import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			Connection conn = DBUtil.getConnection(DBType.MySql);
			PreparedStatement  stmnt = conn.prepareStatement("Insert into employees values(1,?,?,?);");
			stmnt.setString(1, "Kiran");
			stmnt.setString(2,"Bengaluru");
			stmnt.setInt(3, 67000);
			int rows = stmnt.executeUpdate();
			System.out.println(rows+" records inserted");
			
			
			PreparedStatement  stmnt2 = conn.prepareStatement("Update employees set name = ? where id=1;");
			stmnt2.setString(1, "kkkk");
			int rows2 = stmnt2.executeUpdate();
			System.out.println(rows2+" records inserted");
		}
		catch(SQLException ex){
			DBUtil.showErrorMessage(ex);
		}
	}

}
