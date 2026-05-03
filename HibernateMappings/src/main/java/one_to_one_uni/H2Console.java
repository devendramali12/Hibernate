package one_to_one_uni;

import org.h2.tools.Server;

public class H2Console {
    public static void main(String[] args) throws Exception {

        Server webServer = Server.createWebServer(
                "-webPort", "8082",
                "-webAllowOthers"
        ).start();

        System.out.println("H2 Console started at: http://localhost:8082");
    }
}