public class Employee{
    private long employeeId ;
    private String employeeName;
    private String employeeAddress ;
    private long employeePhone ;
    private double basicSalary ;
    private double specialAllowance = 250.80;
    private double hra = 1000.50 ;
    //private static long idgen = 10001;

    public Employee(){
       // employeeId = idgen++ ;
    }

    public Employee(long Id , String Name , String address , long phone ){
       // this();
        employeeId  = Id;
        employeeName = Name ;
        employeeAddress = address ;
        employeePhone = phone ;

    }
    public double getSpecialAllowance() {
        return specialAllowance;
    }

    public double getHra() {
        return hra;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public double calculateSalary(){
        double salary =  basicSalary + ( basicSalary * specialAllowance/100) + ( basicSalary * hra/100);
        return salary ;
    }
    public double transportAllowance(){
        return  10 / 100 * basicSalary ;
    }
}