package day32_arrays_split;

public class ReverseSentence {
    public static void main(String[] args) {
        String sentence = "today is java";
        String[] words = sentence.split(" ");
        String reversed = "";
        //print words array in revers order
        for(int i = words.length - 1; i >=0; i--) {
            //System.out.print(words[i] + " ");
            reversed += words[i] + " ";
        }
        System.out.println("sentence = " + sentence);
        System.out.println("reversed = " + reversed.trim());
    }
}
