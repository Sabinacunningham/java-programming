package day39_wrapper_classes;
//to be able to convert
public class AutoboxingUnBoxing {
    public static void main(String[] args) {
        //auto-boxing
        int num1 = 500;
        Integer num2 = num1;
        Integer num3 = 234;

        //Un-boxing: object > primitive
        Double d1 = new Double(100.5);
        double d2 = d1;
        double d3 = new Double(345.3);

    }
}
