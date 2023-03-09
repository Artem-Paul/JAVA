import java.util.Scanner;

public class five {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
            // array[i] = i;
        }
        int[] res = new int[n];
        res[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            res[i] = res[i - 1] + array[i];
        }
        for (int i = 0; i < res.length; i++) {
            System.out.println(" " + res[i]);
        }
        scan.close();

    }

}
