package day06_ifStatements;

public class MedianNumber {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int c = 20;

      if (a<c&&a>b||a<b&&a>c){//b<a<c;c<a<b
          System.out.println(a+ " is the median number");
      }
      if (b<c&&b>a||b>a&&c<b){//a<b<c; c<b<a
          System.out.println(b+ " is the median number");
      }
      if (c<a&&c>b||c<b&&c>a){//b<c<a;a<c<b
          System.out.println(c+ " is the median number");
      }






    }
}

/*
Create a class named MedianNumber. write a program that can find the median number between three DIFFERENT given integers
		Ex:
                a = 10, b= 15, c = 20;
            Output:
                15 is the median number
 */