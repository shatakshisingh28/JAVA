import java.util.*;
public class clearbit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=sc.nextInt();
        System.out.println("Enter the bit you want to clear");
        int i=sc.nextInt();
        int s=n&~(1<<i);
        System.out.println(s);
        sc.close();
    }
}
