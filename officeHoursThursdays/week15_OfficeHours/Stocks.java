package week15_OfficeHours;

public class Stocks {
    public static void main(String[] args) {
        System.out.println(findProfits(new int[]{4, 1, 7, 9, 4, 1})); // 8
        System.out.println(findProfits(new int[]{1, 2, 1, 4, 2, 2, 1})); // 4
        System.out.println(findProfits(new int[]{10, 7, 5, 2})); // 0
    }

    public static int findProfits(int [] prices){
        int totalProfit = 0;

        for(int i = 0; i < prices.length - 1; i++){
            if(prices[i] < prices[i + 1]){
                totalProfit += prices[i + 1] - prices[i];
            }
        }

        return totalProfit;
    }
}

/*
Stocks [IQ][problem solving]

    given an array of stock prices find the total profit that can be made from buying and selling stocks
    you can buy or sell on any day, but you can only hold one stock at a time

    ex: [4, 1, 7, 9, 4, 1]
        output: 8
            buying on day 2 and selling on day 4 would give a profit of: 9 - 1 = 8

    ex: [1, 2, 1, 4, 2, 2, 1]
        output: 4
            buying on day 1 and selling on day 1 would give a profit of: 2 - 1 = 1
            buying on day 3 and selling on day 4 would give a profit of: 4 - 1 = 3

    ex: [10, 7, 5, 2]
        output: 0
            no profit could be made because the price always went down
 */