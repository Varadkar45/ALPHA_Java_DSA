public class multipleinheritance {
    public static void main(String args[]) {
        Bear b = new Bear();
        b.green();
        b.animal();
    }
}

interface Herbivore {
    void green();
}
interface Carnivore {
    void animal();
}

class Bear implements Herbivore, Carnivore {
    public void green() {
        System.out.println("Eats green food");
    }
    public void animal() {
        System.out.println("Eats animal");
    }
}