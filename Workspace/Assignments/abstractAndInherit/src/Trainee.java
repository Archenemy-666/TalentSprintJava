public class Trainee extends Employee {
    public Trainee(){}
    public Trainee(long Id , String Name , String address , long phone , double salary ){
        super(Id, Name, address, phone);
        setBasicSalary(salary);
    }

}