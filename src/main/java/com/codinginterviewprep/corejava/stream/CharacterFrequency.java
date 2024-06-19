package com.codinginterviewprep.corejava.stream;

import java.util.Map;
import java.util.stream.Collectors;
public class CharacterFrequency {
    public static void main(String[] args) {
        String input = "jaavvaaaawooord";
        Map<Character, Long> frequencyMap = input.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(c->c, Collectors.counting()));
        frequencyMap.forEach( (character, count) -> System.out.println(character+"" +
                ":"+ count));

        frequencyMap.entrySet().forEach(entry -> {
            System.out.println("Key :"+ entry.getKey() +", Value :"+ entry.getValue());
        });

    }
}
