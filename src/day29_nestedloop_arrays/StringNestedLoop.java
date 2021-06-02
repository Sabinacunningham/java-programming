package day29_nestedloop_arrays;

public class StringNestedLoop {
    public static void main(String[] args) {
        String word = "java";
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j <= i; j++) {//
                System.out.print(word.charAt(j));
            }
            System.out.println();
        }
        /**
         java
         jav
         ja
         j
         */


        for (int i = 0; i < word.length(); i++) {
            for (int j = i; j < word.length(); j++) {
                System.out.print(word.charAt(j));
            }

            System.out.println();//new line after inner loop
        }
        for (int outer=0; outer < word.length(); outer++) {
            for (int inner = 0; inner < word.charAt(outer); inner++) {
                if (outer == inner && outer !=inner ) {
                    System.out.println(outer + ":" + inner);
                }

                System.out.println();
            }
        }
    }
}



