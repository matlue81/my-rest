package org.mathias.rest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;

@ApplicationPath("/")
public class HelloWorldApplication extends Application {

	@GET
	@Path("/{pathParameter}")
	public Response pong(
	              @PathParam("pathParameter") String pathParameter,
	             @DefaultValue("1000") @QueryParam("queryParameter")
	             int queryParameter) {

	    String response = "Pong - pathParameter : " + pathParameter
	                                 + ", queryParameter : " + queryParameter;

	    return Response.status(200).entity(response).build();
	}

}
