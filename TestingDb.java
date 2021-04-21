import java.sql.*;  

class TestingDb {  
  public static void main(String args[]){  
    try{

     Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "Aguns_127932");

      Statement stmt=con.createStatement();  
      ResultSet rs=stmt.executeQuery("select * from table1");  

      while(rs.next())  
        System.out.println(rs.getString(1) + "  " + rs.getInt(2));  

      con.close();  
    } catch(Exception e) { 
      System.out.println(e);}  
    }  
}  