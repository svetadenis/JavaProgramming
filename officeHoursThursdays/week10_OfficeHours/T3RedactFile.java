package week10_OfficeHours;

import java.util.ArrayList;
import java.util.Arrays;

public class T3RedactFile {
    public static void main(String[] args) {
        String text = "Agent Shadow, a seasoned operative with a reputation for discretion, embarked on a mission to dismantle an international syndicate threatening global security. Intelligence suggested that the syndicate, codenamed Silhouette was orchestrating a series of cyber-attacks to gain control of sensitive government databases. Posing as a wealthy entrepreneur, Agent Shadow infiltrated a high-profile gala where Silhouette's enigmatic leader, known only as Ghost, was rumored to make an appearance. Disguised in a sleek tuxedo, Agent Shadow discreetly mingled with the elite attendees, extracting valuable information about the syndicate's next move. As the night unfolded, Agent Shadow intercepted encrypted messages hinting at a secret meeting location. Employing her skills in cryptography, she deciphered the coordinates pointing to an abandoned warehouse on the outskirts of the city. The warehouse, it seemed, served as Silhouette's operational base. Under the cover of darkness, Agent Shadow infiltrated the warehouse, discovering advanced surveillance equipment and a command center for the cyber-attacks. In a hidden chamber, she stumbled upon a dossier containing the names of compromised agents within various intelligence agencies. With the gathered evidence, Agent Shadow transmitted a secure report to headquarters, exposing Silhouette's plans and outlining a strategy for a coordinated takedown. The race against time had begun, as global security hung in the balance, and Agent Shadow prepared for the final confrontation with the elusive Ghost.";

        ArrayList<String> hide = new ArrayList<>(Arrays.asList("Shadow", "dismantle", "syndicate", "Silhouette", "Ghost", "warehouse", "darkness", "cyber-attacks"));

        System.out.println(redactFile(text, hide));
    }
    public static String redactFile(String text, ArrayList<String> wordsToRedact){
        String result = "";
        for(String eachWord : text.split(" ")){ ///Agent Shadow, a seasoned operative with a
            eachWord = eachWord.replace("," , "").replace(".", "").replace("'s", "").trim();
            if(wordsToRedact.contains(eachWord)){
                eachWord = ("-").repeat(eachWord.length()); // shadow -> ------ | dog -> ---
            }
            result += eachWord + " ";
        }
        return result;
    }

}
/*

T3RedactFile [ArrayList, array, loop, String]

create a program that will define important text in a file (just a String). Then define an ArrayList of the words that need to be redacted or hidden. Go through each word of the file and hide the words that were given.

for example, if file has the word "hello" and that is one of the words that should be hidden you can replace that word with "-----"

sample data:
text = "Agent Shadow, a seasoned operative with a reputation for discretion, embarked on a mission to dismantle an international syndicate threatening global security. Intelligence suggested that the syndicate, codenamed Silhouette was orchestrating a series of cyber-attacks to gain control of sensitive government databases. Posing as a wealthy entrepreneur, Agent Shadow infiltrated a high-profile gala where Silhouette's enigmatic leader, known only as Ghost, was rumored to make an appearance. Disguised in a sleek tuxedo, Agent Shadow discreetly mingled with the elite attendees, extracting valuable information about the syndicate's next move. As the night unfolded, Agent Shadow intercepted encrypted messages hinting at a secret meeting location. Employing her skills in cryptography, she deciphered the coordinates pointing to an abandoned warehouse on the outskirts of the city. The warehouse, it seemed, served as Silhouette's operational base. Under the cover of darkness, Agent Shadow infiltrated the warehouse, discovering advanced surveillance equipment and a command center for the cyber-attacks. In a hidden chamber, she stumbled upon a dossier containing the names of compromised agents within various intelligence agencies. With the gathered evidence, Agent Shadow transmitted a secure report to headquarters, exposing Silhouette's plans and outlining a strategy for a coordinated takedown. The race against time had begun, as global security hung in the balance, and Agent Shadow prepared for the final confrontation with the elusive Ghost."

hide = "Shadow", "dismantle", "syndicate", "Silhouette", "Ghost", "warehouse", "darkness", "cyber-attacks"
 */