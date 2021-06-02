package day33_arrays;

import java.util.Arrays;

public class ReverseArray1 {
    public static void main(String[] args) {
        //indexes     0  1   2   3
        int[] nums = {5, 10 ,4, 100};
        int[] numsReverse = new int[nums.length]; //{0, 0, 0, 0} very useful, same length
           // i =3, j =0
        for(int i = nums.length -1, j = 0; i >=0; i--, j++) {
            numsReverse[j]= nums[i]; // we are reversing
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(numsReverse));

    }
}
