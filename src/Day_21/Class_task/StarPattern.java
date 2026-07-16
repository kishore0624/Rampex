package Day_21.Class_task;
import java.util.*;
public class StarPattern {
    static void main(String[] args) {
        int a=10;
        for(int i=0;i<=a;i++){
            for(int j=a;j>i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(" *");
            }
            System.out.println();
    }

    }
}
