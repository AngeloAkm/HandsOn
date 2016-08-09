package com.service.user;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/usuario")
public class Usuario {

	@GET
	@Produces(MediaType.TEXT_XML)
	public String olaXml() {
		String retorno = "<?xml version='1.0'?>" + "<ola>DEU CERTO XML</ola>";
		return retorno;
	}

//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	public String olaJson() {
//		String retorno = "DEU CERTO JSON";
//		return retorno;
//	}

}
