package week12_OfficeHours;

    import java.lang.reflect.Constructor;

    public class ConstructorQuiz {
        public static void main(String[] args) {

            System.out.println("======= Question 2 =======");
            System.out.println("A constructor can not be static, and constructor can return a value as long as the value is matching with its return type");
            System.out.println("Answer: false");
            // A constructor can not be static -> true
            // constructor can return a value as long as the value is matching with its return type -> false
            // true & false -> false, both are not true

            System.out.println("======= Question 3 =======");
            System.out.println("Constructors are executed every time the class is used");
            System.out.println("Answer: false");
            // the class can be used by calling static variables, or using an instance methods from an object. The constructor is not run in those situations. It is only run when the class is instantiated

            System.out.println("======= Question 4 =======");
            System.out.println("Answer: Compilation fails at line 1");
            // the constructor name needs to match the class name

        /*
            public class Test{
                public Constructor(){ this should be Test
                    System.out.println("Default ");
                }

                public static void main(String[] args) {
                    Test obj = new Test();
                }
            }
        */

            System.out.println("======= Question 5 =======");
            System.out.println("Answer: Compilation fails at line 2");
            // a constructor call cannot be on the second line. all constructor calls must be the first line

        /*
            public class Test{      // line 1
                public Test(){
                    System.out.println("A ");
                    this(10)  <<----- line 2
                }

                public Test(int a){
                    System.out.println("B ");
                }
            }
        */

            System.out.println("======= Question 6 =======");
            System.out.println("Every class must have at one constructor, if no constructor is declared, then the compiler will thrown an exception during the runtime");
            System.out.println("Answer: false");
            // the compiler declares a default constructor

            System.out.println("======= Question 7 =======");
            System.out.println("Answer: Compilation fails at line 3");
            // a constructor call cannot be on the second line. all constructor calls must be the first line and there cannot be more than one constructor called
    /*
        public class Test {
            public Test(){
                System.out.println("A ");
            }
            public Test(int a){
                this();     // line 1
                System.out.println("B ");
            }
            public Test(String str){
                this();     // line 2
                this(100);  // line 3           <<<----
                System.out.println(str);
            }

            public static void main(String[] args) {
                Test obj = new Test();
            }
        }
    */

            System.out.println("======= Question 8 =======");
            System.out.println("The int arg constructor is called when the object is made in the main method. That constructor calls the double constructor with the 2.5 argument. The double constructor calls the no arg constructor so 'A ' is printed. Then the double constructor finishes printing 'C ' and then the int constructor finishes printing 'B '");
    /*
        public class Test {
            public Test(){
                System.out.println("A ");
            }
            public Test(int a){
                this(2.5);
                System.out.println("B ");
            }
            public Test(double c){
                this();
                System.out.println("C ");
            }

            public static void main(String[] args) {
                Test obj = new Test(100);
            }
        }
    */

            System.out.println("======= Question 9 =======");
            System.out.println("The correct statements were:");
            System.out.println("Constructor's name must be same with the class name");
            System.out.println("Constructors can be used to create an object from the class");
            System.out.println("Multiple constructors can be given to a class as long as the parameters are different");

            System.out.println("======= Question 10 =======");
            System.out.println("Answer: Developer");
            // the method Test() is never called anywhere. only the constructor is called when the object is created

        /*
            public class Test {
                public Test(){
                    System.out.println("Developer");
                }

                public void Test(){
                     System.out.println("SDET");
                }

                public static void main(String[] args) {
                    Test obj = new Test();
                }
            }
        */

        }
    }

