import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ImageStoring {

	public static void main(String[] args) throws FileNotFoundException {
		try{
			Connection conn = DBUtil.getConnection(DBType.MySql);
			
			//For images
			/* 
			String sql = "Insert into images values(?,?)";
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, "myImage");
			
			FileInputStream inputStream = new FileInputStream("D:\\Kiran\\Untitled2.jpg");
			statement.setBinaryStream(2, inputStream);
			*/
			
			//For files
			String sql = "Insert into files values(?,?)";
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, "myfile");
			
			FileInputStream inputStream = new FileInputStream("D:\\Java_Workspace\\JDBC_Application\\files\\file1.txt");
			statement.setBinaryStream(2, inputStream);
			
			int rows = statement.executeUpdate();
			System.out.println("Rows updated : "+rows);
		}
		catch(SQLException e){
			DBUtil.showErrorMessage(e);
		}
	}

}
