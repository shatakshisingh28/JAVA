import java.util.*;

public class binarytodecimal {
    public static int convertBinaryToDecimal(String binary) {
        int decimal = 0;
        int base = 1;
        int length = binary.length();
        for (int i = length - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal = decimal + base;
            }
            base = base * 2;
        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter binary number:");
        String binary = sc.next();
        int decimal = convertBinaryToDecimal(binary);
        System.out.println(decimal);
    }
}
