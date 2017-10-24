package negotiation;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/customer")
public class CustomerResource {

	@GET
	@Path("/c")
	@Produces(MediaType.TEXT_HTML)
	public String getCustomer() {
		return new Customer("5", "ozgur").toString();
	}
	
	
	@GET
	@Path("/c")
	@Produces(MediaType.APPLICATION_JSON)
	public Customer getCustomerJson() {
		return new Customer("5", "ozgur");
	}
	
	
	@GET
	@Path("/c")
	@Produces(MediaType.APPLICATION_XML)
	public Customer getCustomerXml() {
		return new Customer("5", "ozgur");

	}
	
	
	
}
