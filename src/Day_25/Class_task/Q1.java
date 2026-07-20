package Day_25.Class_task;

public class Q1 {

    int[] arr;
    int size;
    int front;
    int rear;

    // Constructor
    Q1() {
        arr = new int[5];
        size = 0;
        front = -1;
        rear = -1;
    }

    // Enqueue
    public void enqueue(int val) {

        if (rear == arr.length - 1) {
            System.out.println("Queue is Full");
            return;
        }

        if (front == -1 && rear == -1) {
            front = 0;
        }

        rear++;
        arr[rear] = val;
        size++;

        display();
    }

    // Dequeue
    public int dequeue() {

        if (front == -1 && rear == -1) {
            System.out.println("Queue is Empty");
            return -1;
        }

        int val = arr[front];

        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front++;
        }

        size--;

        return val;
    }

    // Display
    public void display() {

        if (front == -1 && rear == -1) {
            System.out.println("[ ]");
            return;
        }

        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    // Main Method
    public static void main(String[] args) {

        Q1 q = new Q1();

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}