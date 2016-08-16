package aol;

import static com.jayway.restassured.RestAssured.given;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.aol.micro.server.MicroserverApp;
import com.aol.micro.server.config.Microserver;
import com.aol.micro.server.slack.SlackConfiguration;
import com.aol.micro.server.slack.rest.SlackRest;

@Microserver(classes = {SlackConfiguration.class, SlackRest.class})
public class SlackRunnerTest {

    private MicroserverApp server;

    @Before
    public void startServer() {
        server = new MicroserverApp(() -> "dev-fest");
        server.start();
    }

    @After
    public void stopServer() {
        server.stop();
    }
    
    @Test
    public void pingTest(){
        given().when()
               .get("http://localhost:8080/slack/message?txt=Test")
               .then()
               .statusCode(200);
    }
}