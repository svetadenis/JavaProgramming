package week4OfficeHours;

public class SalesBonus {
    public static void main(String[] args) {

        int salesAmount = 20000;

        int bonus;
        if(salesAmount >= 15_000){
            bonus = 7000;
        } else if(salesAmount >= 10_000){
            bonus = 5000;
        } else {
            bonus = 0;
        }
    System.out.println(bonus);

        // write as a ternary
        int bonus2 = (salesAmount >= 15_000) ? 7000 : salesAmount >= 10_000 ? 5000 : 0;
        System.out.println(bonus2);
    }}
/*
Sales Bonus [ternary]

    create a sales amount variable
    use the sales amount to determine the bonus you get at end of the month

        if your sales amount is less than 10000 you don't get any bonus

        if your sales amount is more than or equal to 10000 and less than 15000 you get a bonus of 5000

        if your sales amount is more than or equal to 15000 you get a bonus of 7000

        print your bonus number
 */

