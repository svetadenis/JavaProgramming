package week9OfficeHours;

public class T2AnimalSpecies {
    public String name;
    public double population; // each unit is 1 million
    public double growthRate; // this is a percentage

    public void setInfo(String name, double population, double growthRate){
        this.name = name;
        this.population = population;
        this.growthRate = growthRate;
    }

    public double calculateInYears(int year){
        return population + population * (growthRate/100) * year;
    }

    public String toString(){
        return "The " + name + " currently has a population of " + population + " million\nThe growth rate is sitting around " + growthRate + "%, so we predict the population in 5 years will be: " + calculateInYears(5);
    }

}

/*
T2AnimalSpecies [object type]

    Create a class called AnimalSpecies
    declare these instance variables:
        name, population (double), growth rate (double)
        -> where the unit for the population is 1 million. Ex: 20 population would represent 20 million
        -> where the growth rate is a number percentage. Ex: 2.5 growth rate would be 2.5%

    create a setInfo() method to initialize these variables

    create a method called calculateInYears that will accept an int year parameter and return the population estimate. Calculate the estimate of what the population will be in the given years based on the growth rate

    create a toString() that shows the information in the following format:
        The $name currently has a population of $population million
        The growth rate is sitting around $rate %, so we predict the population in 5 years will be: $5_year_estimate

    use the ObjectTester class and create some AnimalSpecies objects

 */


