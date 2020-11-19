import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class BookDetailsFor {
    public static void main(String[] args){
        Book b1 = new Book(1 , "sapiens" ,"yuval noah harari", "vintage");
        Book b2 = new Book(2 , "the brief history of time " ,"Stephen Hawking", "bantam");
        Book b3 = new Book(3 , "Spock must die" ,"James Blish", "bantam");

        //creating a list of books
        List<Book> books = new ArrayList<Book>() ;
        books.add(b1) ;
        books.add(b2) ;
        books.add(b3) ;

        // creating a dynamic list for comparing bok publishers

        for(Book book1 : books){
            int count = 0 ;
            HashSet<String> bookPublisher = new HashSet<String>() ;
            for ( Book book2 : books){
                if(book1.getPublisher().equals(book2.getPublisher())){
                    System.out.println(book1.getPublisher()+ " "+ book2.getPublisher());
                    count ++ ;
                    bookPublisher.add(book1.getName());


                }
            }
            if(count >= 2 ){
                System.out.println(bookPublisher);
            }
        }

    }
}