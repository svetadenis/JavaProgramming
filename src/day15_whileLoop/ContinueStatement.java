package day15_whileLoop;

public class ContinueStatement {
    public static void main(String[] args) {
        for (int i = 1; i<6; i++){
            if (i==4){
                continue;
            }
            System.out.println(i);//1 2 3 5; 4 is skipped
        }
        System.out.println("____________________________________");

for (int i =10; i<21; i++){
    if(i %2 == 0){//if i is even
        continue;//skips the current iteration
    }
    System.out.println(i);//11 13 15 17 19
}
        System.out.println("____________________________________");
for (char i = 'A'; i<='G'; i++){//A B C D E F G
    if (i == 'B'|| i=='E') {
        continue;
    }
    System.out.println(i);//A C D F G; B E skipped
}
    }
}
