package Level_2;
import java.util.*;

public class p2 {
    public static int recursiveSum(int n) {
        if (n == 0) return 0;
        return n + recursiveSum(n - 1);
    }

    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number!");
            return;
        }

        int sum1 = recursiveSum(n);
        int sum2 = formulaSum(n);

        System.out.println("Recursive Sum = " + sum1);
        System.out.println("Formula Sum   = " + sum2);
        System.out.println("Both results are equal: " + (sum1 == sum2));
    }
}
