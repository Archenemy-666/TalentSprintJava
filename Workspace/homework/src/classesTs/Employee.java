package classesTs;

public class Employee {
	private int id ;
	private String name ;
	private String dept ; 
	private double salary ;
	private int percentOf;
	

	public Employee(int id , String name , String dept , double salary) {
		this.id = id ;
		this.name = name ; 
		this.dept = dept ;
		this.salary = salary ;
		}
	
	// ID
	public void setId(int id){
		this.id = id ;
		
	}
	public int getId() {
		return id;
	}
	
	
	//NAME
	public void setName(String name) {
		this.name = name ;
	}
	public String getName() {
		return name; 
	}
	
	//DEPARTMENT
	public void setDept(String dept) {
		this.dept = dept ;
	}
	public String getDept() {
		return dept;
	}
	
	//SALARY
	public void setSalary(double salary) {
		this .salary = salary ;
		
	}
	public double getSalary() {
		return salary;
	}
	
	//toString
	public String toString() {
		return "ID : "+this.id+" | name : "+this.name+" | Department : "+this.dept+" | Salary : "+salary ;
	}
	
	// caliculate 1% of Salary Raise
	public double salaryRaise(int percentOf) {
		this.percentOf = percentOf ;
		return this.salary + (this.salary*percentOf)/100 ;
	}
	

}
