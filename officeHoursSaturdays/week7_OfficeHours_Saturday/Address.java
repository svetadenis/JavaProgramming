package week7_OfficeHours_Saturday;

public class Address {
    // instance variables, we can access them from an object
    public String street;
    public String city;
    public String state;
    public String zipcode;
    public String country;

    // parameters are local variables
    public void setInfo(String street, String city, String state, String zipcode, String country){
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.country = country;
    } // this is used to access/reference the instance variables not the local variables

    public String toString(){
        return street + "\n" + city + ", " + state + " " + zipcode + "\n" + country;
    }

}


/*
Address [object type]

	create a class called Address
	declare these instance variables:
		street, city, state, zipcode, country

	create a setInfo() method to initialize these variables

	create a toString() that shows the full address in the following format
		$street
		$city, $state $zipcode
		$country

	create a different class and create some Address objects
 */

