import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HospitalService {
    private ArrayList<Hospital> hospitalArray = new ArrayList<Hospital>();
    private HashMap<Integer, String> hospitalMap = new HashMap<Integer, String>();

    public int addHospital(Hospital c) {

        hospitalArray.add(c);
        return c.getHospitalCode();
    }

    public TreeMap<Integer, String> getHospitals() {

        for (Hospital h : hospitalArray) {
            hospitalMap.put(h.getHospitalCode(), h.getHospitalName());
        }
        // creating a treemap that sorts according to value ;
        TreeMap<Integer,String> hospitalTreeMap = new TreeMap<Integer, String>(new MapComparator1(hospitalMap));
        hospitalTreeMap.putAll(hospitalMap);
        return hospitalTreeMap;


    }

    public Hospital getHospitalDetails(int hospitalCode) {
        Hospital temp = null;
        for (Hospital h : hospitalArray) {
            if (h.getHospitalCode() == hospitalCode) {
                temp =  h;
            }
        }
        return temp ;
    }
}
