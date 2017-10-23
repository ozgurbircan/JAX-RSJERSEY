package com.restful.tutorial;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/shop")
public class Shop {
	@Path("/addCart")
	@GET
	public String addCart()
	{
		 return "kart eklendi";
	}

}
