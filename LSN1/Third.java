import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String res = "";
        if (str.length() % 2 != 0) {
            res = str.substring(str.length() / 2 + 1) + str.substring(str.length() / 2, str.length() / 2 + 1) +
                    str.substring(0, str.length() / 2);
        } else {
            res = str.substring(str.length() / 2) + str.substring(0, str.length() / 2);
        }
        System.out.println(res);
        scan.close();
    }
}
