package Day_25.Class_task;

public class Queue{

    public static void main(String[] args) {

        int[] queue = {1, 2, 3, 4, 5};

        int front = 0;
        int rear = 4;

        for (int i = front; i <= rear; i++) {
            System.out.println(queue[i]);
        }
    }
}