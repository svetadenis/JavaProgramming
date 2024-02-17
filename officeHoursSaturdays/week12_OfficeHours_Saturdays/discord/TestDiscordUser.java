package week12_OfficeHours_Saturdays.discord;

import java.time.LocalDate;

public class TestDiscordUser {
    public static void main(String[] args) {

        DiscordUser discordUser = new DiscordUser("James", 7, LocalDate.of(2023, 2, 18));
        System.out.println(discordUser);
        discordUser.joinDiscord("testing.discord");
        discordUser.sendMessage();
        //discordUser.createChannel(); this method was created in a sub class

        System.out.println("-----------------------------------");

        Admin admin = new Admin("Saim", 10, LocalDate.of(2020, 8, 30));
        admin.setId(25);
        System.out.println(admin);
        System.out.println(admin.getRole());
        admin.sendMessage();
        admin.createChannel();
        admin.joinDiscord("testing.discord");

        System.out.println("-----------------------------------");

        Student student = new Student("Mariia", 27, LocalDate.of(2023, 9, 29));
        System.out.println(student);
        student.sendMessage();
        student.sendMessage("Eran");

    }}
