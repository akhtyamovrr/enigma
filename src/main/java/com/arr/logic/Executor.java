package com.arr.logic;

import com.arr.engine.Engine;

import java.util.List;

/**
 * Created by ARR on 28.09.2015.
 */
public class Executor {

    public List<Character> encrypt(String fileName) {
        List<Character> characters = DataProcessing.readCharacters(fileName);
        Engine engine = new Engine();
        return engine.encrypt(characters);
    }
}
