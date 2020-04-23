package model;

import java.util.ArrayList;

public class Class {
	private String name;
	private int capacity;
	private ArrayList<Student> students;
	private Teacher teacher;
	
	public Class(String name, ArrayList<Student> students, Teacher teacher) {
		super();
		this.name = name;
		this.capacity = 10;
		if (students.size() > capacity) {
			System.out.println("La cantidad de alumnos no puede superar los 10 individuos.");
		} else {
			this.students = students;
		}
		this.teacher = teacher;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getName() {
		return name;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	@Override
	public String toString() {
		return "Class [Nombre = " + name 
				+ ", Capacidad = " + capacity 
				+ ", Estudiantes = " + students 
				+ ", Profesores = " + teacher + "]";
	}
}
