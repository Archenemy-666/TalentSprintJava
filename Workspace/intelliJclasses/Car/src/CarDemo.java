class CarDemo{
    public static void main(String args[]){
        Car car1 = new Car("audi", "R8" , 570 ,5204,"V10",3.4,27245000);
        System.out.println(car1);

        Car car2 = new Car("mercedez", "AMG GT-R" , 577 ,4000,"V8",3.6,24800000);
        System.out.println(car2);

        System.out.println("the best option "+Car.compare(car1,car2));

        }
        }