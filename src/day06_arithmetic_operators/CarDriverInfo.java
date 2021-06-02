package day06_arithmetic_operators;

public class CarDriverInfo {
    public static void main (String []  args) {
        //    String carModel;
        //  carModel = "BMW x5"
        String carModel = "Jeep Wrangler";
        String driverName = "Batman";
        String licenseNumber = "LetsMakeJavaGreatAgain12345";
        short speed = 55;
        boolean isAutomatic = true;
        char licenseClass = 'D';

        System.out.println("Car Model : " + carModel);
        //Dodge charger is car model.
        System.out.println(carModel + " is car model." );
        System.out.println("Driver Name: " + driverName);
        System.out.println(driverName + " is driving a car");
        System.out.println(driverName + " is driving "+ carModel);

        System.out.println("Current speed is: "+ speed + " mph");

        System.out.println("is car automatic -> "+isAutomatic);
        System.out.println(licenseClass +" "+ isAutomatic);
        System.out.println(licenseClass + " - "+ isAutomatic);






    }
}