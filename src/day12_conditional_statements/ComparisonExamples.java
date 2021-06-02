package day12_conditional_statements;

public class ComparisonExamples {
    public static void main(String[] args) {
        int speedLimit = 55;
        int currentSpeed = 4_5;
        System.out.println(currentSpeed > speedLimit); //false 45 NOT MORE 55
        System.out.println(speedLimit < currentSpeed); //55 not less 45
        System.out.println(speedLimit == currentSpeed); //false not equal yo 45

        boolean isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are you speeding? - " + isSpeeding);
        System.out.println("currentSpeed = " + currentSpeed + "mph");
        System.out.println("speedLimit = " + speedLimit + "mph");
        //45 + 20 -> 65
       currentSpeed += 20; //65

        isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are you speeding? - " + isSpeeding);
        System.out.println("currentSpeed = " + currentSpeed + "mph");
        System.out.println("speedLimit = " + speedLimit + "mph");

        double accountBalance = 250.25;
        double itemPrice = 300.99;
        System.out.println("can I afford? - " +(accountBalance >= itemPrice)); //true

        boolean canAfford = accountBalance >= itemPrice;
        System.out.println("can Afford = " + canAfford);

        //decrease balance by itemPrice using shorthand operators

        accountBalance = accountBalance - itemPrice;
        accountBalance-=itemPrice;

        boolean isBroke = accountBalance <=0;
        System.out.println("Am I broke? - " + isBroke);









    }
}
