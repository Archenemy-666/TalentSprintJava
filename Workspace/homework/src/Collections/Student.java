package Collections;

public class Student {
	private int id ; 
	private String name ; 
	private static int idgen = 100 ; 
	private double math ;
	private double science ;
	private double art ; 
	private double economy ; 
	private double history ; 
	private double percentage ; 
	
	public Student() {
		this.id = this.idgen ++ ;
	}
	
	public Student(int id  ,String name ,double math , double science , double art , double economy , double history ) {
		this.id = id ;
		this.name = name ; 
		this.math = math ; 
		this.science = science ; 
		this.economy = economy ;
		this.history = history ;
		this.art = art ;
		
		
	}
	
	public double  percentage( ) {
		double sum = math + science + economy + history  + art ;
		percentage = ( sum / 50 ) * 100 ;
		return percentage ;
	}
	public void getPercentage() {
		double sum = math + science + economy + history  + art ;
		percentage = ( sum / 50 ) * 100 ;
		System.out.println(percentage);
	}
	public String toString() {
		return " id : "+id + " name : "+ name + " math :"+ math + " science : "+science+" art : "+ art + " economy :  "+economy+"history : "+history+" percentage : "+percentage;
		
	}

}
