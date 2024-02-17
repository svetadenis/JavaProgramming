package day07_ifStatements;

public class NetIncomeCalc {
    public static void main(String[] args) {
        int salary = 80000;
        boolean isMarried = true;

        double taxRate = 0;
        if (salary >= 130000);{
            taxRate = 0.35;
        }
        if (salary >=100000 && salary < 130000){
            taxRate = 0.3;
        }
        if (salary>=80000 && salary < 100000){
            taxRate = 0.25;
        }
        if (salary <80000){
            taxRate = 0.2;
        }
        if (isMarried){
            taxRate -= 0.05;//tax is reduced by 5%
        }
        /*double netIncome = salary * (1-taxRate);
        System.out.println("netIncome = " + netIncome);*/

        double totalTax = salary * taxRate;
        double netIncome = salary - totalTax;

        System.out.println("salary = " +salary);
        System.out.println("totalTax = " +totalTax);
        System.out.println( "netIncome = " +netIncome);



   /* Create a class named NetIncomeCalc, Write a program that can calculate the salary after tax based on the following requirements
            the tax rates are:
    35% for salary of 130K or more
    30% for salary of 100K to 129999
    25% for salary of 80K to 99999
    20% for salary of 79999 or less

    in addition:
    if the person is married, he/she will pay 5% less tax

    Single if: for one condition

    If & Else: when there are TWO (not more, not less than 2) options/possibilities/alternatives we need to create condition for

    for 2 conditions


    Multi branch If: when there are three more options/possibilities/alternatives we need to create condition for

    for three or more conditions

    if(Conidition1){
        StatementA
    }esle if(Conidtion2){
        StatementB
    }else if(Conidition3){
        StatementC
    }else{
        StatementD
    }


    ONLY one block gets executed

    StatementA: Condition1 is true

    StatementB: Condition1 MUST be false, condition2 is true

    StatementC: Condition1 & Condition2 MUST be false, condtion3 is true

    StatementD: Condition1 & Condition2 & Condition3 must be false
   */
    }}