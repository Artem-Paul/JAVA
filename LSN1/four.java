// проверка симметрии масива


public class four {
    public static void main(String[] args) {
System.out.println(isArraySimmetrical());
    }
    public static boolean isArraySimmetrical() {
        int[] arr = new int[] {2, 3, 4, 5, 6, 5, 4, 3, 2};
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] == arr[arr.length - i - 1]) {
                return true;
            }
        }
        return false;
    }
}
