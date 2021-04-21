import java.io.*;

public class BufferedReaderDemo 
{

    public static void main(String args[]) throws IOException 
    {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            
       
        System.out.println("Enter First number");
        String s = br.readLine();
        System.out.println("Enter Second number");
        String s1 = br.readLine();
        int i = Integer.parseInt(s);
        int i1 = Integer.parseInt(s1);
        int i3 = i + i1;
        System.out.println("Sum=" + i3);
        }
    }
}
