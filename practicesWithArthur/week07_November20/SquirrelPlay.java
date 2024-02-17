package week07_November20;

public class SquirrelPlay {
    public static void main(String[] args) {
        System.out.println(squirrelPlay(70, true));
    }

    public static boolean squirrelPlay(int temp, boolean isSummer) {
        if(isSummer){
            return temp>=60 && temp<=100;
        }return temp>=60 && temp<=90;
    }


}

