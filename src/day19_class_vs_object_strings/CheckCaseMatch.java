package day19_class_vs_object_strings;

public class CheckCaseMatch {
    public static void main(String[] args) {
        String countryCode = "KG";
        //"usa"                             "USA"
        if (countryCode.equals(countryCode.toUpperCase() )) {
            System.out.println("Pass - case is correct ");
        }else{
            System.out.println("Fail - case in incorrect");

            String word = "Java";
            String uWord = word.toUpperCase();

            System.out.println(word); //Java
            System.out.println(uWord); //JAVA

            if(word.equals(uWord)) {
                System.out.println("case match");
            }else{
                System.out.println("case mismatch");
            }
        }

    }
}
