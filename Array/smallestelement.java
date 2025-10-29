package Array;
import java.util.*;
public class smallestelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int min=findSmallest(arr);
        System.out.println("The smallest element in the array is : "+min);
        sc.close();
    }
   public static int findSmallest(int[] arr){
    int min=arr[0];
    for(int i:arr){
        if(i<min){
            min=i;
        }
    }
    return min;
   }
}
