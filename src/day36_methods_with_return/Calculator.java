package day36_methods_with_return;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(add(5.2 , 20.0));
        double result = add(1, 3);
        System.out.println("result = " + result);
        System.out.println("100 + 200 = " + add(100, 200));

        System.out.println(minus(10,3)); //7

        System.out.println(multiply(2,10)); //20

        System.out.println(divide(16,4)); //4
    }
     //everybody can see it   return the value
    public static double add(double num1, double num2){ //going to return us DOUBLE TYPE. DECIMAL VALUE NUMBER
        double result = num1+num2;
        return result; //return num1+num2;
    }
    public static double minus(double num1, double num2) {
        double result = num1-num2;
        return result;

    }
    public static double multiply(double num1, double num2) {
        double result = num1*num2;
        return result;
    }

    public static double divide(double num1, double num2) {
        double result = num1/num2;
        return result;
    }

}
