package day31_arrays;

public class CharArray {
    public static void main(String[] args) {
        char[] letters = {'j', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n'};
        for(char each : letters) {
            System.out.print(each + " ");

        }
        String sentence = new String(letters);
        System.out.println("\nsentence = " + sentence);

        String item = "wooden spoon";
        char [] itemArray = item.toCharArray();
        System.out.println("itemArray.length = " + itemArray.length); //array(it is a variable int count that's why no paranthesis)
        System.out.println("item.length() = " + item.length()); //string

        //indexes  0        1         2        3       4           5
        String[] fruits = {"bananas", "apples", "kiwi", "mango", "papaya", "strawberry"};
        String fruitStr = "";

        for(String each:fruits) {
            System.out.print(each + " - ");
            fruitStr += each + "-";
        }
        System.out.println("\nfruitStr = " + fruitStr);


        String[] languages = {"java", "python", "c++", "sql", "ruby", "javascript"};

        System.out.println(String.join("|", languages));
        System.out.println(String.join("##", languages));
        String joinedLanguages = String.join(" <> ", languages);
        System.out.println("joinedLanguages = " + joinedLanguages);
        System.out.println("joinedLanguages = " + joinedLanguages);




    }
}
