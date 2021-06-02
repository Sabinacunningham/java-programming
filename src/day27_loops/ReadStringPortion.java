package day27_loops;

public class ReadStringPortion {
    public static void main(String[] args) {

        String list = "cat,car";

        for (int i = 0; i < list.length()-2; i++) {    //-2 will stop early, so that we don't see error in our screen.
            System.out.println(list.substring(i, i+3));
            //if statement, if list.substring(i, i+3) equals "cat" or car print cat or car found

        if(list.substring(i, i +3).equals("cat") || list.substring(i, i+3).equals("car") ) {
            System.out.println("cat or car found");
        }
        }



//        int i = 0;
//        System.out.println(list.substring(i,i+3));//prints out first and last character
//        i++; //value is one
//        System.out.println(list.substring(i,i+3));
//        i++; //value is one
//        System.out.println(list.substring(i,i+3));
//        i++; //value is one
//        System.out.println(list.substring(i,i+3));
//        i++; //value is one
//        System.out.println(list.substring(i,i+3));
//        i++; //value is one

    }
}
