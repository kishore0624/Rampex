package Day_14.Home_task;
interface Flyable {
    void fly();
}
class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Bird is flapping wings");
    }
}
class Airplane implements Flyable {
    @Override
    public void fly() {
        System.out.println("Airplane is engaging engines");
    }
}
public class FlyableTut







{
    public static void main(String[] args) {
        Flyable[] flyers = new Flyable[] {
                new Bird(),
                new Airplane()
        };
        for (Flyable flyer : flyers) {
            flyer.fly();
        }
    }
}