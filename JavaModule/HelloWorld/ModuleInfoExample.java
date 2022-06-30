package HelloWorld;


// we can import BufferedImage as we required it already in module-info.java 
import java.awt.image.BufferedImage;


public class ModuleInfoExample {
    // BufferedImage is not a part of standard jdk so we need to include it using module-info.java file
    BufferedImage image;
    public static void main(String[] args) {
        System.out.println("Working now");
    }
    
}
