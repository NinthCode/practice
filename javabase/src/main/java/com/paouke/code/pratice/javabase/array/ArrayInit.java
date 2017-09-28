package com.paouke.code.pratice.javabase.array;

import org.junit.Test;

public class ArrayInit {

    @Test
    public void testIntegerArrayInit() {
        Integer[] is = {new Integer(1)};
        for(Integer i : is) {
            System.out.println(i);
        }
    }
}
