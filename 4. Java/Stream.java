import java.util.List;
import java.util.ArrayList;

class Book{
    String auther;
    public Book(String auther){
        this.auther = auther;
    }

    String getAuther(){
        return auther;
    }

    public String toString(){
        return auther;
    }
}

public class Stream {
    public static void main(String[] args) {
        List<Book> books = new ArrayList();
        
        books.add(new Book("Sahcin"));
        books.add(new Book("Pradeep"));
        books.add(new Book("Arun"));

        //stream are only available in collection
        books.stream().filter(book->{
            return book.getAuther().startsWith("S");
        })  //we can also add another filter method after the first one
        .forEach(System.out::println);

    }
}
