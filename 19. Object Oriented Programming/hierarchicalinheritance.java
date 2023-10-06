public class hierarchicalinheritance {
    public static void main(String args[]) {
        Bird crow = new Bird();
        crow.flys();      
        crow.eat();
        crow.color = "Black";     

        System.out.println(crow.color);

        Fish shark = new Fish();
        shark.breath();
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
    void walk() {
        System.out.println("Walks");
    }
    
}

class Fish extends Animal {
    void swim() {
        System.out.println("Swims");
    }
}

class Bird extends Animal {
    void flys() {
        System.out.println("Flys");
    }
}