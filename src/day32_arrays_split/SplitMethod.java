package day32_arrays_split;
import java.util.Arrays;

public class SplitMethod {
    public static void main(String[] args) {
        //               0     1      2       3
        String words = "java,python,selenium,html";
        String[] wordsArray= words.split(",");
        System.out.println(Arrays.toString(wordsArray));
        System.out.println("length of array = " +wordsArray.length);

        for(String each : wordsArray ) {
            System.out.println(each);
        }



        String sentence = "today I am coding java arrays";
        String[] wordsInSentence = sentence.split(" ");
        System.out.println("first word: " + wordsInSentence[0]); //prints out just one word!!!!
        System.out.println("first words: " + sentence.split(" ")[0]);
        System.out.println("Number of words in sentence = " + wordsInSentence.length); //INTERVIEW QUESTION REMEMBER

        for (String each : wordsInSentence) {
            System.out.println(each);


        }



    }
}
