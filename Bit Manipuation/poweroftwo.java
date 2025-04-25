import java.util.Scanner;

public class poweroftwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("Binary: " + Integer.toBinaryString(n));
        System.out.println("Checking if the entered number belongs to power of 2");
        if ((n & (n - 1)) == 0){
            System.out.println("YES it belongs to any power of 2");
        }
        else{
            System.out.println("NO it doesn't");
        }
        sc.close();
    }
}
