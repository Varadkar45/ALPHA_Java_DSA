/*Question 1 :Print the number of 7’s that are in the 2d array.
    Example  :Input - int[][] array = { {4,7,8},{8,8,7} }; 
    Output - 2
*/
import java.util.*;
// Time complexity of this code is O(n^2)
public class numberofninarray {
    public static int numberofoccurences(int array[][], int key) {

        int count = 0;

        for(int i = 0; i<array.length; i++) {
            for(int j = 0; j< array[0].length;j++) {
                if(array[i][j]== key) {
                    count++;
                }
            }
        }
        System.out.println("count of "+ key + " is : "+count);
        return count;
    }
    public static void main(String args[]) {
        int array[][] = {{4,7,8},{8,8,7}};
        int key = 8;
        numberofoccurences(array, key);
    }
}
