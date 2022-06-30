import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample {
    public static void main(String[] args) {
        try{
            Path p = Paths.get("newDirectory");
            // will delte the file or directory
            Files.deleteIfExists(p);

            Path p1 = Paths.get("Directories.java");
            System.out.println("Parent: " + p1.getParent());
            System.out.println("Root: " + p1.getRoot());
            System.out.println("FileName: " + p1.getFileName());
        }catch(IOException e){

        }
    }
    
}
