// 1) Дана последовательность N целых чисел. Найти сумму простых чисел.

package HW2;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        System.out.println(SumProstNum());
    }

    public static int SumProstNum() {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int currentNum = scan.nextInt();
            if (currentNum == 2 || currentNum == 5 || currentNum == 3) {
                sum += currentNum;
            }
            if (currentNum % 10 == 5 || currentNum % 2 == 0 || currentNum % 3 == 0) {
                continue;
            } else {
                int count = 0;
                for (int j = 2; j <= Math.sqrt(currentNum); j++) {
                    if (currentNum % j != 0) {
                        count += 1;
                    }
                }
                if (count > 0) {
                    sum += currentNum;
                }
            }
        }
        scan.close();
        return sum;
    }
}
