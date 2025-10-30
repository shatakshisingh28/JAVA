 
package Array;
import java.util.*;

public class MergeSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter elements of first sorted array:");
        for (int i = 0; i < n; i++) arr1[i] = sc.nextInt();

        System.out.print("Enter size of second array: ");
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        System.out.println("Enter elements of second sorted array:");
        for (int i = 0; i < m; i++) arr2[i] = sc.nextInt();

        int[] merged = mergeArrays(arr1, arr2);

        System.out.println("Merged sorted array:");
        System.out.println(Arrays.toString(merged));

        sc.close();
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int n = arr1.length, m = arr2.length;
        int[] merged = new int[n + m];
        int i = 0, j = 0, k = 0;

        // Compare elements of both arrays
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        // Copy remaining elements from arr1
        while (i < n) merged[k++] = arr1[i++];

        // Copy remaining elements from arr2
        while (j < m) merged[k++] = arr2[j++];

        return merged;
    }
}
