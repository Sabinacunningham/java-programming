package repl;

import java.util.Scanner;

public class FindUser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //WRITE YOUR CODE HERE
        System.out.println("Enter full name:");
        String userName1 = scan.next();
        String userName2 = scan.next();
        if (userName1.equalsIgnoreCase (userName1)) {
            System.out.println("User found");
        }else{
            System.out.println("User not found!");
        }





    }
}
