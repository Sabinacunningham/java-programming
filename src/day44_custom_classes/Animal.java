package day44_custom_classes;

public class Animal {
    String type = "some animal"; //tiger

    public void eat() { //behaviour
        System.out.println("eating");
    }

    public void eat(String food) {
        System.out.println("eating " + food);
    }

    public void speak() {
        System.out.println("speaking ");
    }

    }

