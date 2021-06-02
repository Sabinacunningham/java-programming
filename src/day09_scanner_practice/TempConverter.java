package day09_scanner_practice;

import java.util.Scanner;


public class TempConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("#########Fahrenheit to Celsius#######");
        System.out.println("Enter Fahrenheit value:");
        double fahrenheitValue = input.nextDouble();
        double celsiusValue = (fahrenheitValue - 32) * 5/9;
        System.out.println(fahrenheitValue + "F is in C: " + celsiusValue);





    }
}
