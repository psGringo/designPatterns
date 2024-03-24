package org.example.structural.bridge.aclasses;

import org.example.structural.bridge.bclasses.B2;

public class A2 extends A {
    public A2() {
        b = new B2();
    }
}
