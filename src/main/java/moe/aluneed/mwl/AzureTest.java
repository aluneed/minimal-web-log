package moe.aluneed.mwl;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/azureTest")
public class AzureTest {

    @GET
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/test")
    public String test(@QueryParam("requestParam") String requestParam) {
        return "success - RequestParam: " + requestParam;
    }

}
