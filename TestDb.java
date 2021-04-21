import java.sql.*;

public class TestDb {
  public static void main( String[] args ) {
    try {
      String db = "jdbc:ucanaccess:sampledb.accdb";

      //String url = "jdbc:odbc:Driver = {Microsoft Access Driver (*.mdb)}; DBQ=" + db + ";DriverID;READONLY=true";

     // Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

      Connection con = DriverManager.getConnection(db);
      Statement stmt = con.createStatement();
      ResultSet rs = stmt.executeQuery("select * from table1");

      while( rs.next() ) {
        System.out.println(rs.getString(1));
      }
    } catch( Exception e ) {
       System.out.println( e );
    }
  }
}