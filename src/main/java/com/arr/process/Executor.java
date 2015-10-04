package com.arr.process;

import com.arr.engine.Engine;

import java.io.IOException;
import java.util.List;

/**
 * Created by ARR on 28.09.2015.
 */
public class Executor {

    private static Engine engine = new Engine();

    public static List<Character> encrypt(String fileName) throws IOException {
        List<Character> characters = DataProcessing.readCharacters(fileName);
        return engine.encrypt(characters);
    }

    public static void resetEngine() {
        engine.reset();
    }

    public static List<Character> decrypt(List<Character> characters) {
        return engine.decrypt(characters);
    }
}
