package day24_loops;

public class WhileLoopReverse {
    public static void main(String[] args) {
        int count = 5;
        while (count >= 0) {
            count--;
            System.out.println("count = " + count);
        }
        System.out.println("Finished the count");

        int undreadSMS = 10;

        /**
         * Read each message 1 by 1 until you have 0 unread sms
         *
         */
        int unreadSMS = 10;
            System.out.println("I have total " + unreadSMS + " unread sms");
            while(unreadSMS >=0) {
                System.out.println("Reading SMS = " + unreadSMS);
                --unreadSMS;
        }
        System.out.println("No More unread SMS messages");


    }
}
