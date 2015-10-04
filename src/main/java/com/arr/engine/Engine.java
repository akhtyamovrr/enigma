package com.arr.engine;

import com.arr.Constants;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by ARR on 28.09.2015.
 */
public class Engine {

    private final RotorsSystem rotorsSystem = new RotorsSystem();
    private final Reflector reflector = new Reflector();

    public List<Character> encrypt(List<Character> input) {
        List<Character> result = Lists.newArrayListWithCapacity(input.size());
        Character encryptedChar;
        for (Character character : input) {
            encryptedChar = rotorsSystem.forward(character);
            encryptedChar = reflector.getByIndex(Constants.SIZE - encryptedChar - 1);
            result.add(encryptedChar);
            rotorsSystem.rotate();
        }
        return result;
    }

    public List<Character> decrypt(List<Character> input) {
        List<Character> result = Lists.newArrayListWithCapacity(input.size());
        int index;
        for (Character character : input) {
            index = reflector.getByValue((char) (Constants.SIZE - character - 1));
            index = rotorsSystem.backward((char)index);
            result.add((char) index);
            rotorsSystem.rotate();
        }
        return result;
    }

    public void reset() {
        rotorsSystem.reset();
    }
}
