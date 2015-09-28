package com.arr.engine;

import com.arr.Constants;

import java.util.List;

/**
 * Created by ARR on 27.09.2015.
 */
public class AbstractRotor {

    private List<Character> characters;
    private int currentOffset = 0;

    public List<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(List<Character> characters) {
        this.characters = characters;
    }

    public int getCurrentOffset() {
        return currentOffset;
    }

    public void setCurrentOffset(int currentOffset) {
        this.currentOffset = currentOffset % Constants.SIZE;
    }

    public Character getByIndex(int index) {
        return characters.get(index);
    }

    public char getByValue(Character character) {
        return (char)characters.indexOf(character);
    }
}
