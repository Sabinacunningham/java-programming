package TeamPractice;

public class Task {

    /*
    String one = abcString
    two = defgOutput: adbecfgh
     */

    public static void main(String[] args) {
        System.out.println(mergedStrings("abcd", "efgh"));

    }
    public static String mergedStrings (String one, String two) {
//        int big = 0;
        String merged = "";
//        if(one.length()>two.length()) {
//            big = one.length();
//        }else{
//            big = two.length();
//        }

        for (int i =0; i < one.length() || i<two.length(); i++) {
            if(i<one.length()){
                merged += one.charAt(i);

            }
            if (i<two.length()) {
                merged+= two.charAt(i);

            }
        }

        return merged;
    }

}
