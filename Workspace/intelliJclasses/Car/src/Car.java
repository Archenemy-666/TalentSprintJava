class Car {
    private int id ;
    private String manufacturer ;
    private String model ;
    private int bhp ;
    private int cc ;
    private String engine ;
    private double acc ;
    private double price ;
    private static int idgen = 1 ;

    public Car(){
        id = idgen++;
    }

    public Car(String manufacturer ,String model , int bhp , int cc , String engine, double acc , double price  ){
        this();
        this.manufacturer = manufacturer;
        this.model = model;
        this.bhp = bhp ;
        this.cc = cc ;
        this.engine = engine ;
        this.acc = acc ;
        this.price = price ;
    }

    //Manufacturer
    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer ;
    }
    public String getManufacturer() {
        return this.manufacturer;
    }

    //Model
    public void setModel(String model){
        this.model = model ;
    }
    public String getModel() {
        return this.model;
    }

    // BHP
    public void setBhp(int bhp){
        this.bhp = bhp ;
    }
    public int getBhp() {
        return this.bhp;
    }

    //CC
    public void setCc(int cc){
        this.cc = cc ;
    }
    public int getCc() {
        return this.cc;
    }

    //Engine
    public void setEngine(String engine){
        this.engine = engine ;
    }
    public String getEngine() {
        return this.engine;
    }

    //Acceleration
    public void setAcc (double acc){
        this.acc = acc ;
    }
    public double getAcc() {
        return this.acc;
    }

    //Price
    public void setPrice(double price){
        this.price = price ;
    }
    public double getPrice() {
        return this.price;
    }

    // toString
    public String toString(){
        return "id: "+id+" | manufacturer : "+manufacturer+"| model : "+model+"| bhp : "+bhp+"| CC : "+cc+"| Engine : "+engine+"| Acceleration : "+acc+"| Price :"+price ;

    }

    // comparing the specifications
    public static Car compare(Car car1 , Car car2){
    if((car1.getCc() - car1.getAcc() + car1.getBhp()) > (car2.getCc() + car2.getBhp() - car2.getAcc())){
        return car1 ;
        }
    else{
        return car2 ;
        }
    }
}