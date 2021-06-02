package day18_conditions_practice_strings_intro;

public class SwitchSeasonFinder {
    public static void main(String[] args) {
        int month = 8;

        if (month == 12 || month ==1 || month ==2) {
            System.out.println("Winter" );
        }
        switch(month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
        }
         switch (month){
             case 3:
             case 4:
             case 5:
                 System.out.println("spring");
                 break;
         }
        switch (month) {
            case 6:
            case 7:
            case 8:
                System.out.println("summer");
                break;
            case 9: case 10: case 11:
                System.out.println("fall");
                break;
            default:
                System.out.println("invalid month - " + month);

        }
        }



    }

