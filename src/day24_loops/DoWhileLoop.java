package day24_loops;

public class DoWhileLoop {
    public static void main(String[] args) {
        int counter = 100; //will print 100 once and exit the loop
        do {
            System.out.println("counter = " + counter);
            counter+=100;
        } while (counter <=1000);
    }
}
