package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/health/")
public class HealthCheck {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "";
    }
}
