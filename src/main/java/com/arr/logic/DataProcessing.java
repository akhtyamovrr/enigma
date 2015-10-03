package com.arr.logic;

import com.google.common.collect.Lists;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by ARR on 28.09.2015.
 */
public class DataProcessing {

    public static List<Character> readCharacters(String fileName) throws IOException {
        LinkedList<Character> characters = Lists.newLinkedList();
        FileInputStream fis = new FileInputStream(fileName);
        InputStreamReader reader = new InputStreamReader(fis, StandardCharsets.ISO_8859_1.toString());

        int symbol = reader.read();
        while(symbol >= 0) {
            characters.add((char)symbol);
            symbol = reader.read();
        }
        return characters;
    }

    public static void writeCharactersFile(List<Character> characters, String fileName) throws IOException {
        PrintWriter printWriter = new PrintWriter(fileName, StandardCharsets.ISO_8859_1.toString());
        for (Character character : characters) {
            printWriter.print(character);
        }
        printWriter.flush();
    }
}
