import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

class MyFileVisitor implements FileVisitor<Path> {

    public FileVisitResult postVisitDirectory(Path dir, IOException e) throws IOException {
        System.out.println("Just Visited " + dir);
        return FileVisitResult.CONTINUE;
    }

    
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {

        System.out.println("About to visit " + dir);
                return FileVisitResult.CONTINUE;

    }

        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {

        System.out.println("Currently visiting "+file);
        System.out.println("Is this file a directory: "+ Files.isDirectory(file));
        System.out.println("Checking done..!!");
        return FileVisitResult.CONTINUE;

    }

        public FileVisitResult visitFileFailed(Path file, IOException e) throws IOException {
        System.err.println(e.getMessage());
        return FileVisitResult.CONTINUE;
    }
//}

//public class NIODemo 
//{
    public static void main(String[] a) throws IOException
    {
Path listDir = Paths.get("special");
MyFileVisitor obj = new MyFileVisitor();
Files.walkFileTree(listDir, obj); 
    } 
}
