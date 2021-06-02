package day19_class_vs_object_strings;

public class StringStartsWithEndsWith {
    public static void main(String[] args) {
        String word = "Apples";
        System.out.println(word.endsWith("app"));
        System.out.println(word.endsWith("les"));
        System.out.println(word.endsWith("pl"));
        System.out.println(word.endsWith("A"));
        System.out.println(word.endsWith("ES"));

        String word1 = "intellij idea";
        System.out.println(word1.startsWith("i"));
        System.out.println(word1.startsWith("in"));
        System.out.println(word1.startsWith("intellij"));
        System.out.println(word1.startsWith("intellij idea"));
        System.out.println("java".startsWith("j"));

        System.out.println(word.startsWith("Int")); //false because it is case sensitive

        System.out.println(word.endsWith("idea"));

        String firstName = "Mr. Nadir";
        if (firstName.startsWith("Mr.")) {
            System.out.println(firstName.startsWith("Man"));
        } else if (firstName.startsWith("Dr.")) {
            System.out.println("Doctor");
        } else if (firstName.startsWith("Mrs.")) {
            System.out.println("Married woman");
        } else if (firstName.startsWith("Ms.")) {
            System.out.println("Unmarried woman");
        } else if (firstName.startsWith("sr.")) {
            System.out.println("Senior");
        } else {
            System.out.println("Normal name");
        }

        String url = "sabina.com";
        if (url.endsWith(".com")) ;
        {
            System.out.println("Commercial website");

        
            
        }

        
    }
    
            
    
            
            
            
    {
    
}
}
        
        
        
    
    
    
    
    



    
    


