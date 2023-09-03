public class subarrays {
    public static void printSubarrays(int numbers[]) {
        int ts = 0;
        
        for(int i = 0; i<numbers.length; i++) {
            int start = i;
            for(int j = i; j<numbers.length; j++) {

                int sum = 0;
                int end = j;
                for(int k = start; k<=end; k++) { //print
                    System.out.print(numbers[k]+" ");//subarray
                    sum = sum+numbers[k];
                }
                System.out.print("Sum is "+sum);
                ts++;// calculate total subarrays
                
                System.out.println();
            }
            
            System.out.println();
        }
        System.out.println("Total number of subarrays: "+ts);
    }    
    public static void main(String args[]) {
            int numbers[] = {2,4,6,8,10};
            printSubarrays(numbers);
        }
}
