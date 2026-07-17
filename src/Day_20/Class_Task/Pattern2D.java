package Day_20.Class_Task;

public class Pattern2D {
    public static void main(String[] args){
        int[][] arr = new int[5][6];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                int num = arr[i][j];
                System.out.print(num);

            }
            System.out.println();
        }
    }
}