package jaxb;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

@Path("/person-jaxb-xml")
public class PersonResource {

	@GET
	@Path("/person")
	@Produces(MediaType.APPLICATION_XML)
	public Person getPerson() {
		Person person = new Person();
		person.setId(23);
		person.setName("Ozgur");
		person.setSurname("bircan");
		return person;

	}

	@GET
	@Path("/persons")
	@Produces(MediaType.APPLICATION_XML)

	public List<Person> getPersons() {
		Person person1 = new Person();
		person1.setId(1);
		person1.setName("ozgur");
		person1.setSurname("bircan");

		Person person2 = new Person();
		person2.setId(2);
		person2.setName("mehmet");
		person2.setSurname("akif");

		Person person3 = new Person();
		person3.setId(3);
		person3.setName("ali");
		person3.setSurname("kemal");

		List<Person> persons = new ArrayList<Person>();
		persons.add(person1);
		persons.add(person2);
		persons.add(person3);

		return persons;
	}

	@GET
	@Path("/personsArray")
	@Produces(MediaType.APPLICATION_XML)
	public Person[] getPersonsArray() {
		Person person1 = new Person();
		person1.setId(1);
		person1.setName("ozgur");
		person1.setSurname("bircan");

		Person person2 = new Person();
		person2.setId(2);
		person2.setName("mehmet");
		person2.setSurname("akif");

		Person person3 = new Person();
		person3.setId(3);
		person3.setName("ali");
		person3.setSurname("kemal");

		Person[] persons = new Person[] { person1, person2, person3 };

		return persons;
	}
}