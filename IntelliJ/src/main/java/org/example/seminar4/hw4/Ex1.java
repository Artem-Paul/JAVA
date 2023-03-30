package org.example.seminar4.hw4;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * 1)Вывести список на экран в перевернутом виде (без массивов и ArrayList)
 * Пример:
 * 1 -> 2->3->4
 * Вывод:
 * 4->3->2->1
 */
public class Ex1 {
    public static void main(String[] args) {
        LinkedList<Integer> homeList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println(solution(homeList));
    }

    /**
     * @param homeList исходный список
     * @return развернутый список.
     */
    private static LinkedList<Integer> solution(LinkedList<Integer> homeList) {
        for (int i = homeList.size(); i > 0; i--) {
            homeList.addLast(i);
            homeList.remove();
        }
        return homeList;
    }
}
