package utilities;


import java.util.ArrayList;

public class ArrayListUtil {

    public static ArrayList<Character> strToCharacterList(String str){
        ArrayList<Character> list = new ArrayList<>();
        for(char each : str.toCharArray()){
            list.add(each);
        }
        return list;
    }
}