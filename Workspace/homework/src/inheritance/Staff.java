package inheritance;

public class Staff extends Person {
	private String school ;
    private double pay ;

    public Staff(String name, String address , String school , double pay ){
        super(name , address );
        this.school = school ;
        this.pay = pay ;

    }
    // School
    public void setSchool(String school) {
        this.school = school;
    }
    public String getSchool() {
        return school;
    }

    //pay
    public void setPay(double pay) {
        this.pay = pay;
    }
    public double getPay() {
        return pay;
    }

    //toString

    @Override
    public String toString() {
        return " name : "+getName()+"| Address : "+getAddress()+ " | School : "+getSchool()+" | pay : "+getPay();
    }

}
