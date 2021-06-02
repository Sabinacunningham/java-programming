package day37_methods_overloading;

import java.util.Arrays;

public class OverloadMain {
    public static void main(String[] args) {
        System.out.println("Hello From Real main method");
        main(10);

    }

    /**
     * overloading main method:
     same name + different parameter
     JDK is Java does not look for this one to run
     */
    public static void main(int num) {
        System.out.println("num = " + num);
        
    }

}
