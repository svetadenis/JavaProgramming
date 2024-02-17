package week8_OfficeHours_Saturday;

import java.util.Arrays;
public class Runner {
    public static void main(String[] args) {

        int[] nums = {3, 4, 1, 5, 6, 5};
        System.out.println(ArrayUtils.indexOf(nums, 5));
        System.out.println(ArrayUtils.indexOf(nums, 8));

        System.out.println("----------------------------");

        int[] nums2 = ArrayUtils.addTo(nums, 10);
        System.out.println(Arrays.toString(nums2));

        int[] nums3 = ArrayUtils.addTo2(nums, 20);
        System.out.println(Arrays.toString(nums3));

        System.out.println("----------------------------");

        String str = "hello world";
        char[] letters = str.toCharArray();
        System.out.println(Arrays.toString(letters));

        System.out.println(Arrays.toString(str.split(" "))); // returns a String[] of both words
        System.out.println(Arrays.toString(str.split(""))); // returns String[], but separates each character, but they are stillS String

        System.out.println("----------------------------");
        String[] words = { "java", "html", "css", "java", "javascript", "selenium"};
        System.out.println(CountChar.countChar(words, 'a'));
        System.out.println(CountChar.countChar(words, 's'));


    }
}

