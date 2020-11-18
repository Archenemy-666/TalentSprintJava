package classesTs;

public class StudentDemo {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.details(0, "Arun", "HYD");
		s1.setId(101);
		
		System.out.println("Before update " + s1);
		
		System.out.println("ID : " + s1.getId() + ", Address : " + s1.getAddress());
		s1.setName("Arun Kumar");
		s1.setId(105);
		
		System.out.println("After update " + s1);
		
		
		
		Student s2 = new Student();
		s2.details(102, "Akhil", "Sec");
		System.out.println(s2);
	}
	

}
