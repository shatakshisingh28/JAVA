package Array;
import java.util.*;
public class checksorted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(isAsc(arr)){
            System.out.println("Sorted");
        }
        else{
            System.out.println("Not Sorted in ascending...");
        }
        sc.close();
    }
    public static boolean isAsc(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
