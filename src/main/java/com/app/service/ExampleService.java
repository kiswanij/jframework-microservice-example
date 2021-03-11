package com.app.service;

import java.util.List;
import java.util.Vector;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.app.model.Person;

@Path("/example")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ExampleService {

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
	public String sayHelloWithBody(Person p) {
		return "Hello, " + p.getName() + ", your age is: " + p.getAge();
	}
}