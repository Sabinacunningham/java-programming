package day26_loops;

public class WeekDays {
    public static void main(String[] args) {
for (int day =1; day <=10; day++) {
    if (day ==1){
        switch (day) {
            case 1:
            System.out.println(day + " Monday");
            break;
            case 2:
                System.out.println(day + "Tuesday");
                break;
            case 3:
                System.out.println(day + "Wednesday");
                break;
            case 4:
                System.out.println(day + "Thursday");
                break;
            case 5:
                System.out.println(day + "Friday");
                break;
            case 6:
                System.out.println(day + "Saturday");
                break;
            case 7:
                System.out.println(day + "Sunday");
                break;
            default:
                System.out.println(day + " - no such day it is java day");


        }

    }
}



    }
}


