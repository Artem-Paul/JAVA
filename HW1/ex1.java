//  Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел, 
// после которых следует отрицательное число.
// Пример ввода:
// 1 2 1 2 -1 1 3 1 3 -1 0
// Логика расчета:
// 2 -1 переход -> 2 в сумму
// 3 -1 переход -> 3 в сумму
// Пример вывода: 5

package HW1;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int res = 0;
        int a = scan.nextInt();
        while (a != 0) {
            int b = scan.nextInt();
            if (a > 0 && b < 0) {
                res += a;
            }
            a = b;
        }
        System.out.println("res: " + res);
        scan.close();
    }
}