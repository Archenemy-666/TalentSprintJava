public class CabCustomerServiceTester {
    public static void main(String [] args) {

        CabCustomer c1 = new CabCustomer(1 , "Sid" , "Banjara hills " , "Jubilee Hills " , 4 , 9949032944l );
        CabCustomer c2 = new CabCustomer(2 , "Sam" , "Himayat Nagar " , "Jubilee Hills " , 8 , 9949032942l );
        CabCustomer c3 = new CabCustomer(3 , "Sean" , "Banjara hills " , "Osmania University " , 15 , 9949032922l );

        CabCustomerService services = new CabCustomerService();
        // customer 1

        services.addCabCustomer(c1);
        System.out.println(services.printBill(c1));

        //customer 2
        services.addCabCustomer(c2);
        System.out.println(services.printBill(c2));

        // customer 3
        System.out.println(services.printBill(c3));





    }

}