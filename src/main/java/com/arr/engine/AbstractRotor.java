package com.arr.engine;

import com.arr.Constants;

import java.util.List;

/**
 * Created by ARR on 27.09.2015.
 */
class AbstractRotor {

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
        return characters.get((index + currentOffset) % Constants.SIZE);
    }

    public int getByValue(Character character) {
        int result = (characters.indexOf(character) - currentOffset) % Constants.SIZE;
        return result < 0 ? result + Constants.SIZE : result;
    }
}
