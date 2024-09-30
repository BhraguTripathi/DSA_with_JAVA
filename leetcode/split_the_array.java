package leetcode;
import java.util.*;
public class split_the_array {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }

        split(nums);
        sc.close();
    }

    public static boolean split(int[] nums) {
        int n = nums.length;

        // Step 1: Create a frequency array to count occurrences of each number
        int[] freq = new int[101];  // Since nums[i] is between 1 and 100
        for (int num : nums) {
            freq[num]++;
        }

        // Step 2: Check if any number appears more than 2 times
        for (int i = 1; i <= 100; i++) {
            if (freq[i] > 2) {
                return false;  // If any number appears more than twice, return false
            }
        }

        // Step 3: Create two arrays to store distinct elements
        int[] nums1 = new int[n / 2];
        int[] nums2 = new int[n / 2];
        int idx1 = 0, idx2 = 0;

        // Step 4: Distribute elements between nums1 and nums2
        for (int num : nums) {
            if (freq[num] > 0) {
                if (freq[num] == 2) {
                    // If the element appears twice, add one to nums1 and one to nums2
                    if (idx1 < n / 2) {
                        nums1[idx1++] = num;
                    }
                    if (idx2 < n / 2) {
                        nums2[idx2++] = num;
                    }
                } else {
                    // If the element appears once, add it to whichever array has space
                    if (idx1 < n / 2) {
                        nums1[idx1++] = num;
                    } else if (idx2 < n / 2) {
                        nums2[idx2++] = num;
                    }
                }
                freq[num] = 0;  // Reset the frequency once the element is used
            }
        }

        // Step 5: Check if both nums1 and nums2 are fully filled
        return (idx1 == n / 2 && idx2 == n / 2);
    }
}
