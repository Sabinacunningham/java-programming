package day36_methods_with_return;
import java.util.*;

public class Info {
    public static void main(String[] args) {
        fullName(); //"Mike Smith" next line HAVE TO PRINT OUT IF YOU WANT SOMETHING TO ACTUALLY PRINT OUT
        System.out.println("Full name = " + fullName());
        isMarried();
        System.out.println("Is he married = " + isMarried());
        getAge();
        System.out.println("Age = " + getAge());
        System.out.println("Birth year =" + getRandomYear()); //dynamic. different year each time
        
        String name = fullName();
        boolean married = isMarried();
        int age = getAge();
        int year = getRandomYear();

        System.out.println("name = " + name);
        System.out.println("married = " + married);
        System.out.println("age = " + age);
        System.out.println("year = " + year);

        if(isMarried()){
            System.out.println("married");
        }else{
            System.out.println("single");
        }

        String word = "java";
        System.out.println(word.charAt(1)); //=> a - returns a
        

    }

    public static String fullName() { //write STRING instead of void and double quotes for String
        return "Mike Smith";
    }

    public static boolean isMarried() { //write BOOLEAN instead of void and true or false
        return false;
    }

    public static int getAge() { //write INT instead of void and number in return
        int age = 35;
        return age; //return 35;
    }

    public static int getRandomYear() {
        Random random = new Random();
        int randomYear = random.nextInt(2021); //why random?? //year from now and 2021; DYNAMIC. different year each time
        return randomYear;


    }
}

