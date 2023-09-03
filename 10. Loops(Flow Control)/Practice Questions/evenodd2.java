import java.util.*;
public class evenodd2 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int choice;
        int evenSum=0;
        int oddSum =0;

        do {
            System.out.println("Enter Your Number : ");
            number = sc.nextInt();

            if(number % 2 == 0) {
                evenSum += number;
            }
            else
            {
                oddSum += number;
            }

            System.out.println("Do you want to still continue? Press 1 for yes and 0 for no : ");

            choice = sc.nextInt();
        }while(choice==1);


        System.out.println("Sum of Even numbers is " +evenSum);
        System.out.println("Sum of Odd numbers is " +oddSum);

        
        }
    
}
