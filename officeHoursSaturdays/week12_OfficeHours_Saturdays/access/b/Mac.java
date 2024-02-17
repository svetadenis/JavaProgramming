package week12_OfficeHours_Saturdays.access.b;

    import week12_OfficeHours_Saturdays.access.a.Computer;


    // inheriting outside the package
    public class Mac extends Computer{
        public static void main(String[] args) {
            Mac mac = new Mac();
            mac.os = "Mac";
            mac.memory = 100;
            // only the public and protected variables are inherited outside the package
//        mac.brand;
//        mac.hasWifiCard
        }
}
