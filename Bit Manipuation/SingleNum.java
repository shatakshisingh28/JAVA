import java.util.*;
public class SingleNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the no. of Element");
        int n = sc.nextInt();
        System.out.println("Enter the elements");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int XOR=0;
        for(int i=0;i<n;i++){
            XOR=XOR^(arr[i]);
        }
        System.out.print("The single element is : ");
        System.out.println(XOR);
        sc.close();
    }
}
