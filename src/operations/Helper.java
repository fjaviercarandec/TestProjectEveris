package operations;

import java.time.LocalDate;

import model.*;
import model.Class;

public class Helper {
	
	public static void addStudent (Student s1, Class c1) {
		if (c1.getStudents().size() < c1.getCapacity()) {
			c1.getStudents().add(s1);
		} else {
			System.out.println("Esta clase esta llena.");
		}
	}
	
	public static void removeStudent (Student s1, Class c1) {
		c1.getStudents().remove(s1);
	}
	
	public static int ageStudent (Student s1) {
		LocalDate date = LocalDate.now();
		return date.getYear() - s1.getBirthday();
	}

}
