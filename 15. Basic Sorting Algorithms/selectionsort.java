public class selectionsort {
    public static void SelectionSort(int arr[]) {
        for(int i = 0 ; i<arr.length-1; i++) {
            int minPos = i;// assuming current element is minimum element
            for(int j = i+1; j<arr.length; j++) {
                if(arr[minPos] < arr[j]) {
                    minPos = j;// update minPos
                } 
                int temp = arr[minPos];
                arr[minPos] = arr[j];
                arr[j] = temp;
            }

        }
    }

    public static void printArray(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String args[]) {
        int arr[] = {5,4,1,3,2};
        SelectionSort(arr);
        printArray(arr);

    }
}
