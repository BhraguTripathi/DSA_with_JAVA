package array;

import java.util.*;

public class inbuilt_sort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        /*
         * It's time complexity is O(nlog n)
         * Another form for that is Arrays.sort(arr,stating_index,ending_index)
         * it is basically for if we don't want to sort the complete array
         * 
         * now if we want do in descending order we have to collections
         * Arrays.sort(arr,Collections.reverseOrder()) for whole array, and
         * Arrays.sort(arr,start_index,end_index,Collections.reverseOrder()) for
         * partly array
         */
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
