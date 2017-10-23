package jaxb;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/emp")
public class EmployeeService {
	
	
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/emp")
	public EmployeeModel getEmployee() {
		EmployeeModel employeeModel = new EmployeeModel();
		employeeModel.setFname("ali");
		employeeModel.setSname("aslan");
		employeeModel.setDepartman("ar-ge");
	EmployeeAddress address=new EmployeeAddress();
	address.setZip("41000");
	address.setCity("kocaeli");
	address.setCountry("Turkey");
		employeeModel.setAddress(address);
		return employeeModel;
	}

	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("emplist")
	public List<EmployeeModel> getEmp()
	{
		EmployeeModel employeeModel1=new EmployeeModel();
		employeeModel1.setFname("ali");
		employeeModel1.setSname("aslan");
		employeeModel1.setDepartman("ar-ge");
		
		EmployeeModel employeeModel2=new EmployeeModel();
		employeeModel2.setFname("mehmet");
		employeeModel2.setSname("aslan");
		employeeModel2.setDepartman("it");
		
		EmployeeModel employeeModel3=new EmployeeModel();
		employeeModel3.setFname("ceyhun");
		employeeModel3.setSname("bircan");
		employeeModel3.setDepartman("pc engineer");
		List<EmployeeModel> list=new ArrayList<EmployeeModel>();
		list.add(employeeModel1);
		list.add(employeeModel2);
		list.add(employeeModel3);
		
		
		return list;
		
	
	}
	
	
}
