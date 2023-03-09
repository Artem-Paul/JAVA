// найти количество положительных чисел в последовательности, после которых следует отрицательно число.

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = 0;
        int a = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int b = scan.nextInt();
            if (a > 0 && b < 0) {
                k++;
            }
            a = b;
        }
        System.out.println("k: " + k);
        scan.close();
    }
}
