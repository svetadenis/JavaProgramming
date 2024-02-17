package week4OfficeHours;

public class T1Pizza {
    public static void main(String[] args) {

                String typeOfPizza = "cheese";
                int numberOfSlices = 5;
                int numberOfPeople = 6;

                int slicesPerPerson = numberOfSlices / numberOfPeople;
                int leftOverSlices = numberOfSlices % numberOfPeople;

                System.out.println("We ordered a " + typeOfPizza + " with " + numberOfSlices + " slices. "
                        + numberOfPeople + " people ate " + slicesPerPerson + " slices each, so there was "
                        + leftOverSlices + " slices left");
            }
        }
/*
anytime you use reminder of small number % big number
the result is always the small number
        4 % 10 = 4
        5 % 6 = 5
 */
/*
T1Pizza [variables, operators, concatenation]

    Declare and assign the following variables
        type (type of pizza), slices (how many slices the pizza has), and people (the number of people eating this pizza)

    Calculate how many slices each person will get and how many are left over. Print the output in this format:

        We ordered a $type pizza with $slices slices. $number_of_people people ate $each_share slices each, so there was $remainder slices left

        Ex: We ordered a cheese pizza with 8 slices. 3 people ate 2 slices each, so there was 2 slices left
 */

