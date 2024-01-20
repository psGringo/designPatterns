package org.example.behaviorial.middleware;

public abstract class Middleware {

    private Middleware next;

    public static Middleware link(Middleware first, Middleware... chain) {
        Middleware head = first;

        for (Middleware nextInChain : chain) {
            head.next = nextInChain;
            head = nextInChain;
        }

        return first;
    }

    public abstract boolean check(String token);

    protected boolean checkNext(String token) {
        if (next == null)
            return true;

        return checkNext(token);
    }
}
