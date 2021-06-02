package day13_conditional_statements;

public class BonusCalculator {
    public static void main(String[] args) {
        double bonus = 0.0;
        double salesAmount = 2000.55;
        if (salesAmount <= 1000) {
            bonus = 50;
            System.out.println("Good job, you qualify for bonus");
        } else {
            bonus = 100;
            System.out.println("Great job, you are qualified for full bonus");
            System.out.println("Your total bonus : $" + bonus);


        }


    }
}
