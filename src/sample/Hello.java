package sample;

import javax.ws.rs.GET;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import javax.json.Json;
import javax.json.JsonObject;


@Path("/hello")
public class Hello {

	@GET
	@Produces(MediaType.TEXT_XML)
	public String helloWorld() {

		String resource = "<?xml version = '1.0' ?>" + "<hello>Welcome to the world of tomorrow, XML!</hello>";
		return resource;
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String helloWorldJSON() {
		JsonObject obj = Json.createObjectBuilder()
				.add("hello", "Welcome to the world of tomorrow, JSON!")
				.build();
		
		return obj.toString();

	}

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String helloWorldHTML() {

		String resource = "<hello>Welcome to the world of tomorrow, HTML!</hello>";
		return resource;
	}

}
