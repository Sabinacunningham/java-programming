package day35_methods_with_param;

public class MethodsWithInputsOrParameters {
    public static void main(String[] args) {
        displayValue(1); //put number in here for the int (any number)
        displayValue(2);
        displayValue(343);
        displayValue(2+2);
        int count = 55;
        displayValue(count);

        greetByName("Saim");
        greetByName("100");
        greetByName("Nadir");
        String name = "Suleyman";
        greetByName("Suleyman");
    }
    public static void displayValue (int num) {
        System.out.println("The value is " + num);
        
    }
    public static void greetByName(String name) {  //greetByName("Saim");
        System.out.println("Hello "+ name+" , how are you today?");

    }
}
