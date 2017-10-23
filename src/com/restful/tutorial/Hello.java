package com.restful.tutorial;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

//Sınıf icin path yolu
@Path("/hello")
public class Hello {

	@Path("/hi/{name : [a-zA-Z][a-zA-Z_0-9]*}/{surname}")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String saySelam(@PathParam("name") String name,@PathParam("surname") String surname) {
		return "Selamlar " + name+" "+surname;
	}

	
	@Path("/text")
	@GET // http method type
	@Produces(MediaType.TEXT_PLAIN) // response type , text
	public String sayTextHello() {
		return "Hello Restful..";
	}

	@Path("/xml") // response olarak text return eden method icin path yolu ,
					// /hello/xml
	@GET // http method type
	@Produces(MediaType.TEXT_XML) // response type , xml
	public String sayXMLHello() {
		final StringBuilder builder = new StringBuilder();
		builder.append("<?xml version=\"1.0\"?>");
		builder.append("<hello> Hello Restful.. </hello>");
		return builder.toString();
	}

	@Path("/html") // response olarak text return eden method icin path yolu ,
					// /hello/html
	@GET // http method type
	@Produces(MediaType.TEXT_HTML) // response type , html
	public String sayHtmlHello() {
		final StringBuilder builder = new StringBuilder();
		builder.append("<html> <title> Hello Restful.. </title> ");
		builder.append("<body> <h2> Hello Restful.. </h2> </body> </html>");
		return builder.toString();
	}

	@Path("/json") // response olarak text return eden method icin path yolu ,
					// /hello/html
	@GET // http method type
	@Produces(MediaType.APPLICATION_JSON) // respnse type , html
	public String sayJsonHello() {
		final StringBuilder builder = new StringBuilder();
		builder.append("{ \"name\" : \"alican\" , ");
		builder.append(" \"surname\" : \"akkus\" }");
		return builder.toString();
	}

}

