package day22_string_manipulation;

public class IndexOfExample {
    public static void main(String[] args) {
        String technologies = "java, html, css, selenium, testng, maven, cucumber";
        //first comma
        System.out.println(technologies.indexOf(",")); // result is 4
        //last comma
        System.out.println(technologies.lastIndexOf(",")); //40
        //for middle one, we need to loop
        int indexOfJava = technologies.indexOf("java");
        System.out.println("java is at index" + indexOfJava);

        int indexOfCss = technologies.indexOf("css");
        System.out.println("css is at index " + indexOfCss);

        int indexOfSelenium = technologies.indexOf("selenium");
        System.out.println("selenium is at index " + indexOfSelenium);

        int indexOfTestng = technologies.indexOf("testng");
        System.out.println("testng is at index " + indexOfTestng);

        int indexOfCucumber = technologies.indexOf("cucumber");
        System.out.println("cucmber is at index " + indexOfCucumber);

        int indexOfSql = technologies.indexOf("sql"); // not present -1
        System.out.println("sql is at index " + indexOfSql);

        //technologies contains "maven"?
        if(technologies.contains("maven")) {
            System.out.println("maven is present");
        }else{
            System.out.println("maven is not present");
        }

        if(technologies.indexOf("maven") > -1) {
            System.out.println("indexOfSql = " + indexOfSql);
            System.out.println("maven is present");
        }else{
            System.out.println("maven is not present");
        }


    }
}
