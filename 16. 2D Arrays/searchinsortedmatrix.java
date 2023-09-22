public class searchinsortedmatrix {
    // using linear search Time Complexity : O(n^2)
    public static boolean bruteforceapproach(int matrix[][], int key) {
        for(int i = 0 ; i< matrix.length; i++) {
            for(int j = 0; j<matrix[0].length; j++) {
                if(matrix[i][j]==key){
                    System.out.print("KEY found at ("+i+","+j+")");
                    return true;

                }
        }
        
    }
    return false;
}
//using binary search Time Complexity : O(n logn)


//using Staircase Search Time Complexity : O(n+m)
    public static boolean staircaseSearch(int matrix[][], int key) {
        int row = 0, col = matrix[0].length-1;// here matrix[0].length value is 4 so col = 3
        while(row < matrix.length && col>=0) {
            if(matrix[row][col]==key) {
            System.out.print("Found key at ("+row+","+col+")");
            return true;
        }
        else if(key < matrix[row][col]) {
            col--;
        }
        else{
            row++;
        }
    }
    System.out.println("Key not found");
    return false;

}
    public static void main(String args[]) {
        int matrix[][] = {{10,20,30,40},
                            {15,25,35,45},
                            {27,29,37,48},
                            {32,33,39,50}};
        int key = 33;
        // bruteforceapproach(matrix, key);
        staircaseSearch(matrix, key);
        
    }
}
