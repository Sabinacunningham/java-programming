package day26_loops;

public class CountMatches {
    public static void main(String[] args) {
        String word = "java";
        char letter = 'a';
        int count = 0;
        //for loop: read each character(charAt(i)) and test if it matches letter. if true:
        //add 1 to count
        //outside:
        //print the count

        for(int i =0; i <word.length(); i++) {
            if(word.charAt(i)==letter) {
                count++; //number of same letters
            }


        }
        System.out.println("There are " + count + " " + letter + "'s in " + word);
    }
}
