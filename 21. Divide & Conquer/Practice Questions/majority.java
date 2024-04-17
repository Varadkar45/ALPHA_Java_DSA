/*Question 2 : Given an array nums of size n, return the majority element. (MEDIUM)
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume
that the majority element always exists in the array.
Sample Input 1 : nums = [3,2,3]
Sample Output 1 : 3
Sample Input 2 : nums = [2,2,1,1,1,2,2]
Sample Output 2 : 2
Constraints (extra Conditions):
● n == nums.length
● 1 <= n <= 5 * 104
● -109 <= nums[i] <= 109 */
public class majority {
    public static int majorityElement(int nums[]) {
        int majorityCount = nums.length/2;
        for(int i =0; i<nums.length; i++) {
            int count = 0;
            for(int j = 0; j<nums.length; j++) {
                if(nums[j]==nums[i]) {
                    count++;
                }
            }
            if(count > majorityCount) {
                return nums[i];
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int nums[] = {2, 2, 1, 1, 1, 2, 2};
        System.out.print(majorityElement(nums));

    }
}