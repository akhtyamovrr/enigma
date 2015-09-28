package com.arr.engine;

import com.arr.Constants;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by ARR on 28.09.2015.
 */
public class Engine {

    private RotorsSystem rotorsSystem = new RotorsSystem();
    private Reflector reflector = new Reflector();

    public List<Character> encrypt(List<Character> input) {
        List<Character> result = Lists.newArrayListWithExpectedSize(input.size());
        Character encryptedChar;
        for (Character character : input) {
            encryptedChar = rotorsSystem.forward(character);
            encryptedChar = reflector.getByIndex(Constants.SIZE - encryptedChar);
            encryptedChar = rotorsSystem.backward(encryptedChar);
            result.add(encryptedChar);
            rotorsSystem.rotate();
        }
        return result;
    }
}
