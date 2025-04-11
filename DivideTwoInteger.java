import java.util.*;
public class DivideTwoInteger {
    public int divide(int dividend, int divisor) {
        
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;
 
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        int result = 0;
        while (a >= b) {
            long temp = b;
            int multiple = 1;

            while (a >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }

            a -= temp;
            result += multiple;
        }

        if ((dividend > 0) != (divisor > 0)) {
            result = -result;
        }

        return result;
    }
    public static void main(String[] args) {
        DivideTwoInteger divideTwoInteger = new DivideTwoInteger();
        Scanner sc = new Scanner (System.in);
        int dividend = sc.nextInt();
        int divisor = sc.nextInt();
        System.out.println(divideTwoInteger.divide(dividend,divisor));
    }

}
