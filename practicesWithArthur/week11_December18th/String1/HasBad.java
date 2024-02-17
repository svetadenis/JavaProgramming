package week11_December18th.String1;

    public class HasBad {
        public static void main(String[] args) {
            System.out.println(hasBad("fbadfff"));
        }
        public static boolean hasBad(String str) {
            //solution1 (substring+equals methods)
            // return str.length()>=3 &&  (str.substring(0,3).equals("bad")||
            // str.length()>=4 && str.substring(1,4).equals("bad"));

            //solution2 (substring+startsWith methods)
//   if(str.length()<3) {
// return false;
// }
// if (str.substring(0).startsWith("bad") || str.substring(1).startsWith("bad")){
// return true;
// }
// return false;


//solution3 (do wee need to use substring(0) with startsWith method?)
//   if(str.length()<3) {
// return false;
// }
// if (str.startsWith("bad") || str.substring(1).startsWith("bad")){
// return true;
// }
// return false;

            //Solution4 (indexOf() method)
            int index = str.indexOf("bad");
            return index == 0 || index == 1;
        }

    }


