package com.arr;

import com.arr.engine.ArrayGenerator;
import com.arr.engine.Engine;
import com.arr.logic.DataProcessing;
import com.arr.logic.Executor;

import java.lang.*;
import java.io.*;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        List<Character> list = Executor.encrypt("1.txt");
        DataProcessing.writeCharactersFile(list, "res1.txt");
        Executor.resetEngine();
        List<Character> result = Executor.decrypt(list);
        DataProcessing.writeCharactersFile(result, "res12.txt");
    }

}