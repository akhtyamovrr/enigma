package com.arr.logic;

import com.google.common.collect.Lists;

import java.io.Reader;
import java.util.List;
import java.util.Scanner;

/**
 * Created by ARR on 28.09.2015.
 */
public class DataProcessing {

    public static List<Character> readCharacters(String fileName) {

        Scanner scanner = new Scanner(fileName);
        StringBuilder stringBuilder = new StringBuilder();
        while(scanner.hasNext()) {
            stringBuilder.append(scanner.next());
        }

        String str = stringBuilder.toString();
        List<Character> result = Lists.newArrayListWithCapacity(str.length());
        for (Character character: str.toCharArray()) {
            result.add(character);
        }
        return result;
    }
}
