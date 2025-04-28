import java.util.*;

public class MinimumBitFlips {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start number:");
        int start = sc.nextInt();
        System.out.println("Binary: " + Integer.toBinaryString(start));
        System.out.println("Enter the goal number:");
        int goal = sc.nextInt();
        System.out.println("Binary: " + Integer.toBinaryString(goal));
        int xor = start ^ goal;
        int count = 0;
        while (xor > 0) {
            xor = xor & (xor - 1); // Remove the last set bit
            count++;
        }
        System.out.println("Minimum bit flips needed: " + count);
        sc.close();
    }
}
