import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.printf("result: %d", subtractProductAndSum(n));
        scan.close();
    }

    public static int subtractProductAndSum(int n) {
        int multi = 1, sum = 0;
        while (n != 0) {
            sum += n % 10; 
            multi *= n % 10;
            n /= 10;
        }
        return multi - sum;
    }
    
}
