package day22_string_manipulation;

public class ChainingStringMethods {
    public static void main(String[] args) {
        String word = "woo den spo on";

        System.out.println(word.toUpperCase().toLowerCase().length());

        System.out.println(word.replace(" ", "").toUpperCase());

        //selenium.findElement(By.id("hi")).click();

        String city = "kabuL";
        //read 1st letter.makeUcase  +   read 2nd till last.make lowercase
        System.out.println(city.substring(0,1).toUpperCase()+city.substring(1).toLowerCase());
        String capitalized = city.substring(0,1).toUpperCase()+city.substring(1).toLowerCase();
        System.out.println("capitalized = " + capitalized);

        //.isEmpty().toUpperCase() Does not work since isEmpty is boolean

        int i = 1;

        if(i<= 5) {
            System.out.println(i);
        }
    }
}
