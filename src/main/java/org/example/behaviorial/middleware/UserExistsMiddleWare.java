package org.example.behaviorial.middleware;

public class UserExistsMiddleWare extends Middleware {
    @Override
    public boolean check(String token) {
        // logic to do...
        return true;
    }
}
