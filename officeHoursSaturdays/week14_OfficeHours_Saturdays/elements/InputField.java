package week14_OfficeHours_Saturdays.elements;

public class InputField implements WebElement, Clickable, Input{
    @Override
    public void click() {
        System.out.println("Field selected");
    }

    @Override
    public void sendKeys() {
        System.out.println("Sending keyboard input");
    }

    @Override
    public String getText() {
        return "enter your text";
    }
}
/*
create a class InputField
    implement he WebElement, Clickable & Input interfaces
    override all abstract methods
 */
