package week15_OfficeHours_Saturday.bank;

    import java.time.LocalDate;

    public class Bank {

        double balance;

        public double withdraw(double amount){

            if(amount > balance){
                throw new NotEnoughMoneyException(amount);
            }

            balance -= amount;
            return balance;
        }

        public void deposit(double amount, LocalDate localDate) throws InvalidDateException{

            if(localDate.isAfter(LocalDate.now())){
                throw new InvalidDateException();
            }

            balance += amount;
        }

    }

