package com.arr.engine;

import com.arr.Constants;
import com.google.common.collect.Lists;
import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;

import java.util.List;

/**
 * Created by ARR on 28.09.2015.
 */
public class Reflector extends AbstractRotor {

    public Reflector() {
        List<Character> characters = Lists.newArrayListWithCapacity(256);
        for (int i = 0; i < Constants.SIZE; i++) {
            characters.add((char)i);
        }
        this.setCharacters(characters);
    }
}
