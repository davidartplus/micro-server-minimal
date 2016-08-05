package aol;

import com.aol.micro.server.MicroserverApp;
import com.aol.micro.server.config.Microserver;

@Microserver
public class Main {
    public static void main(String... args) {
        new MicroserverApp(() -> "dev-fest").run();
    }
}