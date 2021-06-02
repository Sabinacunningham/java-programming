package day21_string_manipulation;

public class ReplacePractice {
    public static void main(String[] args) {
        String word = "github";
        System.out.println(word.toUpperCase());
        System.out.println(word.replace("hub", "lab"));
        System.out.println("word = " + word);
        
        word = word.replace("hub", "lab");
        System.out.println("word = " + word);

        //gitlab
        //i->o  a->i -> gotlib
        System.out.println(word.replace('i', 'o').replace('a', 'i'));

        String sentence = "java is fun";
        String withNoSpaces = sentence.replace(" ","");
        System.out.println("withNoSpaces = " + withNoSpaces);
        //"java" -> "selenium" , "fun" -> "a lot of fun" -> assign back to withSpaces
        sentence = sentence.replace ("java", "selenium").replace("fun", "a lot of fun"); //chaining like a train(metro)
        sentence = sentence.replace("java", "selenium");
        sentence = sentence.replace("fun", "a lot of fun"); //these are the same things, we can choose to run it in a long line or two separate lines.

        System.out.println("sentence = " + sentence);

        String result = "1-48 of over 345 results for java book";
        result = result.replace("1-48 of over", "").replace(",","").replace("results for java book","");
        System.out.println("result = " + result);

        int count = Integer.parseInt(result);
        count++;
        if(count >0) {
            System.out.println("Search success");
        }


    }
}

