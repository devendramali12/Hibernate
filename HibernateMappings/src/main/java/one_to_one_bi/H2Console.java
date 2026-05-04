package one_to_one_bi;

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