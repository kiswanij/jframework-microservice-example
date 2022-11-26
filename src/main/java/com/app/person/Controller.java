package com.app.person;

import com.jk.services.server.JKAbstractRestController;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Path("/example")
public class Controller extends JKAbstractRestController{

	@GET
	@Path("hello")
	public String sayHello() {
		return "Hello from uncle Jalal";
	}

	@GET
	@Path("/hello/{name}")
	public String sayHelloWithPathParam(@PathParam(value = "name") String name) {
		return "Hello, " + name;
	}

	@POST
	@Path("/hello")
	public String sayHelloWithBody(Model p) {
		return "Hello, " + p.getName() + ", your age is: " + p.getAge();
	}
}