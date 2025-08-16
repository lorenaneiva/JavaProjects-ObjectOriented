public class App {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("123456789123456789", "José bonefacio", 1000.50);
        BankAccount otherBankAccount = new BankAccount("1234567899876543231", "Gabriela Lopes da Silva", 2300.20);

        bankAccount.deposit(500);
        bankAccount.withdraw(3000.50);
        bankAccount.checking();

        otherBankAccount.deposit(200);
        otherBankAccount.withdraw(500);
        otherBankAccount.checking();

        System.out.println();
    }
}
