//3) Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
package HW2;

public class ex3 {
    public static void main(String[] args) {
        int[] inputArr = new int[] { 1, 22, -5, 73, 3, 49, -8, 45, -2, 1 };
        printArray(inputArr);
        ReplaceNum(inputArr);
        printArray(inputArr);
    }

    private static void printArray(int[] inputArr) {
        String res = "[";
        for (int i = 0; i < inputArr.length; i++) {
            res += inputArr[i] + (i == inputArr.length - 1 ? "]" : ",");
        }
        System.out.println(res);
    }

    public static void ReplaceNum(int[] inputArr) {
        int[] newArr = new int[inputArr.length];
        int sumI = 0;
        for (int i = 0; i < inputArr.length; i++) {
            if (9 < inputArr[i] && inputArr[i] < 100 || -100 < inputArr[i] && inputArr[i] < -9) {
                sumI += i;
            }
        }
        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i] < 0) {
                inputArr[i] = sumI;
            }
        }
    }
}
