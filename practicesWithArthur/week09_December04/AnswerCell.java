package week09_December04;

public class AnswerCell {
    public static void main(String[] args) {
        System.out.println(answerCell(true, false, true));
    }

    public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {

        //Solution1
        //return (isAsleep)? false : (isMorning&&!isMom)? false : true;

        //Solution2
        //return (isAsleep)? false : isMorning? isMom : true;

        //solution3
        return (!isAsleep && !isMorning || (!isAsleep && isMom));



    }

}
