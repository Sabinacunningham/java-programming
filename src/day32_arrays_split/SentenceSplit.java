package day32_arrays_split;

import javax.lang.model.SourceVersion;

public class SentenceSplit {
    public static void main(String[] args) {
        String sentence = "java is fun";
        String [] words = sentence.split(" ");
        System.out.println("1 st word = " + words[0]);
        System.out.println("2 nd word = " + words[1]);
        System.out.println("3 rd word = " + words[2]);
        //System.out.println("4th word = " words[4]); //OUTOFBOUNDEXCEPTION
        for (String w: words) {
            System.out.println(w);

        }
        String googleResult = "About 1,810,000 results (0.68 seconds)";
        String [] results = googleResult.split(" ");
        System.out.println("Count = " + results[1]);
        System.out.println("Seconds = " + results [3].replace("(", ""));
        System.out.println("Seconds = " + results [3].substring(1));

        }

    }

