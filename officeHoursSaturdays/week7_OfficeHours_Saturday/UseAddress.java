package week7_OfficeHours_Saturday;

public class UseAddress {
    public static void main(String[] args) {

        Address myHouse = new Address();
        myHouse.setInfo("123093 George LN", "Chicago", "IL", "31232", "US");

        System.out.println(myHouse); // when an object is printed the toString is called

    }
}

