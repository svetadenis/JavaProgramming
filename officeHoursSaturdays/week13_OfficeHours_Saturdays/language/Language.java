package week13_OfficeHours_Saturdays.language;

import week8_OfficeHours_Saturday.LanguageCharacters;
import java.util.Arrays;

public interface Language {

    String DEFAULT_ENCODING = "UTF-8"; // this is public static final

    void hello(); // public abstract
    String bye();

    static void description(){
        System.out.println("Languages have the ability to express thoughts and ideas to others using units of sound like words or sentences. There is often rules or syntax for how the words come together");
    }

    default void translate(String lang){
        System.out.println(Arrays.toString(LanguageCharacters.getCharsFor(lang)));
        System.out.println("Translating to " + lang);
    }

}
/*
Language [interface]

	create an interface Language
	create a constant variable: DEFAULT_ENCODING = "UTF-8";
	create abstract methods: hello() & bye()
	create a static method: description()
		print a message about languages: "Languages have the ability to express thoughts and ideas to others using units of sound like words or sentences. There is often rules or syntax for how the words come together"

	create a default method translate()
		based on the language output how many character the language has:

		2 options:
			make a switch with some different print statements
			or
			use the LanguageCharacters method we created in week 7

	create a class English and implement Language
	create a class Spanish and implement Language
		add as many languages as you want
	test all the methods
 */