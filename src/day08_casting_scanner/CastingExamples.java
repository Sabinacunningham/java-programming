package day08_casting_scanner;

public class CastingExamples {                   //Casting is when you want to convert from one datatype to another datatype
    //ex: from chart to int.
    public static void main(String[] args) {
        //byte - short - int - long
        byte num1 = 100;
        short num2 = num1; //implicit casting when we don't need paranthesis
        int num3 = num1; //Big box into a small box.
        int num4 = 1000;
        long num5 = num4;
        //float - double
        float num6 = 124.4F;
        double num7 = num6;

        int num8 = 3456;
        double num9 = num8;
        System.out.println();
        System.out.println("num9 = " + num9); //3456.0

        System.out.println("===========");

        int num10 = 22;
        byte num11 = (byte) num10;
        short num12 = (short) num10; //cast/convert to smaller short
        System.out.println("num12 = " + num12);
        System.out.println("num12 = " + num11);
        System.out.println("num12 = " + num10);

       double num13 = 55.3;
       float num14 = (float) num13;

        System.out.println("num13 = " + num13);
        System.out.println("num14 = " + num14);

        double num15 = 1234.5;
        int num16 = (int) num15;

        System.out.println("num15 = " + num15);
        System.out.println("num16 = " + num16);

        int num17 = 300;
        byte num18 = (byte)num17;
        System.out.println("num17 = " + num17);
        System.out.println("num18 = " + num18);

        char letter = 'S';
        int numLetter = letter;
        System.out.println("numLetter = " + letter);
        System.out.println("numLetter = " + numLetter); //83



















    }
}
