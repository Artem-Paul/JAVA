package org.example.seminar4.HW4;


import java.util.LinkedList;
import java.util.List;

/**
 * Учитывая строку s, содержащую только символы '(', ')', '{', '}', '['и ']', определите, является ли входная строка допустимой.
 * Строка ввода является допустимой, если:
 * Открытые скобки должны быть закрыты скобками того же типа.
 * Открытые скобки должны быть закрыты в правильном порядке.
 * Каждой закрывающей скобке соответствует открывающая скобка того же типа
 */
public class Ex2 {
    public static void main(String[] args) {
        String inputString1 = "()";
        String inputString2 = "()[]{}";
        String inputString3 = "(]";
        String inputString4 = "[(])";
        String inputString5 = "]";
        System.out.println(inputString1 + ": " + isValid(inputString1));
        System.out.println(inputString2 + ": " + isValid(inputString2));
        System.out.println(inputString3 + ": " + isValid(inputString3));
        System.out.println(inputString4 + ": " + isValid(inputString4));
        System.out.println(inputString5 + ": " + isValid(inputString5));
    }

    private static boolean isValid(String inputString) {
        List<String> list = new LinkedList<>();
        char[] arr = inputString.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i].equals("[")) || (arr[i].equals("(")) || arr[i].equals("{")) {
                if ((list.get(i).equals("[")) && (list.get(i + 1).equals("]"))) return true;
                if ((list.get(i).equals("(")) && (list.get(i + 1).equals(")"))) return true;
                if ((list.get(i).equals("{")) && (list.get(i + 1).equals("}"))) return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
