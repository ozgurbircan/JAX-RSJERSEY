package jsonjackson;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/student")
public class StudentResource 
{

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/student")
	public Student getStudent()
	{
		Student student=new Student();
		student.setId(0);
		student.setName("ozgur");
		student.setSurname("bircan");
		Address address=new Address();
		address.setCity("kocaeli");
		address.setCountry("Turkey");
		address.setZip("41000");
		student.setAddress(address);
		return student;
	}
	@GET
	@Path("/studentList")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> getStudentList()
	{
		Student student=new Student();
		student.setId(0);
		student.setName("ozgur");
		student.setSurname("bircan");
		
		Student student2=new Student();
		student2.setId(1);
		student2.setName("furkan");
		student2.setSurname("akbaş");
				
		Student student3=new Student();
		student3.setId(2);
		student3.setName("emre");
		student3.setSurname("sahin");
		List<Student> list=new ArrayList<Student>();
		list.add(student);
		list.add(student2);
		list.add(student3);
		return list;
		
	}
}
