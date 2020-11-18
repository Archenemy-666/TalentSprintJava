public class  Student extends Person {
    private String program ;
    private int year ;
    private double fee ;


    //constructor
    public Student(String name, String address, String program , int year , double fee ) {
        super(name, address);
        this.program = program ;
        this.year = year ;
        this.fee  = fee ;
    }

    //Address
    public void setProgram(String program) {
        this.program = program;
    }
    public String getProgram() {
        return program;
    }

    //year
    public void setYear(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }

    //fee
    public void setFee(double fee) {
        this.fee = fee;
    }

    public double getFee() {
        return fee;
    }

    //To String
    public String toString(){
        return " name : "+getName()+"| Address : "+getAddress()+ " | Program : "+getProgram()+" | Year : "+getYear()+ " | Fee : "+getFee();
    }
}