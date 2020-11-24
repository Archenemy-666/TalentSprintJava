import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapComparator1 implements Comparator<Integer>{

    private HashMap<Integer, String> hm ;
    MapComparator1(HashMap<Integer,String> hm) {
        this.hm = hm;
    }

    @Override
    public int compare(Integer o1, Integer o2) {
        String value1 = hm.get(o1);
        String value2 = hm.get(o2);
        if(value1.compareToIgnoreCase(value2) <  1)
            return -1;
        return 1;

    }
}