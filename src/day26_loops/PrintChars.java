package day26_loops;

public class PrintChars {
    public static void main(String[] args) {
        String word="automation";

        for (int i = 0; i < word.length(); i++) {
            System.out.println(i+ " - " +word.charAt(i)); //i will be changing in the loop (dynamic)
        }//why starting with 0 not one? i to represent the index
        for (int i =word.length()-1; i >=0 ; i--) {
            System.out.print( word.charAt(i) );
        }



        }
    }

