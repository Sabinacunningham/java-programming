package day20_string_manipulation;

public class StringIsEmpty {
    public static void main(String[] args) {
        String jobTitle = "";
        System.out.println(jobTitle.isEmpty());
        System.out.println(jobTitle.length());
        System.out.println(jobTitle.length() == 0);
        System.out.println(jobTitle.equalsIgnoreCase(""));

        if (jobTitle.isEmpty()) {
            System.out.println("Job Title is missing, please resend");
        }else {
            System.out.println("Job title looks good");
        }
        if(jobTitle.length() ==0) {
            System.out.println("jobTitle is empty");
        }else{
            System.out.println("job title is not empty");
        }

        System.out.println(jobTitle.equals(""));

        if("".equals(jobTitle)) {
            System.out.println("job title is not empty");

        }
        String word = " ";
        System.out.println(word.isEmpty());//false
        System.out.println(word.length());// blank space is a character

        String veggie = "carrots";
        System.out.println(veggie.isEmpty());//false because there are characters
        //if veggie IS NOT EMPTY
        if(!veggie.isEmpty()) {
            System.out.println("we have " + veggie);
        }

        String word2;
       // System.out.println(word2.isEmpty()); ERROR. Not initialized, we didn't declare the word.





    }
}
