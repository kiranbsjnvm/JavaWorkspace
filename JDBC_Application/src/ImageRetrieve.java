import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.interfaces.RSAKey;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ImageRetrieve {

	public static void main(String[] args) throws IOException {
	
		try{
			Connection conn = DBUtil.getConnection(DBType.MySql);
			
			//images
			/*String sql = "select * from images";
			PreparedStatement statement = conn.prepareStatement(sql);
			ResultSet result = statement.executeQuery();
			
			while(result.next()){
				Blob b = result.getBlob(2);
				byte[] content = b.getBytes(1, (int) b.length());
				
				FileOutputStream outputStream = new FileOutputStream("D:\\Java_Workspace\\JDBC_Application\\images\\"+result.getString(1)+".jpg");
				outputStream.write(content);
				outputStream.close();
			}
			*/
			
			//files
			String sql = "select * from files";
			PreparedStatement statement = conn.prepareStatement(sql);
			ResultSet result = statement.executeQuery();
			
			while(result.next()){
				Blob b = result.getBlob(2);
				byte[] content = b.getBytes(1, (int) b.length());
				
				FileOutputStream outputStream = new FileOutputStream("D:\\Java_Workspace\\JDBC_Application\\files\\"+result.getString(1)+".txt");
				outputStream.write(content);
				outputStream.close();
			}
		}
		catch(SQLException e){
			DBUtil.showErrorMessage(e);
		}
		
	}

}
