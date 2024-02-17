package week15_OfficeHours_Saturday.bank;

import java.time.LocalDate;

public class Runner {
    public static void main(String[] args) {

        Bank bank = new Bank();
        bank.balance = 1000;

        // valid case for both

        bank.withdraw(200);
        System.out.println(bank.balance);

        try {
            bank.deposit(400, LocalDate.of(2023, 1, 10));
            System.out.println(bank.balance);
        } catch (InvalidDateException e) {
            e.printStackTrace();
        }

        // invalid both

        //bank.withdraw(2000);

        try {
            bank.deposit(400, LocalDate.of(2025, 1, 10));
        } catch (InvalidDateException e) {
            System.out.println("EXCEPTION HANDLED");
            e.printStackTrace();

        }

    }}