package Level_2;
import java.util.Scanner;

public class p8 {
    public static int findYoungest(int[] ages) {
        int min = ages[0];
        for (int age : ages) if (age < min) min = age;
        return min;
    }

    public static double findTallest(double[] heights) {
        double max = heights[0];
        for (double h : heights) if (h > max) max = h;
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of friend " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of friend " + (i + 1) + " (in cm): ");
            heights[i] = sc.nextDouble();
        }

        System.out.println("Youngest age: " + findYoungest(ages));
        System.out.println("Tallest height: " + findTallest(heights));
    }
}
