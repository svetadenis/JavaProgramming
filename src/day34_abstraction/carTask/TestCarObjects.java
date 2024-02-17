package day34_abstraction.carTask;

public class TestCarObjects {

    public static void main(String[] args) {

        //  Car car1 = new Car("X6", "Red", 2020, 45000);

        Honda honda = new Honda("Pilot", "Black", 2019, 35000);

        Audi audi = new Audi("Q6", "Silver", 2020, 36000);

        Tesla tesla = new Tesla("Model Y", "Blue", 2022, 60000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        System.out.println("--------------------------------------------");

        honda.stop();
        audi.stop();
        tesla.stop();

        System.out.println("--------------------------------------------");

        honda.start();
        audi.start();
        tesla.start();

        System.out.println("--------------------------------------------");
        audi.autoPark();
        tesla.autoPilot();



    }
}
//Honda{model='Pilot', color='Black', year=2019, price= $35000.0}
//Audi{model='Q6', color='Silver', year=2020, price= $36000.0}
//Tesla{model='Model Y', color='Blue', year=2022, price= $60000.0}
//--------------------------------------------
//Press the brake to stop Honda Pilot
//Press the brake to stop Audi Q6
//Press the brake to stop Tesla Model Y
//--------------------------------------------
//Twist the key to ignition to start Honda Pilot
//Press the start button to start Audi Q6
//Use voice control to start Tesla Model Y
//--------------------------------------------
//Audi Q6 has auto park feature
//Tesla Model Y has auto pilot feature