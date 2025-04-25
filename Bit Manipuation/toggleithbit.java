import java.util.Scanner;

public class toggleithbit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=sc.nextInt();
        System.out.println("Enter the bit you want to toggle");
        int i=sc.nextInt();
        int s=n^(1<<i);
        System.out.println(s);
        sc.close();
}
}
