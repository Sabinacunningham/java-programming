package day25_loops;

public class PrintEvenOrOddNumbers {
    public static void main(String[] args) {
        System.out.println("EVEN NUMBER 0 -100: ");
        for(int n =1; n <=100; n++ ) {
            if(n %2 ==0) { //%2 == even numbers
                System.out.print(n + " ");
            }
        }
        System.out.println("\nODD NUMBERS 0 -100: ");
        for(int k = 1; k <=100; k++) {
            if(k %2 !=0) { //%2 != odd numbers
                System.out.print(k + " ");
            }
        }
    }
}
