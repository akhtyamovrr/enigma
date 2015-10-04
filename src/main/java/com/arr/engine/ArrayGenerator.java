package com.arr.engine;

import com.google.common.collect.Lists;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.List;

import com.arr.Constants;

/**
 * ISO_8859_1 characters array generator
 */

public class ArrayGenerator {

    final private static Random randomizer = new Random(new java.util.Random().nextInt());

    public static List<Character> getRandomArray() {
        List<Character> alphabet = Lists.newArrayListWithCapacity(256);
        List<Integer> indexArray = Lists.newArrayListWithCapacity(256);
        for (int i = 0; i < Constants.SIZE; i++) {
            indexArray.add(i);
        }

        int number;
        int idx;
        for (int i = 0; i < Constants.SIZE; i++) {
            idx = randomizer.nextInt() % indexArray.size();
            number = indexArray.get(idx);
            alphabet.add((char) number);
            indexArray.remove(idx);
        }
        return alphabet;
    }

    public static void writeFile(String fileName) throws FileNotFoundException, UnsupportedEncodingException {
        List<Character> characters = ArrayGenerator.getRandomArray();
        PrintWriter printWriter = new PrintWriter(fileName, StandardCharsets.ISO_8859_1.toString());
        for (Character character : characters) {
            printWriter.print(character);
        }
        printWriter.flush();
    }
}

class Random {

    private final int a = 106;
    private final int b = 1283;
    private final int m = 6075;
    private int previous;

    public Random(int start) {
        previous = start;
    }

    public int nextInt() {
        return previous = (a * previous + b) % m;
    }
}