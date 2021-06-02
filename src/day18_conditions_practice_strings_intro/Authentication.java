package day18_conditions_practice_strings_intro;

public class Authentication {
    public static void main(String[] args) {
       int expLast4SSN = 1234;
       int expPinCode = 4321;

       int last4SSn = 4444;
       int pinCode = 4321;

       if (last4SSn == expLast4SSN &&  pinCode == expPinCode) {
           System.out.println("Authentication successful");
       }else {
           System.out.println("Authentication unsuccessful");
           if(last4SSn != expPinCode) {
               System.out.println("Last 4 SSN number is incorrect ");
               if(last4SSn != expLast4SSN) {
                   System.out.println("Last 4 SSN number is incorrect");
               }
               if (expPinCode != pinCode) {
                   System.out.println("Pin Code is incorrect");
               }
           }
       }

    }
}
