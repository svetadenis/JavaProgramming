package week13_OfficeHours_Saturdays.exercise;

import java.util.List;

public final class Bench extends Lifting{
    @Override
    public void perform() {
        System.out.println("Bench Pressing weights");
    }

    @Override
    public int getCaloriesBurned(int minutes) {
        return minutes * 5;
    }

    @Override
    public void rackWeight() {
        System.out.println("Racking back to holder");
    }
}
/*
	create a class Bench
	inherit the Lifting class and implement the abstract methods
		for calories method return minutes * 5
 */