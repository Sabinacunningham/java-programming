package day15_logicalANDOperator;

public class JobOfferSelector {
    public static void main(String[] args) {
        String location = "Utah";
        double salary = 120_000.0;
        boolean isRemote= true;
        boolean hasBenefits = true;

        if (location.equals("Utah") && salary >= 120_000.0 && isRemote && hasBenefits ) {
            System.out.println("Sure, I will take this offer!");
        }else{
            System.out.println("Lets consider another offer or negotiate ");

        }








    }
}
