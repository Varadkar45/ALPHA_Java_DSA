public class rotatedarraysearch {
    public static int search(int arr[], int target, int si, int ei) {
        if(si>ei) {
            return -1;
        }
        //kaam
        int mid = (si+ei)/2;//si+(ei-si)/2;
        if(arr[mid]==target) {
            return mid;
        }
        //mid on l1
        if(arr[si]<=arr[mid]) {
            //case a : left
            if(arr[si]<=target&&target<=arr[mid-1]) {
                return search(arr, target, si, mid-1);
            } else {
                return search(arr, target, mid+1, ei);
            }
        } else {
            if(arr[mid]<=target&&target<=arr[ei]) {
                return search(arr, target,mid+1, ei);
            } else {
                return search(arr, target,si, mid-1);
            }
        }

    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 6;
        int idx = search(arr, target, 0, arr.length-1);
        System.out.println(idx);
    }
}
