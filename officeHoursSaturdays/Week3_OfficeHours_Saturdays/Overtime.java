package Week3_OfficeHours_Saturdays;

public class Overtime {
    public static void main(String[] args) {

        double hourlyRate = 50;
        int numOfHours = 45;
        double netPay;

        if (numOfHours<=40) {//normal pay

            netPay = hourlyRate * numOfHours;

        }else{//overtime pay

        int overTimeHours = numOfHours-40;//numOfHours % 40

        netPay = 40*hourlyRate;
        netPay +=overTimeHours+hourlyRate*1.5;
        }
        System.out.println(netPay);

}}
