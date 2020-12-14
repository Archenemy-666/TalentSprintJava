package playingWithExceptions;

import java.util.ArrayList;
import java.util.Scanner;

import userDefinedExceptions.StudentNotFoundException;

public class StudentInfo {
	public static void main(String[] args) throws StudentNotFoundException  {
		Student s1 = new Student(1, "sid", "hyd");
		Student s2 = new Student(2, "sai", "bnglr");
		Student s3 = new Student(3, "sam", "chennai");
		Student s4 = new Student(4, "sid", "hyd");
		Student s5 = new Student(5, "sai", "bnglr");
		Student s6 = new Student(6, "sam", "chennai");
		Student s7 = new Student(7, "sid", "hyd");
		Student s8 = new Student(8, "sai", "bnglr");
		Student s9 = new Student(9, "sam", "chennai");
		Student s10 = new Student(10, "sam", "chennai");
		
		ArrayList<Student> students = new ArrayList<Student>();
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		students.add(s6);
		students.add(s7);
		students.add(s8);
		students.add(s9);
		students.add(s10);
		
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.println("enter id : ");
		int id = scan.nextInt();

		
		int count = 0 ;
		
		for(Student info : students) {
			if(info.getId() == id) {
				System.out.println(info);
				count++ ;
			}

		}
		if(count == 0) {
			try {
				throw new StudentNotFoundException ("Student not found");
			}catch(StudentNotFoundException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
