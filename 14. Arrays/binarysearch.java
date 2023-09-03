public class binarysearch {
public static int binarySearch(int numbers[],int key) {
    int start=0, end=numbers.length-1;

    while(start<=end) {
        int mid = (start+end)/2;

        //comparisons
        if(numbers[mid]==key) {
            return mid;
        }
        if(numbers[mid]<key) {
            start = mid+1;//right
        }
        else{//left
            end = mid-1;
        }
    }
    return -1;
}

    public static void main(String args[]) {
        int numbers[] = {2,4,6,8,10,12,14};
        int key = 14;

        System.out.println("Index for key at "+binarySearch(numbers, key));
    }
    
}
