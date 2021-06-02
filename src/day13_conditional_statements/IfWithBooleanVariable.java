package day13_conditional_statements;

public class IfWithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry = true;
        if (isHungry ==true)  {
        } else {
            System.out.println(isHungry + " I am hungry I will go get something to eat");
            System.out.println("Then code java!");
        }  {
            System.out.println("I am not hungry, I will keep coding java!");

            double price = 130.44;
            double balance =200;
            boolean isAffordable = price  <=200;
            if(isAffordable) {
                System.out.println("You can afford to to buy this item.");
            } else {
                System.out.println("You can't afford to buy this item.");
                System.out.println("isAffordable = " + isAffordable);
                if (isAffordable) {
                    System.out.println("I can afford it, lets buy!");
                }else{
                    System.out.println("Too expensive, lets keep coding java");

                }
                boolean isRemoteJob = true;
                //if it is NOT remoteJob print "Sorry I am not interested"
                //otherwise, print "Sure I am interested, what is the interview process?"
                if (!isRemoteJob) {
                    System.out.println("Sorry I am not interested");
                } else {
                    System.out.println("Sure I am interested, what is the interview process?");

                }



            }



            }

        }
    }






