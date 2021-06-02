package day15_logicalANDOperator;

public class AndOperatorPractice {
    public static void main(String[] args) {
        boolean onSale = true;
        boolean freeShipping = false;
        String itemName = "Wooden Spoon";

        if (onSale && freeShipping) {
            System.out.println("Adding to cart - " + itemName);
        }else {
            System.out.println("Continue shopping for good deals on " + itemName );

        if (freeShipping && onSale && itemName.equals("Wooden Spoon")) {
            System.out.println("Add to cart - " + itemName);
        }else {
            System.out.println("Continue shopping for good deals on -" + itemName);

            }
        //location, salary, remote, benefits

            }

        }
    }

