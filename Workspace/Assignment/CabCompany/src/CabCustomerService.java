import java.util.ArrayList;
import java.util.List;

public class CabCustomerService{

    private List<CabCustomer> customerDatabase = new ArrayList<CabCustomer>();

    public CabCustomerService(){}

    public void addCabCustomer(CabCustomer customer){
        customerDatabase.add(customer);
    }
    public boolean isFirstCustomer(CabCustomer customer){
        for (CabCustomer c : customerDatabase){
            if( customer.getPhone() == c.getPhone())
                return false ;
        }
        return true ;
    }
    public double calculateBill(CabCustomer customer){
        double bill ;
        if(isFirstCustomer(customer)){
            return bill = 0.00 ;

        }
        else if(customer.getDistance() <= 4)
            return bill = 80.00 ;
        else
            return bill = ((customer.getDistance() - 4)*6) + 80 ;
    }
    public String printBill(CabCustomer customer){
        return customer.getCustomerName()+" please pay your bill of rupees Rs."+calculateBill(customer);
    }
    // how to check for all records at a single go ?
}