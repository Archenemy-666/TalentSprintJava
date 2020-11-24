import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapComparator implements Comparator<Character>{

    private HashMap<Character,String> hm ;
    MapComparator(HashMap<Character,String> hm) {
        this.hm = hm;
    }

    @Override
    public int compare(Character o1, Character o2) {
        return hm.get(o1).compareTo(hm.get(o2));
    }
}