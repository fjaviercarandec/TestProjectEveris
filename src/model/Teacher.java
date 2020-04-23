package model;

public class Teacher extends Person{
	private String subject;

	public Teacher(String name, String lastName, String dni, int birthday, String subject) {
		super(name, lastName, dni, birthday);
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Profesor -> " + super.toString() + " Asignatura = " + subject + "]";
	}
	
	

}
