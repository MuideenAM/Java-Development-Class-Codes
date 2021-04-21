import java.util.Locale;
import java.util.Date;
import java.text.DateFormat;

public class ToStringDemo {
  
  
  public String toString() {
    return "This is just a demo class for toString()";
  }

  public static void main( String[] args ) {
    ToStringDemo tsd = new ToStringDemo();
    DateFormat df = DateFormat.getTimeInstance(DateFormat.MEDIUM, new Locale("en", "US"));
  
    String time = df.format(new Date());
    System.out.println(time);
  }
}