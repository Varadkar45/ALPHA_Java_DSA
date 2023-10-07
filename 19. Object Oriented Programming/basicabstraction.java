public class basicabstraction {
    public static void main(String args[]) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        
        System.out.println(h.color);

        Chicken c = new Chicken();
        c.eat();
        c.walk();
        

        //Animal a = new Animal(); not possiblee to create an object of abstract class
    }
}

abstract class Animal {
    String color;
    Animal() {
        color = "brown";

    }
    void eat() {
        System.out.println("animal eats");
    }
    abstract void walk();
}

class Horse extends Animal {
    void changeColor() {
        color = "Dark brown";
    }
    void walk() {
        System.out.println("walks on 4 legs");
    }
}
class Chicken extends Animal {
    void changeColor() {
        color = "yellow";
    }
    void walk() {
        System.out.println("walks on 2 legs");
    }

}