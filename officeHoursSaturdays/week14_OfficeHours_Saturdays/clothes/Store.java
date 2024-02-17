package week14_OfficeHours_Saturdays.clothes;

import java.util.ArrayList;
import java.util.Arrays;

public class Store {
    public static void main(String[] args) {

        //Tshirt objects

        TShirt tShirt = new TShirt();
        tShirt.wear();
        tShirt.size = "L";

        Clothes tShirt2 = new TShirt();
        tShirt2.wear();
        //tShirt2.size = "L";

        Object tShirt3 = new TShirt();
        //tShirt3.wear(); // Object reference does not have access to the wear method

        // Jacket object

        Jacket jacket = new Jacket();
        jacket.wear();
        jacket.putOnHood();

        Clothes jacket2 = new Jacket();
        jacket2.wear();
        //jacket2.putOnHood();

        Object jacket3 = new Jacket();
//        jacket3.wear();
//        jacket3.putOnHood();
        System.out.println(jacket3.toString());

        HasHood jacket4 = new Jacket();
        //jacket4.wear();
        jacket4.putOnHood();

        System.out.println("========================================");

        ArrayList<Clothes> allClothes = new ArrayList<>(Arrays.asList(
                new Jacket(),
                new TShirt(),
                new TShirt(),
                jacket2,
                tShirt2,
                jacket,
                tShirt
        ));

        for(Clothes each : allClothes){
            each.wear();
            if(each instanceof TShirt){
                System.out.println(((TShirt) each).size);
            }
        }

    }
}