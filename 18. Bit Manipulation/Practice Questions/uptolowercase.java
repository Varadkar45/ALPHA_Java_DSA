/*Question 4 :Convert uppercase characters to lowercase using bit */
public class uptolowercase {
    public static void main(String[] args) {
        // Convert uppercase character to lowercase
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println((char)(ch | ' ')); 
            // prints abcdefghijklmnopqrstuvwxyz
        }
    }
    
}
