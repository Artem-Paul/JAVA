package org.example.seminar6.cw3;

import java.util.*;

public class Ex3_1 {
    public static void main(String[] args) {
        List<String> inputArray1 = new ArrayList<>(List.of("qwe","asd","zxc", "v", "v"));
        List<String> inputArray2 = new ArrayList<>(List.of("qwe","v"));

        Set<String> cross = new HashSet<>(inputArray1);
        List<String> all = new ArrayList<>(inputArray1);
        all.addAll(inputArray2);
        cross.retainAll(inputArray2);

        Map<String, Integer> count2 = new HashMap<>();
        for(String item : cross){
            int count = 0;
            for (String allItem : all){
                if(item.equals(allItem)){
                    count++;
                    Integer itemCount = count2.get(item);
                    if(itemCount == null) itemCount = 0;
                    itemCount++;
                    count2.put(item, itemCount);
                }
            }
            System.out.println(item + " " + count);
        }
        System.out.println(count2);
    }
}
