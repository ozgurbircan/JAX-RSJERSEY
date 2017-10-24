package serverresponsecode;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/http-response")
public class HTTPServerResponseCode {

	@GET
	@Path("/response200")
	public String response200()
	{
		String message = "response200";
		return message;
	}
	

	@GET
	@Path("/response204")
	public String response204()
	{
		String message = "responseNull";
		return null;
	}
	
	@POST
	@Path("/response405")
	public String response405()
	{
		String message = "response405";
		return message;
		
	}
	
	
}
