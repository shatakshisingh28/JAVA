import java.util.Scanner;

public class CountSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int count = 0;
        while (n > 0) {
            n = n & (n - 1); // Remove the last set bit
            count++;
        }

        System.out.println("Number of set bits: " + count);
    }
}

