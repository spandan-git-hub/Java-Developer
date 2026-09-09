import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
    public static void main(String[] args) {
        
        String sql = "select name from product where id = 8";
        String url = "jdbc:postgresql://localhost:5432/JDBC";
        String username = "postgres";
        String password = "root";

        try {
            Connection con = DriverManager.getConnection(url, username, password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            rs.next();
            String name = rs.getString(1);
            System.out.println(name);
            con.close();
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
