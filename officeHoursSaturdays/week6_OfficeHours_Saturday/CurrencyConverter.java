package week6_OfficeHours_Saturday;

public class CurrencyConverter {
    public static double convertTo(String currencyType, double amount){
        double convertedAmount = amount;
        switch (currencyType.toLowerCase()){
            case "euro":
                convertedAmount = amount * 0.91;
                break;
            case "yen":
                convertedAmount = amount * 121.03;
                break;
            case "lira":
                convertedAmount = amount * 14.85;
                break;
            case "won":
                convertedAmount = amount * 1217.52;
                break;
            case "rupee":
                convertedAmount = amount * 181.45;
                break;
        }

        return convertedAmount;
    }

    public static double convertTo2(String currencyType, double amount){
        switch (currencyType.toLowerCase()){
            case "euro":
                return amount * 0.91;
            case "yen":
                return amount * 121.03;
            case "lira":
                return amount * 14.85;
            case "won":
                return amount * 1217.52;
            case "rupee":
                return amount * 181.45;
            default:
                return amount;
        }
    }

}

/*
Currency Converter [methods, conditional, operators]

	create a method that will accept a currency type(String) and a currency amount (double)[as dollars] and convert the currency from dollars to a different type. return the converted number

	Use the following sample rates for currency conversions
		1 dollar = 0.91 euro
		1 dollar = 121.03 yen
		1 dollar = 14.85 lira
		1 dollar = 1,217.52 won
		1 dollar = 181.45 rupee

	Note: Don't worry about decimal formats, focus on the code to create these conversions

	Follow up: think about how this method could be improved

		Ex:
			Input: euro, 100
			Output: 91

		Ex:
			Input: yen, 50
			Output: 6051.5
 */

