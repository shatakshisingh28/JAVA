import java.util.*;
public class decimaltobinary {
    public static String convertToBinary(int decimal) {
        String binary = "";
        while(decimal>0){
            int remainder = decimal % 2;
            binary = remainder + binary;
            decimal = decimal / 2;
        }
        return binary;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();
        System.out.println("Binary representation of " + decimal + " is " + convertToBinary(decimal));
    }
}
