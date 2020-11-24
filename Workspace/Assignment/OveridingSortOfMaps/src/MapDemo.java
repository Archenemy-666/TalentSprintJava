import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo{
    public static void main(String[] args){
        HashMap<Character,String> hm = new HashMap<Character, String>();
        hm.put('a',"apple");
        hm.put('b',"guava");
        hm.put('c',"banana");
        hm.put('a',"Apple");

        for(Map.Entry<Character , String> hm1 : hm .entrySet() ){
            System.out.println(hm1.getKey());

        }
        TreeMap<Character,String> tm = new TreeMap<Character, String>();
        tm.putAll(hm);

        for(Map.Entry<Character,String> tm1 : tm.entrySet() ){
            System.out.println(tm1);


        }

        TreeMap<Character,String> sort = new TreeMap<Character, String>(new MapComparator(hm));
        sort.putAll(hm);
        System.out.println("===========================");
        for(Map.Entry<Character,String> sort1 : sort.entrySet()){
            System.out.println(sort1);
        }






    }
}