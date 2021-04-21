import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

//Locale tf = new Locale("en", "US");

public class Registrant implements Comparable{
  private String name;
  private String time;

  public Registrant(String nm) {
    name = nm;
    DateFormat df = DateFormat.getTimeInstance(DateFormat.MEDIUM, new Locale("en", "US"));
    time = df.format(new Date());
  }

  public String getTime() {
    return this.time;
  }

  public String getName() {
    return this.name;
  }

  public int compareTo(Object obj) {
        Registrant obj2 = (Registrant) obj;
        return getName().compareTo(obj2.getName());
  }

  public String toString() {
    return "\nName: " + name + "\nRegistered at: " + time;
  }
}