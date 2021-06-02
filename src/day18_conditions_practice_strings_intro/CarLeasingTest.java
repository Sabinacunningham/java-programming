package day18_conditions_practice_strings_intro;

public class CarLeasingTest {
    public static void main(String[] args) {
        String make = "Mercedes";
        String model = "A";
        double leasePrice = 0.0;

        if (make.equals("Mercedes") && model.equals("E")) {
            leasePrice = 500.0;
        } else if (make.equals("Mercedes") && model.equals("A")) {
            leasePrice = 400.0;
        }



         if (make.equals("Mercedes")) {
             if (model.equals("E")) {
                 leasePrice = 500.0;
             }else if (model.equals("A")){
                 leasePrice = 400;
             }
         }
        System.out.println("make  =  " + make);
        System.out.println("model = " + model);
        System.out.println("lease Price = " + leasePrice);

        if (make.equals("Audi")) {
            if (model.equals("SQ5")) {
                leasePrice = 432;
            }else if (model.equals("A3")){
                leasePrice = 567;
                System.out.println("make  =  " + make);
                System.out.println("model = " + model);
                System.out.println("lease Price = " + leasePrice);

            }
        }

    }
}
