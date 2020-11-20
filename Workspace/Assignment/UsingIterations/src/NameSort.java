import java.util.Comparator;


public class NameSort implements Comparator<Book>{

    @Override
    public int compare(Book n1 , Book n2 ){
        return n1.getName().compareToIgnoreCase(n2.getName());
    }
}