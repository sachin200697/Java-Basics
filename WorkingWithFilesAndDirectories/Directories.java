import java.io.File;
import java.io.FilenameFilter;

class Directories {
    public static void main(String[] args) {
    
        // list of all files and folders in the parent directory
        String contents [] = new File("../.").list();

        for(String s: contents){
            System.out.println(s);
        }

        // to create directory
        // if directory already present then will not create it again
        new File("newDirectory").mkdir();

        // filter the file names
        // FilenameFilter is a interface 
        FilenameFilter filter = (file, fileName)->{
            // all the files that contains a . in it's name
            return fileName.contains(".");
        };
        contents = new File("../.").list(filter);
        for(String s: contents){
            System.out.println(s);
        }
    }
}