package moe.aluneed.mwl.user.controller;

import moe.aluneed.mwl.user.model.User;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

@Path("/user")
@Produces(MediaType.APPLICATION_JSON)
public class UserController {

    private Set<User> users = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/getUserById")
    public Set<User> getUserById(@QueryParam("id") String id) {
        User user = new User();
        user.setName(id);
        users.add(user);
        return users;
    }

}
