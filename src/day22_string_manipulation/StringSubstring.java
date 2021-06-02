package day22_string_manipulation;

public class StringSubstring {
    public static void main(String[] args) {
        String word = "java is fun";
        /**
         * 1) word.substring(startIndex, endIndex)
         *
         */
        System.out.println(word.substring(0,4));
        System.out.println(word.substring(0,7));
        System.out.println(word.substring(5,7));
        //print is
        System.out.println(word.substring(8,11));
        //print fun

        /**
         * 2) substring(startIndex) - it will read from start until end
         * java is fun
         */

        System.out.println(word.substring(8));
        //print is fun just providing one number. Start from 8 it should provide the rest. The end result = fun
        System.out.println(word.substring(5));


    }
}
