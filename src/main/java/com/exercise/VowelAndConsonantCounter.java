package com.exercise;

import java.util.*;
import java.util.stream.Collectors;

public class VowelAndConsonantCounter {
    public static Map<String, Integer> vowelCount = new HashMap<>();
    public static Map<String, Integer> consonentCount = new HashMap<>();

    public static void main(String[] args) {
        vowelCount.clear();
        consonentCount.clear();
        if (args.length >=4) {
            System.out.println("Extra arguments passed.");
        } else {
            List<String> argumentList = Arrays.asList(args);
            argumentList.forEach(argument -> vowelCount.put(argument,getCharCounts(argument).get("vowel")));
            argumentList.forEach(argument -> consonentCount.put(argument,getCharCounts(argument).get("consonant")));
            System.out.println("Vowel : "+vowelCount);
            System.out.println("Consonant :"+consonentCount);
        }
    }



    public static  Map<String,Integer> getCharCounts(String input) {
        Map<String, Integer> result= new HashMap<>();
        char[] chars = input.toCharArray();
        String[] inputChars = input.split("");

        // Following line will separate the spacial charaters from the input
        List<String> filtered = Arrays.stream(inputChars).filter(inputChar -> inputChar.charAt(0) >= 97 && inputChar.charAt(0) <= 122).collect(Collectors.toList());

        int vowels = (int) filtered.stream().filter(inputChar -> inputChar.matches("[aeiou]")).count();
        result.put("vowel",vowels);
        result.put("consonant",filtered.size()-vowels);

        return result;
    }
}