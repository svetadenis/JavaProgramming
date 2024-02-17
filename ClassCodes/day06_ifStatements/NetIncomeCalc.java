package day06_ifStatements;

public class NetIncomeCalc {
    public static void main(String[] args) {
        int salary  = 100_000;
        double taxRate1 = 0.35;
        double taxRate2 = 0.3;
        double taxRate3 = 0.25;
        double taxRate4 = 0.2;
        boolean isMarried = true;
        double result=0;

    if (salary>=130_000){
        result=salary*(1-0.35);
    } if (salary >=100_000 && salary<129_000){
        result = salary*(1-0.3);
    } if (salary >=80_000 && salary < 99_000){
        result = salary*(1-0.25);
    } if (salary <79000){
        result = salary*(1-0.2);
    } if (isMarried = true){
        result = result*(1-0.05);
        }
        System.out.println("The NetIncome is " +result);
    }
}
