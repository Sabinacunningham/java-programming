package day22_string_manipulation;

public class FirstLoop {
    public static void main(String[] args) {
        int i = 1; //if the condition is false, it will not print
        while (i <= 25) { //like if statement, but checks 5 times.
            System.out.println(i);
            i++;
        }

        int apples = 0;
        while (apples <= 3) {
            System.out.println("apples ->  "  + apples);
            apples++;
        }
        System.out.println("apples = " + apples);

        //infinite loop
        while(true) { //condition is always true
            System.out.println("Hello World");
        }
    }
}
