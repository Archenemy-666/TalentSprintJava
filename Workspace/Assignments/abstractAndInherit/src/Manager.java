public class Manager extends Employee{
        public Manager(){}
        public Manager(long Id , String Name , String address , long phone , double salary ){
                super(Id, Name, address, phone);
                setBasicSalary(salary);
        }

        @Override
        public double transportAllowance() {
               return  15 * getBasicSalary() /100 ;
        }
}