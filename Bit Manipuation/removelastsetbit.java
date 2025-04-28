import java.util.Scanner;

public class removelastsetbit {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        System.out.println("Binary: " + Integer.toBinaryString(n));
        int result = n & (n - 1);
        System.out.println("After removing the last set bit: " + result);
        System.out.println("Binary: " + Integer.toBinaryString(result));
        sc.close();
}
}