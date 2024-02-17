package week12_December26th;

public class CountHi {
    public static void main(String[] args) {

        System.out.println(countHi("Hi, hi, hi_Song by Paul McCartney"));

    }
    public static int countHi(String str) {

        //solution1(charAt())
        // int count=0;

        // for (int i=0; i<str.length()-1; i++){
        //   if(str.charAt(i)=='h'&& str.charAt(i+1)=='i') count+=1;
        // }
        // return count;


        //solution2(substring() + equals() )
// int count=0;
//   for (int i=0; i<str.length()-1; i++){
//     if(str.substring(i,i+2).equals("hi")) count++;
//   }
//   return count;

//solution3(while loop, contains() and replaceFirst() methods)

        int count = 0;

        while(str.contains("hi")){
            str = str.replaceFirst("hi", "");
            count++;

        }
        return count;
    }

}

