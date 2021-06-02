package day28_loops;
import java.util.*;
public class RandomPassword {
    public static void main(String[] args) {
        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_!@#$%^&*";
        Random random = new Random();
        //helps generate random number
        String password = "";
        for (int i = 1; i<=8; i++) {
            int index = random.nextInt(71); //random num 0 -70 characters from string
            System.out.print(source.charAt(index));
            password += source.charAt(index);

//add the char to password variable using +=
        }
        System.out.println("\nYour password = " + password);


    }
}
