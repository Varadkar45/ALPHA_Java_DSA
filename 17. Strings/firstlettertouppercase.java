/*
    Question 4

For a given String convert each the first letter of each word to uppercase.

→"hi, i am shreyas
 */
public class firstlettertouppercase {
    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder("");//Declared an empty String
        char ch = Character.toUpperCase(str.charAt(0));// first character is changed to uppercase
        sb.append(ch);
        for(int i = 1; i<str.length(); i++) {
            if(str.charAt(i)==' ' && i<str.length()-1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String args[]) {
        String str = "hi, i am shreyas";
        System.out.println(toUpperCase(str));
    }

}
// output : Hi, I Am Shreyas