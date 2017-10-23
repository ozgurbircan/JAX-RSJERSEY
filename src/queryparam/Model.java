package queryparam;

import javax.ws.rs.FormParam;

public class Model {
	@FormParam("name")
	private String name;

	@FormParam("surname")
	private String surname;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Model [name=" + name + ", surname=" + surname + "]";
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

}
