// 2) Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
package HW2;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        System.out.println(IncSecuence());
    }

    public static boolean IncSecuence() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int lastNum = scan.nextInt();
        for (int i = 0; i < n - 1; i++) {
            int currentNum = scan.nextInt();
            if (currentNum < lastNum) {
                return false;
            }
        }
        scan.close();
        return true;
    }
}
