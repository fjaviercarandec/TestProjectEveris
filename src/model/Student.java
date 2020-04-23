package model;

import java.util.ArrayList;

public class Student extends Person {
	
	private ArrayList<String> subjects;
	
	public Student(String name, String lastName, String dni, int birthdate, ArrayList<String> subjects) {
		super(name, lastName, dni, birthdate);
		this.subjects = subjects;
	}

	public ArrayList<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(ArrayList<String> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Alumno -> " + super.toString() + ", Asignaturas = " + subjects + "]";
	}
	
	

}
