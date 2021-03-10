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

import com.app.model.Account;
import com.jk.db.dataaccess.orm.JKObjectDataAccess;
import com.jk.db.datasource.JKDataAccessFactory;

@Path("/accounts")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class AccountService {
	JKObjectDataAccess da = JKDataAccessFactory.getObjectDataAccess();

	@GET
	public Response get() {
		List<Account> list = da.getList(Account.class);
		return Response.status(200).entity(list).build();
	}

	@GET
	@Path("/{id}")
	public Response get(@PathParam("id") int id) {
		Account account = da.find(Account.class, id);
		if (account == null) {
			return Response.status(404).build();
		}
		return Response.status(200).entity(account).build();
	}

	@POST
	public Response save(Account account) {
		da.update(account);
		return Response.status(201).entity(account).build();
	}

}