package week13_OfficeHours_Saturdays.exercise;

public final class Running extends Exercise{
    @Override
    public void perform() {
        System.out.println("Running for fun, not sure who does this");
    }

    @Override
    public int getCaloriesBurned(int minutes) {
        return minutes * 15;
    }
}
/*
	inherit the Exercise class and implement the abstract methods
		for calories method return minutes * 15
 */