package week07_November20;

public class DateFasion {
    public static void main(String[] args) {
        System.out.println(dateFashion(3, 7));
    }

    public static int dateFashion(int you, int date) {
        if (you<=2 || date <= 2){
            return 0;
        } else if(you>=8 || date>=8 ){
            return 2;
        }  return 1;
    }

}

