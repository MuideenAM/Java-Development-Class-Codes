import java.util.Collections;
import java.util.Scanner;
import java.util.ListIterator;
import java.util.ArrayList;

public class RegistrationDemo {
  public static void main( String[] args) {
    Registrant newReg;

    Scanner input = new Scanner(System.in);
    ArrayList<Registrant> reg = new ArrayList<Registrant>();

    System.out.println("\nHow many people are you registering? ");
    int num = input.nextInt();
    input.nextLine();
     
    for(int i=0; i < num; i++) {
      System.out.printf( "\nEnter the name of registrant %d: ", (i+1) );
      newReg = new Registrant(input.nextLine());
      reg.add(newReg);
    }

    Collections.sort(reg);
 
    ListIterator i = reg.listIterator();

    while( i.hasNext() ) {
      System.out.println(i.next());
    }
  }
}