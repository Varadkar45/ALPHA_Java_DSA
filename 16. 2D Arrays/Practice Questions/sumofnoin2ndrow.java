/*Question 2 :Print out the sum of the numbers inthe second row of the “nums” array.
    Examplec :Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
    Output - 18 
*/
public class sumofnoin2ndrow {

    public static int sumof2ndrow(int nums[][]) {
        int sum = 0;

        //sum of 2nd row element
            for(int j = 0; j<nums.length;j++) {
                
                    sum += nums[1][j];
            }
        
        System.out.print("Sum of 2nd array is " +sum);
        return sum;
    }
    public static void main(String args[]) {
        int nums[][] = { {1,4,9},{11,4,3},{2,2,3}};
        sumof2ndrow(nums);
    }
}
