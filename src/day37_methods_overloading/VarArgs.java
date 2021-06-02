package day37_methods_overloading;

public class VarArgs { //varargs
    public static void main(String[] args) {
        addNumbers(10, 5);
        addNumbers(100, 200, 300);
        addNumbers(23,45,54,45, 67,7,6,6,54,45,86,97);
        addNumbers();
//int... myNumber = 10, 4; ERROR, var-args can ONLY be used as a method parameter
    }

    public static void addNumbers(int... nums) {
        //inside the method, it is used as regular array
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        System.out.println("sum = " + sum);

    }

}

