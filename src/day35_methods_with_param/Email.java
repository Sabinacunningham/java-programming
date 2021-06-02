package day35_methods_with_param;

public class Email {
    public static void main(String[] args) {
        buildEmail("Nadir", "FannieMae" ); //write down here what you want to print out as an email
        buildEmail("Sabina", "theCool");
        buildEmail("John_Ward_III", "verizon");//change the code

    }
    public static void buildEmail(String name, String domain) {
        name = name.replace(" ", "_").toLowerCase();//changing the code to lowercase for John Ward
        domain = domain.toLowerCase();
        String email = name + "@" + domain + ".com"; //assign the variable right away
        System.out.println(email);
        
    }

    
}
