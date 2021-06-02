package day15_logicalANDOperator;

public class NotLogicalOperator {
    public static void main(String[] args) {
        System.out.println("!true = " + (!true));
        System.out.println("!false = " + (!false));

        int age = 20;
        //check if age IS NOT more than 5. print out "Need to sit in child car seat"

        if (!(age > 7)) {

        System.out.println("needs to be in child car seat. Age = " + age);
    } else {
        System.out.println("can sit normal seat. age = " + age );

    }
boolean isSmokingAllowed = true;

        //if smoking is not allowed: print :Smoking is not allowed here. Exit."
        if (!isSmokingAllowed) {
            System.out.println("Smoking is not allowed here. Exit");
        }
boolean isAffordable = true;

        if (!isAffordable) {
            System.out.println("Item Not affordable");
        }
        String env = "qa";
        if (!env.equals("qa")) {
            System.out.println("In wrong environment for QA testing");

        }

        String carModel = "Tesla";
        if (!carModel.equals("Tesla")) {
            System.out.println("Not interested" );
        }

        String secretPassword = "abc123";
        String inputPassword = "abc321";
        //if inputPassword IS NOT equals inputPassword: print "Incorrect Password"

        if(!inputPassword.equals("abc123")) {
            System.out.println("Incorrect password");
        }
        if (!inputPassword.equals("secretPassword")) {
            System.out.println("Incorrect password");
        }

        if (inputPassword.equals("abc123")) {
            System.out.println("Correct Password");
        }else {
            System.out.println("Incorrect password");
        }

    }
}

