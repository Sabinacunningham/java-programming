package day21_string_manipulation;

public class StringIndexOf {
    public static void main(String[] args) {
        /**            012345   */
        String word = "github";
        System.out.println(word.indexOf("g")); //0
        System.out.println(word.indexOf("u")); //4
        System.out.println(word.indexOf("hub"));//3
        System.out.println(word.indexOf("java"));// -1 it means it cannot find
        System.out.println(word.indexOf("t"));//2


    }
}
