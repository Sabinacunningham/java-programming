package day45_oop;

public class TrafficLightObjects {
    public static void main(String[] args) {
        //create traffic light object
        TrafficLight trafficLight = new TrafficLight();
        //trafficLight.color = "red"; NOT THIS WAY today
        //we will assign/update the value of color using a method of the class
        trafficLight.changeColor("red");
        //System.out.println(traffic.Light.color); DIRECT access to variable. Not recommended
        //call method to access the variable:
        trafficLight.showColor();

        trafficLight.changeColor("green");
        trafficLight.showColor();

        TrafficLight trafficLight2= new TrafficLight();
        trafficLight2.color = ("blue");
        trafficLight2.showColor();

    }
}
