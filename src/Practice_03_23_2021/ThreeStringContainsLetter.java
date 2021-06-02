package Practice_03_23_2021;

public class ThreeStringContainsLetter {
    public static void main(String[] args) {
        String wordOne = "java";
        String wordTwo = "mouse";
        String wordThree = "computer";
        String biggestWordWithWithA = "";

        if (wordOne.contains("a") && wordOne.length() > biggestWordWithWithA.length()) {
            biggestWordWithWithA = wordOne;
        }


        if (wordTwo.contains("a") && wordTwo.length() > biggestWordWithWithA.length()) {
            biggestWordWithWithA = wordOne;
        }


        if (wordThree.contains("a") && wordThree.length() > biggestWordWithWithA.length()) {
            biggestWordWithWithA = wordOne;
        }
    }
}