package level2;

import java.util.Scanner;

public class p7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("Factors of " + num + " are:");
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Not a positive integer.");
        }
    }
}
