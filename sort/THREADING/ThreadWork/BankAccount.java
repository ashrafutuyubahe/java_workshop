package sort.THREADING.ThreadWork;

public class BankAccount {

    int balance;
    int deposits;
    int withDrawal;


    public BankAccount(int balance){
        this.balance= balance;
    }
    
    public BankAccount(int amount, int depo, int with) {

        this.balance = amount;
        this.deposits = depo;
        this.withDrawal = with;

    }

    public synchronized int WithDrawal(int amou) {
        int with = amou;
        if (with < 0) {
            System.out.println("the value is empty");

        }

        if (this.balance < with) {
            System.out.println("insufficient balance");
        }
        this.balance -= with;
        return balance;

    }

    public synchronized void deposit(int amount) {
        if (amount < 0) {
            System.out.println("the amont is not allowed");
        }

        this.deposits += amount;
        System.out.println("deposited"+ amount);

    }

    public int getBalance() {
        return balance;
    }

    public int getDeposits() {
        return deposits;
    }

    public int getWithDrawal() {
        return withDrawal;
    }

 
    

}
