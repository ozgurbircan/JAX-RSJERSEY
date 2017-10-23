package com.restful.tutorial;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/merhaba")
public class Merhaba
{
	@Path("/merhaba/{isim}")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String textMerhaba(@PathParam("isim") String isim)
	{
		return "Selamlar "+isim;
	}
}
