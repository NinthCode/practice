package com.paouke.code.pratice.javabase.hashmap;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class HashMapT1 {
    @Test
    public void testA() {
        A a = new A(10);
        Map<A, Object> map = new HashMap<A, Object>();
        map.put(a, a.getA());
        a.setA(100);
        System.out.println(map.get(a));//注意
        map.put(a, a.getA());
        System.out.println(map.size());
    }
}

class A {
    public A(int a) {
        this.a = a;
    }

    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public int hashCode() {
        return a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof A)) return false;
        A a1 = (A) o;
        return a == a1.a;
    }
}
