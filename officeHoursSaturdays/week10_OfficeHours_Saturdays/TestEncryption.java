package week10_OfficeHours_Saturdays;

public class TestEncryption {
    public static void main(String[] args) {

        Encryption encryption1 = new Encryption("james bond", 20, 2);
        System.out.println(encryption1);

        Encryption encryption2 = new Encryption("i love java", 13, 3);
        System.out.println(encryption2);

        System.out.println(Encryption.decrypt("252 234 258 242 270 104 236 262 260 240", 20, 2));
        System.out.println(Encryption.decrypt("252 234 258 242 270 104 236 262 260 240", 25, 4)); // the invalid modify number and factor number will give a wrong output
        System.out.println(Encryption.decrypt("354 135 363 372 393 342 135 357 330 393 330", 13, 3));
        System.out.println(Encryption.decrypt("387 354 366 342 135 345 372 381 135 363 390 369 336 351 135 363 372 363", 13, 3));

    }
}
