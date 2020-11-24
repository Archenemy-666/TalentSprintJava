import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class HospitalService {
    private ArrayList<Hospital> hospitalArray = new ArrayList<Hospital>();
    private TreeMap<Integer, String> hospitalMap = new TreeMap<Integer, String>();

    public int addHospital(Hospital c) {

        hospitalArray.add(c);
        return c.getHospitalCode();
    }

    public TreeMap<Integer, String> getHospitals() {

        for (Hospital h : hospitalArray) {
            hospitalMap.put(h.getHospitalCode(), h.getHospitalName());
        }
        return hospitalMap;

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
