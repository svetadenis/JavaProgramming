package day07_ifStatements;

public class MultiBranchIf {
    public static void main(String[] args) {
        int number = 100;
        String result = "";//use it if you want just write one print statements not three

        if(number>0){
            result = "Positive";
        }
        if(number<0){
            result = "Negative";
        }
        if(number==0){
            result ="Zero";
        }
        System.out.println(result);
        System.out.println("_______________________________________");

        String result2 = "";
        if (number > 0){
            result2 = "Positive";
        }else if (number <0 ) {
            result2 = "Negative";
        } else{
            result2 = "Zero";
            }

    }
}
/*an integer variable named number is declared and given, write a program can identify
 if the number is positive, negative or zero
 Ex: number = 20
 Output: positive

 */
/*Multi branch if: when there are three or more options/alternatives
we need to create condition for
    if (Condition1){
    Statement A}
    else if (Condition2){
    Statement B}
    else if (Condition 3){
    Statement C}
    else{Statement D}

    ONLY one block gets executed
    StatementA: Condition1 is true
    StatementB: Condition1 MUST be false, Condition2 is true
    StatementC: Condition1 and Condition2 MUST be false, Condition3 is true


 */
