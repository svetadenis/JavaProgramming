package week12_OfficeHours_Saturdays.access.b;

    // in different package, no inheritance
    public class RunnerB {
        public static void main(String[] args) {
            Mac mac = new Mac();
            mac.os = "Mac";
            //mac.memory = 100; // we cannot directly access the protected variable outside the package
            // only the public and protected variables are inherited outside the package
//        mac.brand;
//        mac.hasWifiCard
        }
}
