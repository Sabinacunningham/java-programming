package day15_logicalANDOperator;

public class ORLogicalOperator {
    public static void main(String[] args) {
        System.out.println("true || true = " + (true || true));


        int apples = 5;
        int oranges = 7;

        System.out.println(apples > 3 || oranges > 4);

        if (apples > 3 || oranges > 4) {
            System.out.println("No need to buy any fruits today");
        } else {
            System.out.println("Need to get some fruits");

        }
        System.out.println(apples > 2 || oranges > 10);

        if (apples > 2 || oranges > 10) {
            System.out.println("Looks like we are good with fruit");
        } else {
            System.out.println("Need to buy some fruits");
            if (apples == 0 || oranges == 0) {
        }
        System.out.println(apples == 0 || oranges == 0);
        System.out.println("We need to purchase some fruit");

        System.out.println("We are good with fruit");


    }

    }
}



