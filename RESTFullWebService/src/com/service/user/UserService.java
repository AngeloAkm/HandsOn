package com.service.user;

import javax.ws.rs.*;

@Path("/user/service")
public class UserService {
	@GET
	@Path("/index")
	public void getUser() {
		//Usuario retorno = new Usuario();
		System.out.println("Método getUser");
		//return retorno;
	}

	@PUT
	@Path("/create")
	public void createUser() {
		System.out.println("Método createUser");
	}

	@POST
	public void updateUser() {
		System.out.println("Método updateUser");
	}

	@DELETE
	public void deleteUser() {
		System.out.println("Método deleteUser");
	}

	@Path("/special")
	public SpecialUser getSpecialUser() {
		return new SpecialUser();
	}

}
