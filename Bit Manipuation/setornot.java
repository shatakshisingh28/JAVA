import java.util.*;
public class setornot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println("Enter the bit position to check (starting from 0): ");
        int i = sc.nextInt();
        
        if ((n & (1 << i)) != 0) {
            System.out.println("The " + i + "-th bit is SET.");
        } else {
            System.out.println("The " + i + "-th bit is NOT set.");
    }
}
}
