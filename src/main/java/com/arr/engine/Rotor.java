package com.arr.engine;

import com.arr.Constants;
import com.arr.generate.ArrayGenerator;

/**
 * Created by ARR on 27.09.2015.
 */
public class Rotor extends AbstractRotor {

    public Rotor() {
        setCharacters(ArrayGenerator.getRandomArray());
    }

    /**
     *
     * @return true if full cicle was rotated
     */
    public boolean rotate() {
        setCurrentOffset((getCurrentOffset() + 1));
        return getCurrentOffset() == 0;
    }
}
