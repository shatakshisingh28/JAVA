package Array;
import java.util.Scanner;
public class largestelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=findLargest(arr);
        System.out.println("Largest element in the array : "+max);
        sc.close();
    }
    public static int findLargest(int arr[]){
        int max=arr[0];
        for(int num :arr){
            if(num>max){
                max=num;
            }
        }
        return max;
    }
}
