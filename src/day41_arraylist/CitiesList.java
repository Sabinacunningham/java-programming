package day41_arraylist;


import java.util.ArrayList;

public class CitiesList {
    public static void main(String[] args) {
        //declare arraylist. alt/option + enter
        ArrayList<String> cities = new ArrayList<>();
        //add cities to arraylist -> add methods
        cities.add("Washington DC"); //0
        cities.add("New York"); //1
        cities.add("Vienna"); //2
        cities.add("Adana"); //3
        cities.add("LA"); //4
        //add Ashgabat to 0 index
        cities.add(0, "Ashgabat");
        //print all values in same line
        System.out.println(cities);
        //print first and last city
        System.out.println("first city = " + cities.get(0));
        System.out.println("last city = " + cities.get(5));
        //find last index using size()-1
        System.out.println("last city = " + cities.get(cities.size()-1));

        //print count of items in arraylist
        System.out.println("coung of items = " + cities.size());

        int size = cities.size();
        System.out.println("there are" + size + " cities in the list");

        //for loop and print all values in same line
        for(int i =0; i < cities.size(); i++) {
            System.out.print(cities.get(i)+ " ");
            //how to print half of the cities, not all of them. size()/2 use simple math and your brains
        }
        System.out.println();
        //for each loop collection with array list, put two dots!
        for(String city : cities) {
            System.out.println(city + " ");
        }

        //delete item from arraylist
        //1) remove using index
        cities.remove(3);
        //2)remove using object/value
        cities.remove("New York");

        System.out.println("after remove = " + cities);

        //delete/remove all values from list
        cities.clear();

        //make sure it is clear
        //1) print| spit it out
        System.out.println("cities = " + cities);

        //2) using isEmpty
        if (cities.isEmpty()) {
            System.out.println("list is empty");
        }

        //3) check size()==0;
        if(cities.size() ==0) {
            System.out.println("list is empty");
        }






    }
}
