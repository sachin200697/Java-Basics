import java.io.BufferedReader;
import java.io.StringReader;
import java.io.StringWriter;

public class TryWithResources{
    public static void main(String[] args) {

        // to close these resourses automatically we can declre them inside try like this
        try(
            BufferedReader reader = new BufferedReader(new StringReader("Hello Sachin"));
            StringWriter writer = new StringWriter();
        ){

            /*
            //instead of using BufferedReader and StringWriter inside try block 
            // we can declare them in try(here) so that they will be automatically closed after the use
            BufferedReader reader = new BufferedReader(new StringReader("Hello Sachin"));
            StringWriter writer = new StringWriter();

            */

            writer.write(reader.readLine());
            System.out.println(writer.toString());
        }
        catch(Exception e){

        }

    }
}