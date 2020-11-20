import java.util.Comparator;

public class PublisherSort implements Comparator<Book>{

    @Override
    public int compare(Book p1 , Book p2){
        return p1.getPublisher().compareToIgnoreCase(p2.getPublisher());
    }

}