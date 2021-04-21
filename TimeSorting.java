import java.util.Comparator;

public class TimeSorting implements Comparator {
  public int compare(Object obj1, Object obj2) {
    Registrant object1 = (Registrant) obj1;
    Registrant object2 = (Registrant) obj2;

    return object1.getName().compareTo(object2.getName());
  }
}