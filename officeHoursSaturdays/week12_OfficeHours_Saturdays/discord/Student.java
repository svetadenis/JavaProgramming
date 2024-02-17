package week12_OfficeHours_Saturdays.discord;

    import java.time.LocalDate;

    public class Student extends DiscordUser{
        public Student(String name, int id, LocalDate accountCreationDate) {
            super(name, id, accountCreationDate);
        }
        public void sendMessage(String name){
            System.out.println("Sending message " + name);
        }
    }
/*
	Create a class Student

	    - Student class inherits DiscordUser class

	    - create constructor to call parent constructor and set up variables (role - Student, name, id)

	    - overload the sendMessage(String name) to accept a String for the chat name
	    	print Sending message to $name
 */

