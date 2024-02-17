package day18_memoryManagement;

public class TestBankAccountObjects {
    public static void main(String[] args) {

        BankAccount object1 = new BankAccount();
        object1.setInfo("Denisenko", 123456789);
        System.out.println(object1);

        object1.deposit(1);
        object1.checkBalance();

        object1.withdraw(700);
        object1.checkBalance();

        System.out.println("____________________________________________________________");

        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();

        account1.setInfo("Denisenko", 123456789);
        account2.setInfo("Ponomorenko", 987654321);

        account1.deposit(500);
        account2.deposit(0);

        System.out.println(account1);
        System.out.println(account2);

    }

}
