package day18_memoryManagement;

public class TestPizzaObjects {
    public static void main(String[] args) {
      Pizza pizza1= new Pizza();
      // pizza 1 is reference type of variable
     pizza1.setInfo('M', 2,4);

     Pizza pizza2 = new Pizza();
     //pizza2.size = 'M';
    pizza2.setInfo('S',3,5);

        System.out.println(pizza1.toString());
        System.out.println(pizza2.toString());

        System.out.println("____________________________________________________________");

        double total = 0;
        for (int i=0; i<20; i++){//total will be 60 pizzas
            Pizza small = new Pizza();
            small.setInfo('S', 2, 2);
            total+=small.calcCost();

            Pizza medium = new Pizza();
            medium.setInfo('M',3,4);
            total+=medium.calcCost();

            Pizza large = new Pizza();
            large.setInfo('L',4,5);
            total+=large.calcCost();

        }
        System.out.println("total = "+total);

    }
}
