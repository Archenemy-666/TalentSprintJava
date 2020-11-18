package Collections;

public class Movie {
	private String name ;
	private float duration ; 
	private float rating ;
	
	public Movie() {}
	
	public Movie(String name , float d , float e ) {
		this.name = name ;
		this.duration = d ; 
		this.rating = e ;
		
	}
	public void setName (String name) {
		this.name = name ;
	}
	public String getName() {
		return name ;
	}
	public float getDuration() {
		return duration;
	}
	public void setDuration(float duration) {
		this.duration = duration;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	
	public String toString() {
		return "name : "+ name + " | duration : "+duration+ " | rating : "+rating ;
	}
	

}
