package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import model.Student;
import operations.Helper;

class HelperTest {
	
	//Realizo este unico Test debido a la simpleza del proyecto
	@Test
	void testAgeStudent() {
		ArrayList<String> subjects = new ArrayList<>();
		Student s1 = new Student("Test1", "Test1", "111222333A", 2000, subjects);
		//Equals con salida correcta
		assertEquals(20,Helper.ageStudent(s1));
		//Equals con salida incorrecta
		assertEquals(23,Helper.ageStudent(s1));
	}

}
