/*Question 1: Given an integer array nums, return true if any value appears at least twice in the
array, and return false if every element is distinct.
Example 1:
Input: nums = [1, 2, 3, 1]
Output: true
Example 2:
Input: nums = [1, 2, 3, 4]
Output: false
Example 3:
Input: nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]
Output: true
 */
public class twiceoccur {
    public static boolean occurence(int nums[]) { 
        for(int i = 0 ; i<nums.length ; i++) {
            for(int j = i+1; j<nums.length; j++) {
                if(nums[i] == nums[j]){
                    return true;
                }
                
            }
        }
        
        return false;
        
    }
    public static void main(String args[]) {
        int nums[] = {1,2,3,0};
        
        System.out.println(occurence(nums));


    }
}
