package formparam;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("form-param")
public class PersonParamTutorial 
{
	@POST
	@Path("/addPerson")
	public String addPerson(@FormParam("name") String name, @FormParam("surname") String surname)
	{
		String message="welcome "+name+" "+surname;
		return message;
	}
}
