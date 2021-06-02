package day12_conditional_statements;

import java.util.Scanner;

public class AmazonFreeShipping {
    public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
      System.out.println("Enter your order total price:");
      double totalPrice = scan.nextDouble();

      if (totalPrice >= 25){
          System.out.println("Free shipping eligible.. Your order is " + totalPrice);
        }
        else{ System.out.println("NOT ELIGIBLE for free shipping. Your order total is " + totalPrice + " which is less than minimum of $25");
        }
        System.out.println("THANK YOU FOR SHOPPING WITH AMAZON");

    }
}
