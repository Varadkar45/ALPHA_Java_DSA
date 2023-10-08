public class superuse {
    public static void main(String args[]) {
        Horse h = new Horse();
        h.printColor(); 
        
        
    }
}

class Animal {
    String color="white";
    
    Animal() {
        System.out.println("animal constructor is called");
    }
}
class Horse extends Animal {
    String color="black";
    Horse() {
        System.out.println("horse constructor is called");
    }
    void printColor(){  
    System.out.println(color);//prints color of Horse class  
    System.out.println(super.color);//prints color of Animal class  
    } 
}