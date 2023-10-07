public class abstractconstructorcalling {
    public static void main(String args[]) {
        Mustang myHorse = new Mustang();
        //Animal -> Horse -> Mustang Constructor Calling sequence
    }
}
abstract class Animal {
    String color;
    Animal() {
        System.out.println("animal constructor called");

    }
    void eat() {
        System.out.println("animal eats");
    }
    abstract void walk();
}

class Horse extends Animal {
    Horse() {
        System.out.println("horse constructor called");

    }
    void changeColor() {
        color = "Dark brown";
    }
    void walk() {
        System.out.println("walks on 4 legs");
    }
}
class Mustang extends Horse {
    Mustang() {
        System.out.println("mustang constructor called");

    }

}