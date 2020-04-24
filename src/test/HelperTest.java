package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import model.Student;
import model.Teacher;
import model.Class;
import operations.Helper;

class HelperTest {
	
	//Realizo este unico Test debido a la simpleza del proyecto
	@Test
	void testAgeStudent() {
		ArrayList<String> subjects = new ArrayList<>();
		Student s1 = new Student("Test1", "Test1", "111222333A", 2000, subjects);
		//Equals con salida correcta
		assertEquals(20,Helper.ageStudent(s1));
	}
	
	@Test
	void testAddStudent() {
		ArrayList<Student> students = new ArrayList<>();
		//Creo al alumno y profesor
		Student s1 = new Student("Test2", "Test2", "111222333A", 2000, new ArrayList<>());
		Teacher t1 = new Teacher("Test2", "Test2", "111222333A", 2000, "Test2");
		//Creo la clase y añado un estudiante
		Class c1 = new Class("Test2", students, t1);
		Helper.addStudent(s1, c1);
		
		assertEquals(s1, c1.getStudents().get(0));
	}
	
	@Test
	void testRemoveStudent() {
		//Creo al alumno y profesor
		Student s1 = new Student("Test3", "Test3", "111222333A", 2000, new ArrayList<>());
		ArrayList<Student> students = new ArrayList<>();
		students.add(s1);
		Teacher t1 = new Teacher("Test3", "Test3", "111222333A", 2000, "Test3");
		//Creo una clase con un estudiante
		Class c1 = new Class("Test3", students, t1);
		//Elimino el estudiante
		Helper.removeStudent(s1, c1);

		
		assertEquals(0, c1.getStudents().size());
		
	}

}
