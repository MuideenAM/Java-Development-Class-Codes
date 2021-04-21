import java.sql.*;

public class TryDBProg {

  static Connection conn;
static PreparedStatement ps;
static ResultSet rs;

  public static void main( String[] args ) {
    String sqlSelectAllPersons = "SELECT * FROM table1";
String connectionUrl = "jdbc:mysql://localhost:3306/sampledb?serverTimezone=UTC";

//try (
try {
conn = DriverManager.getConnection(connectionUrl, "root", "Aguns127932"); 
}catch(Exception e) {
  e.printStackTrace();
}
try{
        ps = conn.prepareStatement(sqlSelectAllPersons); 
}catch(Exception e) {
  e.printStackTrace();
}
   try{
        rs = ps.executeQuery();//) {
} catch(Exception e) {
  e.printStackTrace();
}
   try{     while (rs.next()) {
            String name = rs.getString("stname");
            int age = rs.getInt("age");
            
            System.out.println(name + " is " + age + " years in age.");
            // do something with the extracted data...
        }
} catch (SQLException e) {
    // handle the exception
    System.err.println("Error occured.");
}
  }
}