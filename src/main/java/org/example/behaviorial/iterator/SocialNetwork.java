package org.example.behaviorial.iterator;

public class SocialNetwork {
    public ProfileIterator createFriendsIterator() {
        return new FacebookProfileIterator("friends");
    }

    public ProfileIterator createCoworkersIterator() {
        return new FacebookProfileIterator("coworkers");
    }
}
