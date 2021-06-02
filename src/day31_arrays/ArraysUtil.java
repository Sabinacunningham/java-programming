package day31_arrays;
import java.util.*;
import java.util.Collections;

public class ArraysUtil {
    public static void main(String[] args) {
        int [] nums = {100, 5, 1, 7, 0, -4, 44, 33};
        //printed all nums in same line
        System.out.println(Arrays.toString(nums));

        //sort nums. re-arrange
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        System.out.println("minimum value: " + nums[0]);
        System.out.println("max value: " + nums [nums.length-1]);

        //Arrays.sort(nums,Collections.reverseOrder());

        String [] words = {"java", "C#", "C++", "Kotlin", "Python", "Ruby", "Assembly"};
        System.out.println(Arrays.toString(words));
        System.out.println("["+String.join(", ", words)+ "]");

        //sort words in alphabetic order and ASCII table order

        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

        //sort words reverse
        Arrays.sort(words, Collections.reverseOrder());
        System.out.println(Arrays.toString(words));




    }
}
