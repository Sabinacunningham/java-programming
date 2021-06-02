package today;
import java.util.*;

class Main {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number1:");
        int num1 = scan.nextInt();
        System.out.println("Enter number2:");
        int num2 = scan.nextInt();

        //WRITE YOUR CODE HERE:
        int result = (-num1>num2) ? num2: num1;
        System.out.println(result);
        int result2 = (num1<num2) ? num2: num1;
        System.out.println(num1);





    }
}



