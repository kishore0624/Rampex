package Day_10;

public class oop {
    public static void main(String[] args){
        car cc = new car();
        cc.brand = "BMW";
        cc.model="SUV";
        cc.colour="Red";
        //cc.colour="black";
        cc.drive();
        cc.details();
        car c2 = new car();
        c2.brand = "benz";
        c2.model="vintage";
        c2.colour="black";
        //cc.colour="black";
        c2.drive();
        c2.details();


    }
}
class car{
    String brand;
    String model;
    String colour;

    public void drive(){
        System.out.println("the car is driving");
    }

    public void details() {

        System.out.println(brand);
        System.out.println(model);
        System.out.println(colour);
    }
}