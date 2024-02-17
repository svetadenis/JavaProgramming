package day08_ternary_switch;

public class Elevator {
    public static void main(String[] args) {

        int floorNumber = 10;
        if (floorNumber >=1 && floorNumber<=3){
            //floor1
            //floor2
            //floor3
            if(floorNumber ==1){
                System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
            }else if (floorNumber==2) {
                System.out.println("Floor 2 selected. Companies: Cydeo, NASA, Intelsat");
            }else{;
                System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");
            }

        }else{
            //invalid floor
            System.out.println("Invalid floor");
        }

        System.out.println("________________________________________");
        int floorNumber1 = 2;
        String result1 = "Invalid floor";

        if (floorNumber1 >=1 && floorNumber1<=3){
            //floor1
            //floor2
            //floor3
            result1 = "Floor"+floorNumber1+" is selected.Companies: ";
            if(floorNumber1 ==1){
            result1+= " Lobby, Verizon, Starbacks";
            }else if (floorNumber1==2) {
            result1+= " Cydeo, NASA, Intelsat ";
            }else{;
            result1+= " Lyft, BofA, Stake house";
            }

            System.out.println(result1);
        }

    }
}
   /* Warmup task:
        1. Create a class called Elevator. A variable named floorNumber is given, write a program that can display the floor info
        when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"
        when floorNum is 2 -> print "Floor 2 selected. Companies: Cydeo, NASA, Intelsat"
        when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"

        anything else: print "Invalid floor - 6"*/

