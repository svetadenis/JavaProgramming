package week9OfficeHours;

public class SumOfEven {
    public static void main(String[] args) {

    int lastSumofEven=106;
    int odds=0,evens=0;

        for (int i=1;;i++){
        if(i>10&&i<16){
            continue;
        }
        if(i%2==0){
            evens+=i;
        }else{
            odds+=i;
        }
        if(evens==lastSumofEven){
            break;
        }
    }
        System.out.println("odds = " + odds);
        System.out.println("evens = " + evens);
}}
