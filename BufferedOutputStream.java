import java.io.BufferedOutputStream;
import java.io.IOException;

public class BufferedOutputStreamDemo 
{
    public static void main(String[] args) 
    {
        try (BufferedOutputStream b = new BufferedOutputStream(System.out)) 
        {
            String s = "This is a BufferedOutputStream Demo Program";
            byte buf[] = s.getBytes();

            b.write(buf);
            b.flush();
        } 
        catch (IOException e) 
        {
            System.out.println(e);
        }
    }
}
