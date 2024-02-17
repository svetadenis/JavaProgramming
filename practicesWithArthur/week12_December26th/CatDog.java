package week12_December26th;

public class CatDog {
    public static void main(String[] args) {
        System.out.println(catDog("it is raining cats and dogs"));
    }
    public static boolean catDog(String str) {
        //solution1(two separate for loops )
        // int counterCat=0;
        // for(int i=0; i<str.length()-2;i++){
        // if (str.substring(i,i+3).equals("cat")){
        //   counterCat++;
        // }
        // }

        // int counterDog=0;
        // for(int j=0; j<str.length()-2;j++){
        // if (str.substring(j,j+3).equals("dog")) counterDog++;
        // }
        // return counterCat==counterDog;

        //solution2 (merging loops)
        //   int counterCat=0;
        //   int counterDog=0;
        // for(int i=0; i<str.length()-2;i++){
        // if (str.substring(i,i+3).equals("cat")){
        //   counterCat++;
        // }
        // if (str.substring(i,i+3).equals("dog")){
        //   counterDog++;
        // }
        // }
        // return counterCat==counterDog;

        //solution3 (adding len variable)
        //   int len= str.length();
        //   int counterCat=0;
        //   int counterDog=0;

        // for(int i=0; i<len-2;i++){
        // if (str.substring(i,i+3).equals("cat")){
        //   counterCat++;
        // }
        // if (str.substring(i,i+3).equals("dog")){
        //   counterDog++;
        // }
        // }
        // return counterCat==counterDog;

        //solution4 (with .compareTo() method)

  /* compareTo() method returns 0 if the string is equal to the other string.
  A value less than 0 is returned if the string is less than
  the other string (less characters) and a value greater than 0
  if the string is greater than the other string (more characters).*/

        int counterCat=0;
        int counterDog=0;
        for(int i=0; i<str.length()-2;i++){

            if (str.substring(i,i+3).compareTo("cat") == 0)
                counterCat++;

            if (str.substring(i,i+3).compareTo("dog") == 0)
                counterDog++;
        }

        return counterCat==counterDog;


    }
}
