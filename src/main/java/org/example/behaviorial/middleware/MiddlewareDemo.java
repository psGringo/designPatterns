package org.example.behaviorial.middleware;

public class MiddlewareDemo {
    private static Middleware middleware;

    public static void execute() {
        middleware = Middleware.link(new UserExistsMiddleWare(), new RoleCheckMiddleware());
        if (middleware.check("someToken"))
            System.out.println("middleware pattern wroked well");
    }

}
