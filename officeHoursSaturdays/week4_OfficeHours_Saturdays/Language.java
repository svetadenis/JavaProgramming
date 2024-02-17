package week4_OfficeHours_Saturdays;

public class Language {
    public static void main(String[] args) {

        String language = "Arabic";
        String result = "";

        switch (language) {
            case "English":
                result = "hello, thank for your call";
                break;
            case "Spanish":
                result = "hola, gracias por llamar";
                break;
            case "Turkish":
                result = "merhaba, aradiginiz icin tesekkurler";
                break;
            case "Russian":
                result = "privet, spasibo za vash zvonok";
                break;
            case "French":
                result = "Merci, pour votre appel";
                break;
            default:
                result = "sorry, " + language + " not supported";
        }

        System.out.println(result);

    }
}
/*
Language [switch]

	Declare and assign a language variable
	Based on the language selected print the related message:

	English: hello, thank for your call
	Spanish: hola, gracias para llamar
	Turkish: merhaba, aradiginiz icin tesekkurler
	Russian: privet, spasibo za vash zvonok
	French: Merci, pour votre appel
	Any other input: sorry, $given_language not supported
 */

