package day19_class_vs_object_strings;

public class StringLength {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word);
        System.out.println(word.length());
        System.out.println("count: " + word.length());
        System.out.println("wooden spoon".length());

        String firstName = "Sabina";
        System.out.println("Sabina".length());
        System.out.println(firstName + "-" + firstName.length());

        int count =firstName.length();
        System.out.println("count = " + count);

        String password = "hello";
        /** IF STATMENT:
         * WHEN password is at least 6 characters:
         * print: valid amazon password
         * ELSE
         * print: password too short
         */

        if (password.length () >= 6) {
            System.out.println("Valid amazon password");
        }else{
            System.out.println("Password must be at least 6 characters");

            String countryCode = "usa";

            if(countryCode.equals(countryCode.toUpperCase())) {

            }


        }
    }
}
