/*Question 2 :What is the output of the following program?  
 * A. Driving vehicle
 * B. Driving electric car
 * C. Driving car
 * D. The code does not compile
 * Ans: B. Driving Electric Car
*/
class Automobile {
    private String drive() {
        return "Driving vehicle";
    }
}

class Car extends Automobile {
    protected String drive() {
        return "Driving car";
    }
}

public class ElectricCar extends Car {
    
    public final String drive() {
        return "Driving electric car";
    }

    public static void main(String[] wheel) {
        final Car car = new ElectricCar();
        System.out.print(car.drive());
    }
}
