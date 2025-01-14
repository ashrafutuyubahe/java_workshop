package sort.THREADING.ThreadWork;

public class BankApplication {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000);

        
        Runnable bankOperations1 = new BankOperations(bankAccount, 20, 120);
        Runnable bankOperations2 = new BankOperations(bankAccount, 200, 600);
        Runnable bankOperations3 = new BankOperations(bankAccount, 100, 200);

        Thread bankThread1 = new Thread(bankOperations1);
        Thread bankThread2 = new Thread(bankOperations2);
        Thread bankThread3 = new Thread(bankOperations3);

        bankThread1.start();
        bankThread2.start();
        bankThread3.start();

        try {
            bankThread1.join();
            bankThread2.join();
            bankThread3.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
