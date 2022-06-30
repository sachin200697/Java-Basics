import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.util.*;
import java.io.*;

public class CallAPI{
    public static void main(String[] args) throws IOException, InterruptedException{

        try{
            
            var url = "https://api.github.com/users/LearnCodeWithDurgesh";
            //http request
            // HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
             var request = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();

            // HttpClient client = HttpClient.newBuilder().build();
             var client = HttpClient.newBuilder().build();

            // HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

             var response = client.send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println(response.statusCode());
            System.out.println(response.body());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
}