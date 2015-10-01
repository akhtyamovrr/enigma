package com.arr.logic;

import com.google.common.collect.Lists;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by ARR on 28.09.2015.
 */
public class DataProcessing {

    public static List<Character> readCharacters(String fileName) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(fileName));
        StringBuffer sb = new StringBuffer();
        LinkedList<Character> characters = Lists.newLinkedList();
        int symbol = br.read();
        while (symbol >= 0) {
            characters.add((char)symbol);
            symbol = br.read();
        }
        return characters;
        /*String readString = sb.toString();
        List result = Lists.newArrayListWithCapacity(readString.length());
        for (Character character : readString.toCharArray()) {
            result.add(character);
        }
        return result;*/
    }

    public static void writeCharactersFile(List<Character> characters, String fileName) throws FileNotFoundException, UnsupportedEncodingException {

        PrintWriter printWriter = new PrintWriter(fileName, StandardCharsets.ISO_8859_1.toString());
        for (Character character : characters) {
            printWriter.print(character);
        }
        printWriter.flush();
    }
}
