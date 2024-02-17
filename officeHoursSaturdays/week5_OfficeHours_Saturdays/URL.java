package week5_OfficeHours_Saturdays;
import java.util.Scanner;
public class URL {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Enter your url");
            String url = input.next().trim().toLowerCase(); // www.google.com
            input.close();

            boolean validStart = url.startsWith("www."); //url.substring(0,4).equals("www.")
            boolean validEnd = url.endsWith(".com") || url.endsWith(".org") || url.endsWith(".edu")|| url.endsWith(".gov");

            if(validStart && validEnd){
                String domain = url.substring(4, url.length() - 4);
                System.out.println(url + " is a valid url for " + domain);
            } else {

                if(!validStart){
                    System.out.println(url + " needs to start with www.");
                }

                if(!validEnd){
                    System.out.println(url + " needs to ends with .com, .edu. gov, .org");
                }

            }

        }
    }
/*
Url [Scanner, String methods, conditional]

	Create a program that will allow the user to enter a url. The program will verify if the given url is valid and if it is print the domain name

	A url is valid if it has "www." in the beginning and has either .com, .org, .edu. or .gov at the end

	If the url is valid print the domain name part: $url is a valid url for google

		ex: www.google.com
			www.google.com is a valid url for google

	If the url is not valid print the reason it is not valid:

		ex: amazon.com
		Sorry, amazon.com is not valid because it is missing these:
			www. in the beginning

		ex: youtube
		Sorry, youtube is not valid because it is missing these:
			www. in the beginning
			.com, .org, .edu, or .gov in the end

 */

