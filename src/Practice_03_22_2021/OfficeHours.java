package Practice_03_22_2021;
import java.util.Scanner;
public class OfficeHours {
    public static void main(String[] args) {


        // next() vs nextLine()
        /*

        next () -> read a String value from the console
        it only reads a single word -> spaces separate words

        nextLine() -> read a String value from the console
        it will read multiple words
        -> Also accepts the enter input
         */
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your name");
        int number = input.nextInt();
        System.out.println("Enter your number");
        input.nextLine();
        String name = input.nextLine();

        System.out.println(number);
        System.out.println(name);


    }

}
