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

@Path("/person")
public class PersonService {
	static List<Person> list = new Vector<>();
	static {
		list.add(new Person(1, "Ata", 20));
		list.add(new Person(2, "Kamal", 30));
		list.add(new Person(3, "Jamal", 40));
	}

	public PersonService() {
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Person> get() {
		return list;
	}

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response get(@PathParam("id") int id) {
		for (Person p : list) {
			if (p.getId() == id) {
				return Response.status(200).entity(p).build();
			}
		}
		return Response.status(404).build();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response save(Person person) {
		list.add(person);
		person.setId(list.size());
		return Response.status(201).entity(person).build();
	}
}