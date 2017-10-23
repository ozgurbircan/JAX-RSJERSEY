package queryparam;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/query-param")
public class QueryParamTutorial {

	@GET
	@Path("/book")

	public String getBookById(@QueryParam("id") int id) {
		String message = "getBookById <br/>" + " Id : " + id;
		return message;

	}

	@GET
	@Path("/bookName")
	public String getBookByName(@QueryParam("name") String name) {
		String message = "getBookByName <br/>" + " Name : " + name;
		return message;

	}

}
