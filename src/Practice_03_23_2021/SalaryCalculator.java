package Practice_03_23_2021;
import java.util.Scanner;
public class SalaryCalculator {
    public static void main(String[] args) {
        boolean hourlyRateIsValid = true;


        if(!hourlyRateIsValid) {
            System.out.println("args = " + args);

            Scanner input = new Scanner (System.in);
            System.out.println("Enter a number");
            int num = input.nextInt();

            if(num > 0) {
                System.out.println("Enter a single word");
                char letter = input.next().charAt(0);

                System.out.println("Enter a single word");
                String word = input.next();



                if (word.length() %2 == 0)

                if(letter >= 'A' && letter <= 'Z') {
                    System.out.println(letter + " is uppercase");
                }else if (letter >= 'a' && letter <= 'z') {
                    System.out.println(letter + " is a lowercase letter");
                }else{
                    System.out.println("Not a valid letter");

                }
                }
            }
        }
    }

