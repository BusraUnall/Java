
package Helper;
import java.sql.*;
public class DBConnection {
    private final String userName="root";
    private final String password="12345";
    private String dbUrl="jdbc:mysql://localhost:3306/ogrenci_"
            + "kaydi?useSSL=false&serverTimezone=UTC";
    
    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection(dbUrl,userName,password);
    }
    
    public void showErrorMessage(SQLException exception){
    System.out.println("Error: "+exception.getMessage());
    System.out.println("Error code: "+exception.getErrorCode());
    }
}
