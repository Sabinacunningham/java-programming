package day44_custom_classes;

/**
 * This class is
 */
public class MyApps {
    public static void main(String[] args) {
        //String app1 = "uber"; this is string object. Just characters
        App uberApp = new App(); //creating new object
        //opening Uber app - version = 3.5
        uberApp.name = "Uber";
        uberApp.version = 3.5; //double no need quotes
        uberApp.open(); //call open method using object variable

        uberApp.version=4.0;
        uberApp.open();// open new version

        /**
         * create more objects and practice more!
         */


    }
}
