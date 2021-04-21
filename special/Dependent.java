public class Dependent {
  public static void main( String[] args ) {
    System.out.println( "Printed from within Dependent." );

    Dependant obj = new Dependant();
    obj.printSomething();
  }
}

class Dependant {
  public static void printSomething() {
    System.out.println( "Printed from within Dependant." );
  }
}