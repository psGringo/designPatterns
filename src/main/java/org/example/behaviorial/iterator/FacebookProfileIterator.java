package org.example.behaviorial.iterator;

import java.util.Random;

public class FacebookProfileIterator implements ProfileIterator {

    private String type;

    public FacebookProfileIterator(String type) {
        this.type = type;
    }

    @Override
    public Profile getNext() {
        return new Profile(); // some profile;
    }

    @Override
    public boolean hasMore() {
        return new Random().nextBoolean();
    }
}
