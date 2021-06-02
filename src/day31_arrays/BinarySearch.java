package day31_arrays;

import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {23, 123, 654, 2344, 12345, 14421};
        System.out.println(Arrays.binarySearch(nums, 23)); //give me the index = 0
        System.out.println(Arrays.binarySearch(nums, 2344)); //index = 3
        System.out.println(Arrays.binarySearch(nums, 25)); //index = -2
        System.out.println(Arrays.binarySearch(nums, 120)); //index = -2
        System.out.println(Arrays.binarySearch(nums, 700)); //-5
        System.out.println(Arrays.binarySearch(nums, -5)); //0

        if(Arrays.binarySearch(nums, 12345) >= 0) {
            System.out.println("12345 is present in array");
        } else {
            System.out.println("12345 is not present");
        }
    }
}

        //check if number 12345 is among numbers in array



