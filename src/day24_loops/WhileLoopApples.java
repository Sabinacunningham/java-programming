package day24_loops;

public class WhileLoopApples {
    public static void main(String[] args) {
        int apples = 1;
        while (apples <=10) { //while is like "if"
            System.out.println("eating an apple " + apples); //will print out 10 eating an apple
            apples++;
        }
        System.out.println("No more apples :(");
    }
}
