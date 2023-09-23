public class stringcharAt {

    public static void printLetters(String fullName) {
        for(int i = 0; i < fullName.length();i++) {
            System.out.print(fullName.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        String fullName = "Shreyas Varadkar";
        printLetters(fullName);
    }
}
