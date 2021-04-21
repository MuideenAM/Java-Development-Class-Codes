import java.util.Iterator;

public class PromotionDemo {
  public static void main( String[] args ) {
    Iterator i;
    Student std = new Student();
    std.add("Ade Adenrele Ayinla");
    std.add("Paul Peter Solomon");
    std.add("Richard Goodluck Jonathan");
    std.add("Richard Goodluck Jonathan");
 
    Class jss1 = new Class( std );
    Class jss2 = new Class();

    jss1.promoteStudents( jss2 );

    if( jss1.students.size() > 0 ) {
      System.out.println("JSS 1 students are:\n");
      i = jss1.students.iterator();
      while( i.hasNext() ) {
        System.out.println( i.next() );
      }
    } else {
      System.out.println("No student exist in JSS 1 at the moment\n");
    }

    if( jss2.students.size() > 0 ) {
      System.out.println("JSS 2 students are:\n");
      i = jss2.students.iterator();
      while( i.hasNext() ) {
        System.out.println( i.next() );
      }
    } else {
      System.out.println("No student exist in JSS 2 at the moment\n");
    }

  }
}