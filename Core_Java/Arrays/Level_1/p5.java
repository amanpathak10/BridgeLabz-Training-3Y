package Level_1;

import java.util.Scanner;
class p5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int[] results = new int[4];

        for (int i = 6; i <= 9; i++) {
            results[i - 6] = number * i;
            System.out.println(number + " * " + i + " = " + results[i - 6]);
        }
    }
}
