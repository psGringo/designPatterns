package org.example.structural.bridge.aclasses;

import org.example.structural.bridge.bclasses.B1;

public class A1 extends A {
    public A1() {
        b = new B1();
    }
}
