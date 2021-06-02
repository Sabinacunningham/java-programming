package day16_switch_ternary;

public class ApartmentLease {
    public static void main(String[] args) {
        System.out.println("Welcome to Adair Apartments");
     int numberOfBedrooms = 0;
     double startingPrice = 0;

     switch(numberOfBedrooms) {
         default:
             System.out.println( numberOfBedrooms + "bedroom currently unavailable ");
             //return; exit MAIN method
         case 0:
             System.out.println("Studio apartment selected");
             startingPrice = 1454.0;
             break;
         case 1:
             System.out.println("One bedroom apartment selected" );
             startingPrice = 1725;
             break;
         case 2:
             System.out.println("Two bedroom apartment selected");
             startingPrice = 2899;
             break;

     }
        System.out.println("starting Price = " + startingPrice);

       








    }
}
