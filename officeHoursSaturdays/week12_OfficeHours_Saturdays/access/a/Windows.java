package week12_OfficeHours_Saturdays.access.a;


    // same package
    public class Windows extends Computer {
        public static void main(String[] args) {
            Windows windows = new Windows();
            windows.brand = "Dell";
            windows.os = "Windows";
            windows.memory = 64;
            System.out.println(windows);
            // everything expect the private variable was inherited
        }
    }
