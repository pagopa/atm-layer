package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.jboss.logging.Logger;
import org.jboss.resteasy.reactive.ResponseStatus;

import static io.quarkus.arc.ComponentsProvider.LOG;

@Path("/microservice5/")

public class GreetingResource {
    private static final Logger log = Logger.getLogger(GreetingResource.class);

    @ResponseStatus(429)
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy Review";
    }

    @ResponseStatus(200)
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/log-input/{input}")
    public String printInput( @PathParam("input") String input) {
        log.info("Logging input param: "+input);
        return "Hello from RESTEasy logging input test";
    }
}
