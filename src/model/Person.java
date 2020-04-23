package model;

public class Person {
	protected String name;
	protected String lastName;
	protected String dni;
	protected int birthdate;
	
	public Person(String name, String lastName, String dni, int birthdate) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.dni = dni;
		this.birthdate = birthdate;
	}

	public String getName() {
		return name;
	}

	public String getLastName() {
		return lastName;
	}

	public String getDni() {
		return dni;
	}

	public int getBirthday() {
		return birthdate;
	}

	@Override
	public String toString() {
		return "Persona [Nombre = " + name 
				+ ", Apellido = " + lastName 
				+ ", DNI = " + dni 
				+ ", Año Nacimiento = "+ birthdate;
	}
	
	
	

}
