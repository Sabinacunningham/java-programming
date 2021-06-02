package repl;
import java.util.*;


public class nums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

     //   System.out.println("num2 = " + num2);
        if (num1==num2) {
            System.out.println(num1 + " and " + num2 + " are equal");
        }else{
            if (num1>=num2) {
                System.out.println(num1 + " is greater than " + num2);
            }else{
                if (num1<=num2) {
                    System.out.println(num1 + " is less than " + num2);

                }
            }

        }

        

    }
}
