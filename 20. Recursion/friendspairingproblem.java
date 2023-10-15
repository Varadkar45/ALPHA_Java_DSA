/* Problem 13
Friends Pairing Problem
Given n friends, each one can remain single or can be paired up with some other friend.
Each friend can be paired only once. 
Find out the total number of ways in which friends can remain single or can be paired up. 
*/
public class friendspairingproblem {
    public static int friendsPairing(int n) {
        //base case
        if(n==1 || n==2) {
            return n;
        }
        //choice -> single & pair
        //single
        int fnm1 = friendsPairing(n-1);
        //pair
        int fnm2 = friendsPairing(n-2);
        int pairWays = (n-1)*fnm2;
        //total ways
        int totalWays = fnm1+pairWays;// summing single choice and pair choice to find total number of ways 
        return totalWays;
        // compact code
        // return friendsPairing(n-1)+(n-1)*friendsPairing(n-2); //The above steps excuding base case are written in a single line to reduce the size of code
    }
    public static void main(String args[]) {
        System.out.println(friendsPairing(3));
    }
    
}
