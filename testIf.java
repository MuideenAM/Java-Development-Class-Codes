public class testIf {
  public static void main( String[] args ) {
    int a = 2, b = 3;

    if(a > b)
      a--;
      b++;
    else
      a++;

    System.out.println("a = " + a + " and b = " + b); 
  }
}