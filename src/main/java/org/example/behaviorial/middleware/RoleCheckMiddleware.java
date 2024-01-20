package org.example.behaviorial.middleware;

public class RoleCheckMiddleware extends Middleware{
    @Override
    public boolean check(String token) {
        return false;
    }
}
