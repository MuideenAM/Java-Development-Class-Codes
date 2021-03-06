import java.util.Locale;
import java.util.Date;
import java.util.Comparator;
import java.text.DateFormat;
 
public class Registrant 
{
    private String name;
    private String time;
    
    DateFormat df = DateFormat.getTimeInstance(DateFormat.MEDIUM, new Locale("en", "US"));

    public Registrant(String nm)
    {
        this.name = nm;
        this.time = df.format(new Date());
    }
    
    public String getTime()
    {
        return time;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String toString() 
    {
        StringBuffer buffer = new StringBuffer();
        buffer.append("Name: "+ name +"\n");
        buffer.append("Registration Time: " + time + "\n");
        return buffer.toString();
    }
}

class TimeCompare implements Comparator {
   public int compare(Object a, Object b)
    {
        Registrant r1 = (Registrant) a;
        Registrant r2 = (Registrant) b;
       
        return r1.getTime().compareTo( r2.getTime() );

    }
}