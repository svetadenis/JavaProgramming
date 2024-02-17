package day18_memoryManagement;

public class BankAccount {

    public String accountHolder;
    public long accountNumber;
    public double balance;


    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance= $" + balance +// added $ manually
                '}';
    }

    public void setInfo(String accountHolder, long accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance=balance;
    }



        public void checkBalance(){
            System.out.println("Your available balance is: $"+balance);
        }

        public void deposit (double amount){
        if(amount<1){
            System.out.println("Insufficiant deposit amount "+amount);
            return;
        }
            System.out.println("Depositing $" +amount+" to "+accountHolder);
            balance +=amount;
        }
        public void withdraw(double amount){

        if (amount>balance){
            System.out.println("Insufficiant withdraw amount "+amount);
            return;
        }
            System.out.println("Withdrowing $" +amount+" from "+accountHolder);
            balance-=amount;

        }

}

/*
Create a custom class named BankAccount:
			Attributes:
				1. accountHolder
				2. accountNumber
				3. balance

			Actions:
				1. setInfo(): sets the accountHolder and accountNumber attributes
		            	2. toString(): displays the full account info
		                3. checkBalance():displays the available balance
		                4. deposit(amount): increases the balance by the specified amount
		        	5. withdraw(amount): decreases the balance by the specified amount

 */