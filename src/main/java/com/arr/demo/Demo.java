package com.arr.demo;

import com.arr.process.DataProcessing;
import com.arr.process.Executor;

import java.io.IOException;
import java.util.List;

/**
 * Created by ARR on 04.10.2015.
 */
public class Demo {
    private final static String path = "examples\\";

    public static void run() throws IOException {

        // Empty file
        System.out.println("Empty file execution");
        executeExample("empty.txt");
        System.out.println("Done\n");

        // One symbol file
        System.out.println("One character execution");
        executeExample("one_character.txt");
        System.out.println("Done\n");

        // Same character
        System.out.println("Same character execution");
        executeExample("same_character.txt");
        System.out.println("Done\n");

        // Artcitle
        System.out.println("Article execution");
        executeExample("article.txt");
        System.out.println("Done\n");

        // Picture
        System.out.println("Picture execution");
        executeExample("porsche-panamera.jpg");
        System.out.println("Done\n");

        // Archive
        System.out.println("Archive execution");
        executeExample("nginx-1.9.4.zip");
        System.out.println("Done\n");
    }

    private static void executeExample(String fileName) throws IOException {
        List<Character> list = Executor.encrypt(path + fileName);
        DataProcessing.writeCharactersFile(list, path + "enc_" + fileName);
        Executor.resetEngine();
        List<Character> result = Executor.decrypt(list);
        DataProcessing.writeCharactersFile(result, path + "res_" + fileName);
        Executor.resetEngine();
    }
}
