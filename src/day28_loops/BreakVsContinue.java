package day28_loops;

public class BreakVsContinue {
    public static void main(String[] args) {
        ///BREAK STATEMENT
        for(int n =1; n <=5; n++ ) {
            System.out.print(n);
            if(n==3) {
                break;

            }
        }
        System.out.println();

        for(int i = 1; i <= 5; i++) {
            if(i ==2 || i ==4) {
                continue;
            }
            System.out.print(i);
        }
String str1 = "java";
        String str2 = new String ("Java");
        if(str1.equalsIgnoreCase(str2)) {
            System.out.println("equals");
        }else{
            System.out.println("not equals");
        }
    }
}
