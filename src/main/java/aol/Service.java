package aol;
import javax.ws.rs.*;
import com.aol.micro.server.auto.discovery.Rest;

@Rest
@Path("/status")
public class Service {

    @GET
    public String ping() {
        return "ok";
    }
}