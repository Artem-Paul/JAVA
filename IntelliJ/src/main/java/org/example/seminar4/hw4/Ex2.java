package org.example.seminar4.hw4;

/**
 * Учитывая строку s, содержащую только символы '(', ')', '{', '}', '['и ']', определите, является ли входная строка допустимой.
 * Строка ввода является допустимой, если:
 * Открытые скобки должны быть закрыты скобками того же типа.
 * Открытые скобки должны быть закрыты в правильном порядке.
 * Каждой закрывающей скобке соответствует открывающая скобка того же типа
 */
public class Ex2 {
    public static void main(String[] args) {
        String input1 = "()";
        String input2 = "()[]{}";
        String input3 = ")[]";
        String input4 = "[(])";
        String input5 = "[])";
        String input6 = "][";
        System.out.println(input1 + ": " + isValid(input1));
        System.out.println(input2 + ": " + isValid(input2));
        System.out.println(input3 + ": " + isValid(input3));
        System.out.println(input4 + ": " + isValid(input4));
        System.out.println(input5 + ": " + isValid(input5));
        System.out.println(input6 + ": " + isValid(input6));
    }

    private static boolean isValid(String s) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr.length % 2 != 0) {
                return false;
            }
            if (arr[i] == '[' && arr[i + 1] == ']') {
                return true;
            }
            if (arr[i] == '(' && arr[i + 1] == ')') {
                return true;
            }
            if (arr[i] == '{' && arr[i + 1] == '}') {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
