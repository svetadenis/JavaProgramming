package week12_OfficeHours_Saturdays.discord;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DiscordUser {
    private String role;
    private String name;
    private int id;
    private LocalDate accountCreationDate;

    public DiscordUser(String name, int id, LocalDate accountCreationDate) {
        this.role = getClass().getSimpleName();
        this.name = name;
        this.id = id;
        this.accountCreationDate = accountCreationDate;
    }

    public void sendMessage(){
        System.out.println("Sending message to class chat");
    }

    public void joinDiscord(String discordUrl) {
        System.out.println("Joining " + discordUrl);
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getAccountCreationDate() {
        return accountCreationDate;
    }

    public void setAccountCreationDate(LocalDate accountCreationDate) {
        this.accountCreationDate = accountCreationDate;
    }

    @Override
    public String toString() {
        return name + id + "\n" + accountCreationDate.format(DateTimeFormatter.ofPattern("MMM dd, yyyy")) + "\nRoles: " + role;
    }
}

/*
DiscordUser [Inheritance, overriding, super constructor, LocalDate]

	Create an DiscordUser class

	    - create variables:
	        role, name, id
	        variable: account creation date

	    - create constructor to initialize the variables

	    - create a method sendMessage()
	    	prints: "Sending message to class chat"

	    - create a method joinDiscord(String discordUrl)
	    	prints: "Joining $discordUrl"

	    - override toString()
 */
