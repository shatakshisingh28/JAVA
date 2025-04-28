import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PowerSet {
    public static List<List<Integer>> getPowerSet(int[] input) {
        List<List<Integer>> powerSet = new ArrayList<>();
        int n = input.length;
        int powerSetSize = 1 << n; 

        for (int i = 0; i < powerSetSize; i++) {
            List<Integer> subset = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    subset.add(input[j]);
                }
            }
            powerSet.add(subset);
        }
        return powerSet;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take size input
        System.out.print("Enter number of elements: ");
        int size = scanner.nextInt();

        int[] input = new int[size];

        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            input[i] = scanner.nextInt();
        }

        List<List<Integer>> powerSet = getPowerSet(input);

        System.out.println("\nPower Set:");
        for (List<Integer> subset : powerSet) {
            System.out.println(subset);
        }

        scanner.close();
    }
}
