/*Question 2 :Swap two numbers without using any third variable */
public class swaptwonumbers {
        public static void main(String[] args) {
            int x = 3, y = 4;
            System.out.println("Before swap: x = " + x + " and y = " + y);
            
            // Swap using XOR
            x = x ^ y;
            y = x ^ y;
            x = x ^ y;
            
            System.out.println("After swap: x = " + x + " and y = " + y);
        }

        
}
