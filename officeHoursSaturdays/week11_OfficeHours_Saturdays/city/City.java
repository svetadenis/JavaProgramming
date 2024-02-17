package week11_OfficeHours_Saturdays.city;

public class City {
    private String cityName;
    private double growthRate;
    private int population;
    private String state;

    public City(String cityName, double growthRate, int population, String state) {
        this.cityName = cityName;
        this.growthRate = growthRate;
        this.population = population;
        this.state = state;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public double getGrowthRate() {
        return growthRate;
    }

    public void setGrowthRate(double growthRate) {
        this.growthRate = growthRate;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityName='" + cityName + '\'' +
                ", growthRate=" + growthRate +
                ", population=" + population +
                ", state='" + state + '\'' +
                '}';
    }
}
/*
    create a class City
    encapsulated instance variables:
        city name, growth rate, population, state
    create a constructor to initialize all the variables
    create a toString of all the information
 */

