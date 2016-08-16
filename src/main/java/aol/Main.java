package aol;

import com.aol.micro.server.MicroserverApp;
import com.aol.micro.server.config.Microserver;
import com.aol.micro.server.slack.SlackConfiguration;
import com.aol.micro.server.slack.rest.SlackRest;

@Microserver(classes = {SlackRest.class, SlackConfiguration.class})
public class Main {
    public static void main(String... args) {
        new MicroserverApp(() -> "dev-fest").run();
    }
}