import java.util.*;
public class setithbit {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("Enter the position you want to set the bit ");
        int i =sc.nextInt();
        int s=n|(1<<i);
        System.out.println(s);

    }
}
