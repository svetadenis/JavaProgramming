package week11_OfficeHours_Saturdays.city;

 import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

    public class Database {

        private Database(){ // making the constructor private means I cannot create an object of the class

        }

        public static ArrayList<City> allCities;

        static { // we want the static block to run right away
            allCities = new ArrayList<>();
            try { // don't worry about the try block - we need it for now
                Scanner input = new Scanner(Path.of("src/week11/city/cities.txt"));
                while(input.hasNext()){ // checks if there is another line
                    String line = input.nextLine(); // read from the file
                    //System.out.println(line);  // this was to test the flow
                    String[] eachPart = line.split(",");
                    City eachCity = new City(
                            eachPart[0],
                            Double.parseDouble(eachPart[1]),
                            Integer.parseInt(eachPart[2]),
                            eachPart[3]
                    );
                    allCities.add(eachCity);
                }

                input.close();

            } catch (IOException e) { // this is also part of the try catch
                throw new RuntimeException(e);
            }

        }

    }
/*
    create a class Database
    create a static variable: data (ArrayList of City)
    create a static block and read the information from the file
    while reading the information from the text file create City objects and add them into the ArrayList of Cities
    -> look back to day 10 for using Scanner to read a file
 */

