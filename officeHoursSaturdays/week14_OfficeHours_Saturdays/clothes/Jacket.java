package week14_OfficeHours_Saturdays.clothes;

public class Jacket extends Clothes implements HasHood{
    @Override
    public void wear() {
        System.out.println("Put on jacket because it is cold");
    }

    @Override
    public void putOnHood() {
        System.out.println("Put on jacket hood");
    }
}
/*
	create a class Jacket
	inherits the Clothes class
	implements the HasHood interface
	implement the wear() & putOnHood() methods
 */