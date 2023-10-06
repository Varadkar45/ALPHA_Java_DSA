public class multipleinheritance {
    public static void main(String args[]) {
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);
    }
}

class Animal {
    String color;
    
    void eat() {
        System.out.println("eats");
    }
    void breath() {
        System.out.println("Breathes");
    }
}
class Mammmal extends Animal {
    int legs;
    
}

class Dog extends Mammmal {
    String breed;
}