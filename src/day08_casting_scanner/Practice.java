package day08_casting_scanner;
import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
        byte b = 55;
        short sh = 20;
        int i = 5555;
        double d = 4759.5;

        byte h = (byte) sh;
        System.out.println("h = " + h);

        int i1 = (int) d; //no decimals
        System.out.println("i1 = " + i1); //double is bigger than int, so we cast it.
        double d1 = i; //decimals
        System.out.println("d1 = " + d1);

        //char to int
        char letter = 'J'; //
        int apples = letter;
        System.out.println("apples = " + apples);

        int home = 67;
        char letter1 = (char) home;
        System.out.println("letter1 = " + letter1);

Scanner scan = new Scanner (System.in); //scanner object from top to bottom
        System.out.println("Enter your number ");
        byte b1 = scan.nextByte();
        System.out.println("Enter your second number");
        short sh1 = scan.nextShort();
        System.out.println("Enter your third number ");
        double d2 = scan.nextByte();










    }
}
