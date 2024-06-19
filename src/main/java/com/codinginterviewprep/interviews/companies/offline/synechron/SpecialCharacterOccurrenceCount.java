package com.codinginterviewprep.interviews.companies.offline.synechron;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SpecialCharacterOccurrenceCount {
    public static void main(String[] args) {
        String str = "HHHJ@HH*  && hh%h@#kkd#";
        Map<Character, Long> occurrenceCountMap = str.chars().mapToObj(c -> (char)c)
                .filter( c -> !Character.isAlphabetic(c))
                .collect(Collectors.groupingBy(c ->c, Collectors.counting()));

        occurrenceCountMap.entrySet().stream().forEach( entry -> {
            System.out.print("Key: "+entry.getKey()+", Value: ");
            System.out.println(entry.getValue()+"");
        });


    }
}
