package day41_arraylist;

import java.util.ArrayList;
import java.util.List;

public class UpdatingArrayList {
    public static void main(String[] args) {
        //cars list
        List<String> myCars = new ArrayList<>();
        myCars.add("toyota");
        myCars.add("mazda");
        myCars.add("ford");
        myCars.add("moskvich");
        myCars.add("tesla");
        myCars.add(0, "jeep");
        myCars.add(1, "lada");
        myCars.add(2, "yugo");

        //jeep, lada, yugo, toyota, mazda, ford, moskvich, tesla
        System.out.println(myCars.toString());
        String allCarsIn1St = myCars.toString(); //saves all cars in 1 string variable

        System.out.println("allCarsIn1St = " + allCarsIn1St);

        //change index 0 to Lamborghini
        myCars.set(0, "Lamborghini");

        System.out.println("after set = " + myCars.toString()); //internally uses toString

        //change 4 to Honda

        myCars.set(4, "honda");

        System.out.println("After set honda = " + myCars.toString());
        /**
         * How would you do that if myCars was array:
          myCars[4] = "Honda";
         */
        //find the index number of "java"
        /**String str = "java";
        str.indexOf("v") ==> 2
         */
        //find the index number of "ford"
        System.out.println("index of ford = " + myCars.indexOf("ford"));
        int moskvichIndex = myCars.indexOf("moskvich"); //storing not printing out
        System.out.println("moskvichIndex = " + moskvichIndex); //use it in setMethod

        //change moskvich to jiguli

        myCars.set(moskvichIndex, "jiguli");

        System.out.println("after set to jiguli = " + myCars);

        //replace ford with trabant
        //indexOf("ford), "trabant"

        myCars.set(myCars.indexOf("ford"), "trabant");
        System.out.println("after set to trabant = " + myCars);

        //lada - > bugatti
        /*
        if myCars contains "lada"
        find index of lada and set value to bugattii
        else
        print "lada is not found"
         */

        if (myCars.contains("lada")){
            myCars.set(myCars.indexOf("lada"), "bugatti");
        }else{
            System.out.println("lada is not found");
        }

        System.out.println("after set bugatti = " + myCars.toString());

        /**
         lamborghini - > prius | for loop
         lada ->
         trabant - > audi
         */
        for(int i =0; i < myCars.size(); i++) {
            if (myCars.get(i).equalsIgnoreCase("lamborghini")) {
                myCars.set(i, "prius");
                //change to prius
            } else if (myCars.get(i).equals("toyota")) {
                myCars.set(i, "lexus");
        }else if (myCars.get(i).equals("trabant")){
                myCars.set(i, "audi");
            }

        }

        System.out.println("after loop = " + myCars);



    }
}
