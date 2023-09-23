import java.util.*;
public class stringbasics {
    public static void main(String args[]) {
        char arr[] = {'a','b','c','d'};
        String str = "abcd";
        System.out.println(str);
        Scanner sc = new Scanner(System.in);
        String name1;
        name1 = sc.next();// prints only a single word
        System.out.println(name1);
        //length()
        String fullname = "Shreyas Varadkar";
        System.out.println(fullname.length());
        // Concatenation
        String firstName = "Shreyas";
        String lastName = "Varadkar";
        String fullName = firstName+" "+lastName;
        System.out.println(fullName);
    }
}
