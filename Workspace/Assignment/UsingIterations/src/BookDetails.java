import java.util.*;

public class BookDetails {
    public static void main(String [] args){
        Book b1 = new Book(1 , "sapiens" ,"yuval noah harari", "vintage");
        Book b2 = new Book(2 , "the brief history of time " ,"Stephen Hawking", "bantam");
        Book b3 = new Book(3 , "Spock must die" ,"James Blish", "bantam");

        //creating a list of books
        List<Book> books = new ArrayList<Book>() ;
        books.add(b1) ;
        books.add(b2) ;
        books.add(b3) ;

        // creating a dynamic list for comparing bok publishers
        //List<Book> bookPublisher = new ArrayList<Book>() ;


        // traversing through books
        Iterator<Book> value = books.iterator();

        while (value.hasNext()){
            int count = 0 ;
            Book book1 = value.next();
            HashSet<String> bookPublisher = new HashSet<String>() ;
            Iterator<Book> value2 = books.iterator();
            while(value2.hasNext()){
                Book book2 = value2.next();
                if(book1.getPublisher().equals(book2.getPublisher())){
                    count++;
                    bookPublisher.add(book1.getName());
                }

            }
            if(count >= 2 ){
                System.out.println(bookPublisher);
            }

        }




        //=================================================================================================================
 /*       Iterator<Book> b = books.iterator();
        Iterator<Book> a = bookPublisher.iterator();
        while(b.hasNext()){
            Book tt = b.next();
            System.out.println(tt.getPublisher());
            while(a.hasNext()){
                Book t1 = a.next();

                //the below part isn't executing
                if(bookPublisher.contains(t1.getPublisher())){
                    System.out.println("contains "+t1.getPublisher());
                }
                else{
                    System.out.println("add to bookpublish :");
                }
                }
            }

  */
        }




    }
