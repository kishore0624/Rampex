package Day_10;

public class advance_car {
    public static void main(String[] args){
        car07 cc = new car07();
        cc.brand = "BMW";
        cc.model="SUV";
        cc.colour="Red";
        cc.acclerate();
        cc.acclerate();

        //cc.colour="black";
        // cc.drive();
        // cc.details();
        car07 c2 = new car07();
        c2.brand = "benz";
        c2.model="vintage";
        c2.colour="black";
        c2.acclerate();
        c2.acclerate();
        //c2.acclerate();
        // c2.acclerate();
        //  c2.acclerate();
        //  c2.acclerate();
        //  c2.acclerate();
        c2.acclerate();
        c2.acclerate();
        c2.brake();
        c2.brake();
        c2.brake();
        c2.brake();
        c2.brake();

        //cc.colour="black";
        //c2.drive();
        //c2.details();


    }
}
class car07{
    String brand;
    String model;
    String colour;

    int speed =0;
    int Maxspeed = 40;

    public void drive(){
        System.out.println("the car is driving");
    }

    public void details() {

        System.out.println(brand);
        System.out.println(model);
        System.out.println(colour);
    }

    public void acclerate() {
        if(speed==40){
            System.out.println("the car reached maximun speed");
        }
        else{
            speed = speed + 5;

            System.out.println(brand + " the car acclerate speed is " + speed);
        }

    }
    public void brake(){
        if(speed == 0){
            System.out.println("the car is not moving");
        }
        else{
            speed = speed -5;
            System.out.println("the break is applied and speed "+speed+"kmh");

        }

    }


}