package Week3_OfficeHours_Saturdays;

public class IfStatements {
    public static void main(String[] args) {

        double accountBalance = 1000;
        double withdrawAmount = 2000;

        //accountBalance = accountBalance - withdrawAmount;
        accountBalance -=  withdrawAmount;// the same is lane 9

        if(accountBalance <0){
            System.out.println("Overdraft penalty applied");
            accountBalance  *=1.1;// increse by 10%

        }

        System.out.println("Remaining balance: $" +accountBalance);

    }

}
