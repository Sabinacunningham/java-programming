package day35_methods_with_param;
import java.util.*;
public class MultipleParameters {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter 2 doubles:");
        double d1 = scan.nextDouble(); //Scanner uses variables
        double d2 = scan.nextDouble();
        showSum(d1, d2);


        showSum(10.45, 55.10); //type numbers here, they want FOOD. Asking for double
    }

    public static void showSum(double num1, double num2) {
        double sum = num1 + num2; //have to do this first and then print
        System.out.println("The sum = " + sum);
    }
}



