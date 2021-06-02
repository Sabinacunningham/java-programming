package day17_ternary_nested_conditions;

public class TernaryExamples {
    public static void main(String[] args) {
        int score = 90;
        String result = (score>60) ? "pass" : "fail";
        System.out.println("result = " + result);

        //WITH TERNARY:
        String quality = "good";
        System.out.println(quality.equals("good") ? 100: 0);
        int rating = (quality.equals("good")) ? 100 : 0;
        System.out.println("rating = " + rating);

        int score3 = 100;
        char grade =(score3 > 90) ? 'A' : 'B';
        System.out.println("grade = " + grade);
//        if (score > 90 ) {
//            grade = 'A';
//        }else{
//            grade = 'B';
//        }





    }
}
