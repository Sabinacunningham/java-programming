package day44_custom_classes;

/**
 * App class is used as a template for App objects.
 * We are describing app properties and behavior here. Objects will be able to use them
 */
public class App {
    String name; //null by default
    double version;// 0.0 by default //data
    //Open method is using name and version variables

    public void open() { //behaviour
        System.out.println("opening " + name +" app - version = " + version);

        }
}

