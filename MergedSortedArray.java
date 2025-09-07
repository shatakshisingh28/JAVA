import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; 
        int j = n - 1; 
        int k = m + n - 1; 

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        MergeSortedArray obj = new MergeSortedArray();

        // Input nums1
        System.out.print("Enter number of elements in nums1 (m): ");
        int m = sc.nextInt();
        int[] nums1 = new int[m];
        System.out.println("Enter " + m + " sorted elements of nums1:");
        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }

        // Input nums2
        System.out.print("Enter number of elements in nums2 (n): ");
        int n = sc.nextInt();
        int[] nums2 = new int[n];
        System.out.println("Enter " + n + " sorted elements of nums2:");
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }

        // Expand nums1 to hold m+n
        nums1 = Arrays.copyOf(nums1, m + n);

        // Merge arrays
        obj.merge(nums1, m, nums2, n);

        // Print result
        System.out.println("Merged Array: " + Arrays.toString(nums1));
    }
}
