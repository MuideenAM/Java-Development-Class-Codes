import java.util.Scanner;

public class SyncDemo extends Thread {
  static Scanner input = new Scanner( System.in );

  static int counter = 0;
  
  static synchronized void foreverPrinter() {
    while( counter < 10 ) {
      System.out.println( Thread.currentThread().getName() + " is running." );
      counter++;
      if( counter == 5 ) input.next();
    }
  } 

  public void run() {
    foreverPrinter();
  }

  public static void main( String[] args ) throws Exception {
    SyncDemo obj1 = new SyncDemo();
    obj1.setName("Object 1");
    SyncDemo obj2 = new SyncDemo();
    obj2.setName("Object 2");
    obj2.setPriority(7);
    //obj1.join();
    obj1.start();
    System.out.println(obj2.getPriority());
    obj2.start();

  }
}