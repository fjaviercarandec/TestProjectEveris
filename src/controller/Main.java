package controller;

import java.util.ArrayList;

import model.Student;
import model.Teacher;
import operations.Helper;
import model.Class;

public class Main {

	public static void main(String[] args) {
		
		//ArrayList con asignaturas
		ArrayList<String> subjects = new ArrayList<>();
		subjects.add("Lenguaje de Marcas");
		subjects.add("Programacion");
		subjects.add("Base de Datos");
		
		//Alumnos
		Student s1 = new Student("Javier", "Carande", "111222333A", 1997, subjects);
		Student s2 = new Student("Abraham", "Barrera", "444555666B", 1998, subjects);
		Student s3 = new Student("Salvador", "Muñoz", "777888999C", 2000, subjects);
		Student s4 = new Student("Juan", "Gonzalez", "000999111D", 1997, subjects);
		//Añado alumnos al array de alumnos
		ArrayList<Student> students = new ArrayList<>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		
		//Profesores
		Teacher t1 = new Teacher("Juan Diego", "Perez", "121343565A", 1980, "Programacion");
		Teacher t2 = new Teacher("Teresa", "Aguilar", "787909121B", 1977, "Base de Datos");
		
		//Clases
		Class c1 = new Class("Programacion", students, t1);
		Class c2 = new Class("Base de Datos", students, t2);
		
		//Pruebo metodos, para ello creo un nuevo alumno
		Student s5 = new Student("Nombre1", "Apellido1", "dnidnidniA", 2000, subjects);
		//Añado el alumno s5
		Helper.addStudent(s5, c1);
		//Elimino el alumno s4
		Helper.removeStudent(s4, c1);
		//Pruebo el metodo ageStudent
		System.out.println("Edad del alumno s1: " + Helper.ageStudent(s1));
		System.out.println("Edad del alumno s3: " + Helper.ageStudent(s3));
		
		
		
		
	}

}
