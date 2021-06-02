package day15_logicalANDOperator;

public class GradeEvaluator {
    public static void main(String[] args) {
        char grade = 'D';
        if(grade == 'A' || grade == 'a' || grade == 'B' || grade == 'b' || grade=='C'){
            System.out.println("Pass. with grade -  " + grade);
        }else if (grade == 'D' || grade == 'd') {
            System.out.println("Qualify for retake. Grade -  " + grade);
        }else if (grade == 'E' || grade == 'e') {
            System.out.println("Fail. Grade - " + grade);
        }else {
            System.out.println("Invalid grade - " + grade);

        }

    }
}

