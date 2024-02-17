package week12_OfficeHours_Saturdays.discord;

import java.time.LocalDate;

public class Admin extends DiscordUser{
    public Admin(String name, int id, LocalDate accountCreationDate) {
        super(name, id, accountCreationDate);
    }

    public void createChannel(){
        System.out.println("Creating a new discord channel");
    }

    @Override
    public void sendMessage() {
        System.out.println("Sending announcement");
    }
}
/*
	Create a class Admin

	    - Admin class inherits DiscordUser class

	    - create constructor to call parent constructor and set up variables (role - Admin, name, id)

	    - create method:
	        createChannel()
	            Example output: prints Creating new discord channel

	    - override the sendMessage() to print: "Sending announcement"
 */

