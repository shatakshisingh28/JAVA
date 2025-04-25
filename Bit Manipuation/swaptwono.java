import java.util.*;

public class swaptwono {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    {
        System.out.println("Enter 1st number");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number");
        int b = sc.nextInt();
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("Swapped values:  " + a + "," + b);
    }
}
}
