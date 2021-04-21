import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class BufferedWriterDemo 
{
    public static void main(String args[]) 
    {
        try (BufferedWriter b = new BufferedWriter(new OutputStreamWriter(System.out))) 
        {
            String fruit[] = {"Apple", "Banana", "Grapes"};
            b.write("Different types of fruit are:" + "\n");
            for (int i = 0; i < 3; i++) 
            {
                b.write(fruit[i] + "\n");
                //b.flush();
                
            }
        } 
        catch (IOException e) 
        {
            System.out.println(e);
        }
    }
}
