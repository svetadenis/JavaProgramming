package week5OfficeHours;


    import java.util.Scanner;

    public class HouseMarket {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Hello. Which neighborhood would you like a summary of?\n\t*Hills\t*Oaks\t*Highlands\t*Canyon");
            String neighborhood = input.next(); // if the neighborhood names could be multiple word then use nextLine()
            input.close();

            int averagePrice = 0;
            double schoolRating = 0;
            boolean isGated = false;
            boolean allowsPets = false;

            boolean isValidData = true; // this will only be changed to false if the data is invalid. The data is only invalid if the user types a neighborhood name that is not available.

            switch (neighborhood) {
                case "Hills":
                    averagePrice = 89_000;
                    schoolRating = 4.0;
                    isGated = false;
                    allowsPets = true;
                    break;
                case "Oaks":
                    averagePrice = 75_000;
                    schoolRating = 3.5;
                    isGated = false;
                    allowsPets = true;
                    break;
                case "Highlands":
                    averagePrice = 150_000;
                    schoolRating = 4.5;
                    isGated = true;
                    allowsPets = false;
                    break;
                case "Canyon":
                    averagePrice = 201_000;
                    schoolRating = 4.8;
                    isGated = true;
                    allowsPets = true;
                    break;
                default:
                    isValidData = false;
            }

            String report;
            if (isValidData) {
                report = "The houses in the " + neighborhood + " neighborhood on average value at $" + averagePrice + ". This neighborhood ";
                report += (isGated ? "is" : "is not") + " gated ";
                report += "and the rating of the school distracts near by is " + schoolRating + " out of 5. ";
                report += (allowsPets ? "Lucky for pet owners, you can bring your pets." : "Sorry to pet owners, but this neighborhood doesn't allow pets");
            } else {
                report = "Sorry no data for " + neighborhood;
            }

            System.out.println(report);

            System.out.println(isValidData ? ("The houses in the " + neighborhood + " neighborhood on average value at $" + averagePrice + ". This neighborhood " + (isGated ? "is" : "is not") + " gated " + "and the rating of the school distracts near by is " + schoolRating + " out of 5. " + (allowsPets ? "Lucky for pet owners, you can bring your pets." : "Sorry to pet owners, but this neighborhood doesn't allow pets")) : "Sorry no data for " + neighborhood);

        }
    }

/*
T4HouseMarket [switch, variables]

You are buying a new house and need to collect information about the houses in a specific neighborhood

	create a program that will declare and define the neighborhood name and based on the name return a report of the houses in that area. The report should include this information: the average house price, rating of school districts near by(out of 5), if it is a gated community or not, and if pets are allowed

	print the final report in this format:
		$the houses in the $neighborhood_name on average value at $average_price. This neighborhood $is_gated_or_not and the rating of the school distracts near by is $school_rating out of 5. For the pet owners you $are_or_not in luck because pets are $allowed_or_not_allowed

		Note: for simple use you can print true or false in the gated and pets parts, but for a challenge try to print the message with as many dynamic parts as possible

	Data to use:

		name - Hills
		average price - 89,000
		rating - 4.0
		gated - no
		allow pets - yes

		name - Oaks
		average price - 75,000
		rating - 3.5
		gated - no
		allow pets - yes

		name - Highland
		average price - 150,000
		rating - 4.5
		gated - yes
		allow pets - no

		name - Canyon
		average price - 201,000
		rating - 4.8
		gated - yes
		allow pets - yes

 */

