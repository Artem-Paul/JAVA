//Реализовать pow(x, n), который вычисляет xвозведенный в степень n(т.е. xn).

package LSN2.cw1;

import java.util.Scanner;

public class cw1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        int n = scan.nextInt();
        scan.close();
        System.out.println(pow(x, n));
    }

    // private static double pow(double x, int n) {
    // double result = 1.0;
    // if (n >= 0) {
    // for (int i = 0; i < n; i++) {
    // result *= x;
    // }
    // } else {
    // for (int i = 0; i < -n; i++) {
    // result /= x;
    // }
    // }
    // return result;

    private static double pow(double x, int n) {
        double result = 1.0;
        if (n < 0) {
            x = 1 / x;
            n = -n;
        } 
        for (int i = 0; i < n; i++) {
            result *= x;
        }
        return result;
    }
}
