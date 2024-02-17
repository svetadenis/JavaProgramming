package week15_OfficeHours_Saturday.bank;

public class NotEnoughMoneyException extends RuntimeException{
    public NotEnoughMoneyException(double amount) {
        super("You don't have $" + amount + " available");
    }
}