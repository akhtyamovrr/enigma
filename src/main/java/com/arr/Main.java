package com.arr;

import com.arr.engine.ArrayGenerator;

import java.lang.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        for (int i = 0; i < 3; i++) {
            ArrayGenerator.writeFile(String.valueOf(i) + ".txt");
        }
    }

}