package array.algorithms;

public class binay_search {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 6;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    public static int binarySearch(int[] arr,int key){
        int start=0, end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }else if(arr[mid]<key){
                start=mid+1;
            }else if(arr[mid]>key){
                end=mid-1;
            }
        }
        return -1;
    }
}
