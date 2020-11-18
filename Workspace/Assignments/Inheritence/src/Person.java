public class Person{
    private String name ;
    private String address ;


    public Person(String name , String address){
        this.name = name ;
        this.address = address ;

    }

    // Name
    public void setName(String name ){
        this.name = name ;
    }
    public String getName() {
        return name;
    }

    // Address
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }

    public String toString(){
        return " name : "+getName()+"| Address : "+getAddress() ;
    }
}