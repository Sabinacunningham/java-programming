package day15_logicalANDOperator;

public class CitySelector {
    public static void main(String[] args) {
        String city = "Moscow";
        //Moscow or Tampa
        if(city.equals("Moscow") || city.equals("Tampa")) {
            System.out.println("willing to relocate to" + city);
        }else{
            System.out.println("Not considering - " + city);

        }
        String teacher = "Nadir";
        //Saim, Murodil -> looks like it is a java class with Saim
        //otherwise -> Soft skill it is not java class - Nadir

        if(teacher.equals("Saim") || teacher.equals("Murodil")) {
            System.out.println("It is a java class" + teacher);
        }else{
            System.out.println("Soft skill class with " + teacher);

        }

        if (teacher.equals("Saim") || teacher.equals("Murodil")) {
            System.out.println("java class with " + teacher);
        }else if (teacher.equals("Nadir")) {
            System.out.println("Soft skill class with " + teacher);
        }else {
            System.out.println("Some class with " + teacher);

            //company - "Google" OR salary >= 100k -> accept offer

            String company = "NadirTech";
            double salary = 105_000.0;

            if (company.equals("Google") || salary >= 100_000.0 ) {
                System.out.println("Accepting offer from " + company);
            }else{
                System.out.println("Rejecting offer from " + company);

            }



        }




    }
}
