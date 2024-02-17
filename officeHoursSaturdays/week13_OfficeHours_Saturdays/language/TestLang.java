package week13_OfficeHours_Saturdays.language;

public class TestLang {
    public static void main(String[] args) {

        // cannot instantiate an interface
        //Language language = new Language();

        English english = new English(); // English is a Language
        english.hello();
        System.out.println(english.bye());
        english.translate("braille");

        Spanish spanish = new Spanish(); // Spanish is a Language
        spanish.hello();
        System.out.println(spanish.bye());
        spanish.translate("greek");
        // static methods are not inherited
//        spanish.description();
//        Spanish.description();
        System.out.println(Spanish.DEFAULT_ENCODING);

        Language.description();
        System.out.println(Language.DEFAULT_ENCODING);

    }
}
