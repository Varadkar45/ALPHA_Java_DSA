/*
    Problem 14
    Binary Strings Problem
    Print all binary strings of size n without consecutive ones
    Companies asked - Paytm
*/
public class binarystring {
    public static void printBinStrings(int n, int lastString, String str) {
        //base case
        if(n == 0) {
            System.out.println(str);
            return;
        }
        //kaam
        printBinStrings(n-1, 0, str+"0");
        if(lastString == 0) {
            printBinStrings(n-1, 1, str+"1");
        }


    }
    public static void main(String args[]) {
        printBinStrings(3, 0, "");
    }
}
