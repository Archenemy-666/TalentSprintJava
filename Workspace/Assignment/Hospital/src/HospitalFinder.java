import java.util.*;
import java.util.Map.Entry;

public class HospitalFinder {
    public static void main(String[] args){

        // creating Hospital instance
        Hospital h1 = new Hospital( );
        h1.setHospitalName("Yashoda");
        h1.setLocation("hyderabad");

        Hospital h2 = new Hospital( );
        h2.setHospitalName("Apollo");
        h2.setLocation("hyderabad");


        // creating a Hospital service instance
        HospitalService hs1 = new HospitalService();

        System.out.println(hs1.addHospital(h1));
        System.out.println(hs1.addHospital(h2));

        System.out.println(hs1.getHospitals());
        System.out.println(hs1.getHospitalDetails(1000));



    }
}