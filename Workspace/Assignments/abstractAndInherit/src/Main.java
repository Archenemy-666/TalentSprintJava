public class Main{
    public static void main(String[] args){
        Trainee T1 = new Trainee(1232 , "sid" ,"hyd", 999223 ,123344.5 );
        System.out.println(" salary trainee t1 : "+ T1.calculateSalary());
        System.out.println("transport allowance trainee t1 : "+T1.transportAllowance());

        Manager M1 = new Manager( 1221 , "bigbadjoe" , "eng" , 63554467 , 12322.2);
        System.out.println(" salary Mananger m1 : " +M1.calculateSalary());
        System.out.println("transport allowance manager : "+M1.transportAllowance());
    }
}