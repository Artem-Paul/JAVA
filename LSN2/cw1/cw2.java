// Дана последовательность из N целых чисел. Найти сумму чисел, оканчивающихся
// на 5, перед которыми идет четное число.

package LSN2.cw1;
import java.util.Scanner;

public class cw2 {
    public static void main(String[] args) {
        System.out.println(sum5());
    }

    public static int sum5() {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int n = scan.nextInt();
        int lastNum = scan.nextInt();
        for (int i = 0; i < n - 1; i++) {
            int currentNum = scan.nextInt();
            if (currentNum % 10 == 5 && lastNum % 2 == 0){
                sum += currentNum;
            }
            lastNum = currentNum;
            
        }
        scan.close();
        return sum; 
    }
}
