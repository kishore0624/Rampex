package Day_10;

public class frame {
    public static void main(String[] args) {

        frameLens f1 = new frameLens();
        f1.brand = "Ray-Ban";
        f1.type = "Round";
        f1.color = "Black";
        f1.wear();
        f1.details();

        frameLens f2 = new frameLens();
        f2.brand = "Titan";
        f2.type = "Rectangle";
        f2.color = "Blue";
        f2.wear();
        f2.details();
    }
}

class frameLens {
    String brand;
    String type;
    String color;

    public void wear() {
        System.out.println("The frame lens is being worn.");
    }

    public void details() {
        System.out.println("Brand : " + brand);
        System.out.println("Type  : " + type);
        System.out.println("Color : " + color);
    }


}