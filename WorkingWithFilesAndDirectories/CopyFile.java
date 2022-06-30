import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyFile {
    public static void main(String[] args) {
        try {
            Path source = Paths.get("./Example.text");
            Path destination = Paths.get("./NewFile.text");
    
            // it will give exception if file already exists
            // Files.copy(source, destination);

            // if file already exist then we can replace the file
            Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);

            // we can also use var in advance versions fo java(above or equal java11)
            // but we can not change it's type after initializing it
            var v = "Sachin";

            System.out.println(v);
            
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
    
}
