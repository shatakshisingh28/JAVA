package Array;
import java.util.*;
public class countoccurence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of elements:");
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target value");
        int target=sc.nextInt();
        int count=findCount(arr,target);
        System.out.println("Count: "+count);
        sc.close();
    }
    public static int findCount(int arr[],int target){
        int count=0;
        for(int num:arr){
            if(num==target){
                count++;
            }
        }
        return count;
    }
}
