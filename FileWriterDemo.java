import java.io.FileWriter;
import java.io.IOException;

class FileWriterDemo 
{
    public static void main(String args[]) 
    {
        try (FileWriter f = new FileWriter("sampleFile.txt ")) 
        {
            String source = "This is FileWriter Program";
            char buffer[] = new char[source.length()];
            source.getChars(0, source.length(), buffer, 0);
            f.write(buffer);
        } 

        catch (IOException e) 
        {
            System.out.println(e);
        }
    }
}

