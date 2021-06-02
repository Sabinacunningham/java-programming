package day40_arraylist;

import java.util.*;

public class ArrayListLoop {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(); //common way of declaring ArrayList (polymorphic way)
        System.out.println(nums);
        System.out.println("size = " + nums.size());
        nums.add(34);
        nums.add(44);
        nums.add(3);
        nums.add(88);
        nums.add(500);
        nums.add(5);
        nums.add(845);
        nums.add(0);
        nums.add(500);
        nums.add(5);
        nums.add(845);
        nums.add(0);

        System.out.println("nums=" + nums);

        nums.remove(0);
        System.out.println("nums = " + nums);

        //nums.remove(88); // we do not have 88th index, so it will give us indexoutofboundexception. We have to wrap
        //it first

        nums.remove(new Integer(88)); //removes 88 
        System.out.println("nums = " + nums);

        nums.remove(new Integer(5));
        System.out.println("nums = " + nums);

        //for loop - iterate through all values and print
        for (int i = 0; i < nums.size(); i++) { //size not length. length is for array
            System.out.println(nums.get(i)); //get


        }
        //for each loop, and print all in same line
        for (Integer each : nums) { //for each loop will take of it
            System.out.print(each + " ");
        }


    }
}
