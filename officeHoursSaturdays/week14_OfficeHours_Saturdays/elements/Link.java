package week14_OfficeHours_Saturdays.elements;

public class Link implements  WebElement, Clickable{
    private String url;
    @Override
    public void click() {
        System.out.println("Going to " + url);
    }

    @Override
    public String getText() {
        return url;
    }
}
/*
create a class Link
    implement the WebElement & Clickable interfaces
    override all abstract methods
 */