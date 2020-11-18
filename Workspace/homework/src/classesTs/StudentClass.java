package classesTs;

public class StudentClass {
	private int id; // 101 
	private String name; // arun
	private String address; // HYD
	
	
	
	public void details(int i , String n , String addr) {
		id = i;
		name = n;
		address = addr;
		
	}	
	public void setId(int i) { // i = 101 
		id = i;
	}	
	public int getId() {
		return id;
	}
	
	
	public void setName(String n) { // n = arun
		name = n;
	}
	public String getName() {
		return name;
	}
	
	
	public void setAddress(String a) { // a = HYD
		address = a;
	}
	public String getAddress() {
		return address;
	}
	
	public String toString() {
		return "ID : " + id + ", Name : " + name + ", Address : " + address;
	}

}
