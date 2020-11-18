package classesTs;

public class EmployeeDemo {
	public static void main(String[] args) {
		Employee worker1 = new Employee(12 , "Sid" , "DevOps" , 1203500.23);
		worker1.setId(666);
		
		Employee worker2 = new Employee(12 , "Sid" , "DevOps" , 1203500.23);
		worker2.setName("DumbF");
		worker2.setSalary(1232443.0);
		worker2.setDept("Tester");
		
		Employee worker3 = new Employee(12 , "Sid" , "DevOps" , 1203500.23);
		worker3.setName("DumbO");
		worker3.setSalary(123221.0);
		worker3.setDept("Management");
		
		System.out.println(worker1);
		System.out.println("the percentage of salary : "+worker1.salaryRaise(20));
		
		System.out.println();
		
		System.out.println(worker2);
		System.out.println("the percentage of salary : "+worker2.salaryRaise(124));
		
		System.out.println();
		
		System.out.println(worker3);
		System.out.println("the percentage of salary : "+worker3.salaryRaise(23));
		
		
	}

}
