package week14_OfficeHours_Saturdays.elements;

public class Button implements WebElement, Clickable{
    private String text;

    @Override
    public void click() {
        System.out.println("Button is clicked");
    }

    @Override
    public String getText() {
        return text;
    }
}
/*
create a class Button
    implement the WebElement & Clickable interfaces
    override all abstract methods
 */