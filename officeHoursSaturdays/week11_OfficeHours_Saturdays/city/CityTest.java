package week11_OfficeHours_Saturdays.city;

    import java.util.ArrayList;

    public class CityTest {
        public static void main(String[] args) {

            // print all the cities
            for(City eachCity : Database.allCities){
                System.out.println(eachCity);
            }

            //filter by state
            System.out.println("================================");
            ArrayList<City> byState = new ArrayList<>(Database.allCities);
            byState.removeIf(p -> !p.getState().equalsIgnoreCase("Virginia"));
            System.out.println(byState);
            System.out.println(byState.size());

            // sub task: print all of the city names that are Virginia
            for(City each : byState){
                System.out.print(each.getCityName() + ", ");
            }


            //filter by city names started with a specific letter

            // cities by their growth rate

            // filter cities by their population
            ArrayList<City> byPopulation = new ArrayList<>(Database.allCities);
            byPopulation.removeIf(p -> p.getPopulation() < 200_000);
            for(City each : byPopulation){
                System.out.print(each.getCityName() + ", ");
            }
            System.out.println();
            System.out.println(byPopulation.size());

        }}

