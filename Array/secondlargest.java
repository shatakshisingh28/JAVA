package Array;
import java.util.*;
public class secondlargest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int secondLargest = findSecondLargest(arr);
        if (secondLargest != -1) {
            System.out.println("Second largest number: " + secondLargest);
        
        }
        sc.close();
    }
    public static int findSecondLargest(int arr[]){
        int n = arr.length;

        if (n < 2) {
            System.out.println("Second largest element not possible.");
            return -1;
        }

        int first = Integer.MIN_VALUE;   
        int second = Integer.MIN_VALUE;  

        for (int num : arr) {
            if (num > first) {          
                second = first;
                first = num;
            } 
            else if (num > second && num != first) { 
                second = num;
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("All elements are same, no second largest.");
            return -1;
        }

        return second;
    }
}

