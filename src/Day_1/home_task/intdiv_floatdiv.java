package Day_1.home_task;

public class intdiv_floatdiv {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 2;

        double dnum1 = 5.0;
        double dnum2 = 2.0;
        int iresult = num1 / num2;
        float fresult = (float) (dnum1 / dnum2);

        System.out.println("Int Div (5/2) : " + iresult);
        System.out.println("Float Div (5.0/2.0) : " + fresult);
    }
}