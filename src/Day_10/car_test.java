package Day_10;

public class car_test {
    public static void main(String[] args){
        Mycar c1 = new Mycar();
        System.out.println(c1.brand);
        System.out.println(c1.model);
        c1.colour="black";
        System.out.println(c1.colour);



    }

}

class Mycar{

    String brand  = "BMW";
    String model = "M5";
    String colour;
}