import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Scanner;

public class RegistrationDemo 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner( System.in );

        System.out.println("\nWelcome to this Registration Portal\n");
	System.out.print("\nHow many people do you want to register? (Enter a number) ");
        int total = input.nextInt();
        input.nextLine();

        ArrayList<Registrant> obj = new ArrayList<>();

        for(int i = 0; i < total; i++) {
          
          System.out.printf( "Enter the name for person %d: ", ( i+1 ) );
          Registrant person = new Registrant( input.nextLine() );
          obj.add(person);
        }
        
        System.out.println("Registrants' details are:");
        
        ListIterator li = obj.listIterator();
        while(li.hasNext())
        {
            System.out.println(li.next());
        }
        
        Collections.sort(obj, Collections.reverseOrder(new TimeCompare()));
        
        System.out.println("Registrants' details after sorting in recency are:");
        
        ListIterator li2 = obj.listIterator();
        while(li2.hasNext())
        {
            System.out.println(li2.next());
        }
    }
}
