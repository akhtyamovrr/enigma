package com.arr.engine;

/**
 * Created by ARR on 27.09.2015.
 */
public class Rotor extends AbstractRotor {

    public Rotor() {
        setCharacters(ArrayGenerator.getRandomArray());
    }

    /**
     *
     * @return true if full circle was rotated
     */
    public boolean rotate() {
        setCurrentOffset(getCurrentOffset() + 1);
        return getCurrentOffset() == 0;
    }

    public void reset() {
        setCurrentOffset(0);
    }
}
