import java.util.*;
public class incometax {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int income = sc.nextInt();
    if(income<500000){
    System.out.println("No Tax ");
    }
        else if(income>500000&&income<1000000){
            System.out.println(" 20% Tax "+(income*0.20));
        }
        else{
            System.out.println(" 30% Tax "+(income*0.30));
        }
    }
    
}