package Array;
import java.util.*;
public class maxmin {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] result = findMinMax(arr);
        System.out.println("Largest element in the array: " + result[1]);
        System.out.println("Smallest element in the array: " + result[0]);

        sc.close();
    }

    // Function to find both min and max in one pass
    public static int[] findMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            else if (arr[i] > max) max = arr[i];
        }

        return new int[]{min, max};
    }
}
    //     int max=findLargest(arr);
    //     System.out.println("Largest element in the array : "+max);
        
    //     int min=findSmallest(arr);
    //     System.out.println("The smallest element in the array is : "+min);
    //     sc.close();
    // }
    //  public static int findLargest(int arr[]){
    //     int max=arr[0];
    //     for(int num :arr){
    //         if(num>max){
    //             max=num;
    //         }
    //     }
    //     return max;
    // }
    // public static int findSmallest(int[] arr){
    // int min=arr[0];
    // for(int i:arr){
    //     if(i<min){
    //         min=i;
    //     }
    // }
    // return min;
   
    // }
// }
