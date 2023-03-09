// Учитывая входную строку s, измените порядок слов в обратном порядке. Слово определяется как 
// последовательность символов, не содержащих пробелов. Слова в s будут разделены по крайней мере 
// одним пробелом. Возвращает строку слов в обратном порядке, объединенную одним пробелом.
// Обратите внимание, что s может содержать начальные или конечные пробелы или несколько пробелов
// между двумя словами. Возвращаемая строка должна содержать только один пробел, разделяющий слова. 
// Не включайте никаких дополнительных пробелов.

package HW1;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        reverseWords(s);
    }

    public static String reverseWords(String s) {
        s = s.trim();
        String[] rev = s.split(" ");
        for (int i = rev.length - 1; i >= 0; i--) {
            System.out.print(rev[i] + ' ');
        }
        return s;
    }

}
