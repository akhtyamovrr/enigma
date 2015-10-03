package com.arr;

import com.arr.logic.DataProcessing;
import com.arr.logic.Executor;

import java.lang.*;
import java.io.*;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        List<Character> list = Executor.encrypt("demo-picture.jpg");
        Executor.resetEngine();
        List<Character> result = Executor.decrypt(list);
        DataProcessing.writeCharactersFile(result, "res12.jpg");
    }

}