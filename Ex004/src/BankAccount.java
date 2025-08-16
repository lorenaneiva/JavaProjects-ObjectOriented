public class BankAccount {
    private String accountNum;
    private String accountHolder;
    private double balance;

    public  BankAccount(String accountNum, String accountHolder, double balance){
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double deposit){
        if (deposit <= 0) {
            System.out.println("Invalid value, try again.");
        }else {        this.balance += deposit;
        System.out.printf("%s you deposited %.2f amount, now your balance's: %.2f%n", this.accountHolder, deposit, balance);
        System.out.println("--");}

    }
    public void withdraw(double withdraw){
        if(withdraw > this.balance){
            System.out.printf("Withdrawal of %.2f denied: insufficient funds.%n", withdraw);
            System.out.println("--");

            return;
        }
        this.balance -= withdraw;
        System.out.printf("%s you withdrew %.2f amount, now your balance's: %.2f%n", this.accountHolder, withdraw, this.balance);
        System.out.println("--");
    }
    public void checking(){
        System.out.println("Account number: " + this.accountNum);
        System.out.printf("Current balance amount: %.2f%n ", this.balance);
        System.out.println("--");

    }
}
