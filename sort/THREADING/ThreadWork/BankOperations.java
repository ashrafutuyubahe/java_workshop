package sort.THREADING.ThreadWork;

public class BankOperations implements Runnable {
    private BankAccount bankAccount;
    private int deposit;
    private int withDraw;

   
    public BankOperations(BankAccount bankAccount, int deposit, int withDraw) {
        this.bankAccount = bankAccount;
        this.deposit = deposit;
        this.withDraw = withDraw;
    }

    @Override
    public void run() {
        if (this.deposit < 0) {
            System.out.println("You can't make deposit operations with negative amounts.");
        } else if (this.withDraw > bankAccount.getBalance()) {
            System.out.println("Not enough money.");
        } else {
            bankAccount.deposit(deposit);
            bankAccount.WithDrawal(withDraw);
            System.out.println("Made a transaction with deposit: " + deposit + " and withdrawal: " + withDraw);
        }
    }
}
