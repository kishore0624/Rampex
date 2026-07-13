package Day_15.Class_task;

public class SynchronizedMethods {

    public static void main(String[] args) {

        SynchronizedMethods obj = new SynchronizedMethods();

        BankAccount account = obj.new BankAccount("Naveen", 1000);

        GpayAccount gpay = obj.new GpayAccount(account);
        PhonePe phonepe = obj.new PhonePe(account);

        gpay.start();
        phonepe.start();
    }

    class GpayAccount extends Thread {

        BankAccount b;

        GpayAccount(BankAccount bankAcc) {
            System.out.println("GPay Account Created");
            this.b = bankAcc;
        }

        @Override
        public void run() {
            b.withdraw(500);
        }
    }

    class PhonePe extends Thread {

        BankAccount b;

        PhonePe(BankAccount bankAcc) {
            this.b = bankAcc;
        }

        @Override
        public void run() {
            b.withdraw(300);
        }
    }

    class BankAccount {

        String name;
        int balance;

        BankAccount(String name, int balance) {
            this.name = name;
            this.balance = balance;
        }

        // Synchronized method
        public synchronized void withdraw(int amount) {

            System.out.println(Thread.currentThread().getName() +
                    " is withdrawing Rs." + amount);

            if (balance >= amount) {
                balance = balance - amount;
                System.out.println("Remaining Balance: " + balance);
            } else {
                System.out.println("Insufficient Balance");
            }
        }
    }
}