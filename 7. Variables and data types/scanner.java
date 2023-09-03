import java.util.*;

public class scanner {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next(); //stores char only before space and terminates rest
        System.out.println(input);

        String name = sc.nextLine();// stores a whole sentence or paragraph
        System.out.println(name);
        
        int number = sc.nextInt();
        System.out.println(number);
        
        float price = sc.nextFloat();
        System.out.println(price); 
        
        short num = sc.nextShort();//stores numeric values only
        System.out.println(num);

        long numb = sc.nextLong();//stores numeric values only
        System.out.println(numb);

        boolean state = sc.nextBoolean();//stores only true or false
        System.out.println(state);
        /*
         For each different input try by commenting and executing it one by one
         */

        boolean state = sc.nextBoolean();
        System.out.println(state);
    }
}
