package com.arr.engine;

/**
 * Created by ARR on 27.09.2015.
 */
public class RotorsSystem {
    private Rotor leftRotor = new Rotor();
    private Rotor rotor = new Rotor();;
    private Rotor rightRotor = new Rotor();

    public RotorsSystem() {
    }

    public Character forward(Character character) {

        Character current;
        current = leftRotor.getByIndex((int)character);
        current = rotor.getByIndex((int)current);
        current = rightRotor.getByIndex((int)current);

        return current;
    }

    public int backward(Character character) {
        int current;
        current = rightRotor.getByValue(character);
        current = rotor.getByValue((char)current);
        current = leftRotor.getByValue((char)current);
        return current;
    }

    public void rotate() {
        if (leftRotor.rotate()) {
            if (rotor.rotate()) {
                rightRotor.rotate();
            }
        }
    }

    public void reset() {
        leftRotor.reset();
        rotor.reset();
        rightRotor.reset();
    }
}
