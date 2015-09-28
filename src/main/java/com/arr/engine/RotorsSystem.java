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

    public char backward(Character character) {
        char current;
        current = rightRotor.getByValue(character);
        current = rotor.getByValue(current);
        current = leftRotor.getByValue(current);
        return current;
    }

    public void rotate() {
        if (leftRotor.rotate()) {
            if (rotor.rotate()) {
                rightRotor.rotate();
            }
        }
    }
}
