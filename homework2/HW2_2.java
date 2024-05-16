import java.util.Scanner;
import java.util.InputMismatchException;

class InfoSorter {
	public static void showInfoByName(Student[] student) {
		// Bubble sort to sort students by name
		for (int i = 0; i < student.length - 1; i++) {
			for (int j = 0; j < student.length - i - 1; j++) {
				// Swap
				if (student[j].getName().compareTo(student[j + 1].getName()) > 0) {
					Student temp = student[j];
					student[j] = student[j + 1];
					student[j + 1] = temp;
				}
			}
		}
		for(Student s : student) {
			System.out.println(s);
		}
	}

	public static void showInfoByName(Teacher[] teacher) {
		// Bubble sort to sort teachers by name
		for (int i = 0; i < teacher.length - 1; i++) {
			for (int j = 0; j < teacher.length - i - 1; j++) {
				// Swap
				if (teacher[j].getName().compareTo(teacher[j + 1].getName()) > 0) {
					Teacher temp = teacher[j];
					teacher[j] = teacher[j + 1];
					teacher[j + 1] = temp;
				}
			}
		}
		for(Teacher t : teacher) {
			System.out.println(t);
		}
	}

	public static void showInfoByAge(Student[] student) {
		// Bubble sort to sort students by age
		for (int i = 0; i < student.length - 1; i++) {
			for (int j = 0; j < student.length - i - 1; j++) {
				// Swap
				if (student[j].getBirthYear() > student[j + 1].getBirthYear()) {
					Student temp = student[j];
					student[j] = student[j + 1];
					student[j + 1] = temp;
				}
			}
		}
		for(Student s : student) {
			System.out.println(s);
		}
	}

	public static void showInfoByAge(Teacher[] teacher) {
		// Bubble sort to sort teachers by age
		for (int i = 0; i < teacher.length - 1; i++) {
			for (int j = 0; j < teacher.length - i - 1; j++) {
				// Swap
				if (teacher[j].getBirthYear() > teacher[j + 1].getBirthYear()) {
					Teacher temp = teacher[j];
					teacher[j] = teacher[j + 1];
					teacher[j + 1] = temp;
				}
			}
		}
		for(Teacher t : teacher) {
			System.out.println(t);
		}
	}
    
}
class Student {
	private String name;
	private int birthYear;
	private int studentID;
	private int grade;

	// constructor
	Student() {
		name = "None";
		birthYear = 0;
		studentID = 0;
		grade = 0;
	}
	Student(String name, int birthYear, int studentID, int grade) {
		this.name = name;
		this.birthYear = birthYear;
		this.studentID = studentID;
		this.grade = grade;
	}

	/*public void setName(String name) {
		this.name = name;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}*/
	public String getName() {
		return name;
	}
	public int getBirthYear() {
		return birthYear;
	}
	//getters, and setters
	@Override public String toString() {
		return "name: " + name + ", birthYear: " + birthYear + ", studentID: " + studentID + ", grade: " + grade;
	}
}

class Teacher {
	private String name;
	private int birthYear;
	private String subject;

	// constructor
	Teacher() {
		name = "None";
		birthYear = 0;
		subject = "None";
	}
	Teacher(String name, int birthYear, String subject) {
		this.name = name;
		this.birthYear = birthYear;
		this.subject = subject;
	}
	/*public void setName(String name) {
		this.name = name;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}*/
	public String getName() {
		return name;
	}
	public int getBirthYear() {
		return birthYear;
	}
	//, getters, and setters
	@Override public String toString() {
		return "name: " + name + ", birthYear: " + birthYear + ", subject: " + subject;
	}
}

public class HW2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		int num = 10;
		// System.out.println("Please enter the student number: ");
		// num = scanner.nextInt();

		// initialize the array of students and teachers
		Student[] students = new Student[num];
		Teacher[] teachers = new Teacher[num];
		
		// Students info
		String student_names[]={"John Smith", "Emily Johnson", "Michael Williams", "Sarah Brown", "Jessica Davis",
								"David Miller", "Ashley Wilson", "Matthew Taylor", "Olivia Martinez", "Ethan Anderson"};
		int[] student_birthYears={2003, 2002, 2003, 2002, 2003, 2002, 2003, 2002, 2003, 2002};
		int[] student_studentIDs={2023001, 2022002, 2023003, 2022004, 2023005, 2022006, 2023007, 2022008, 2023009, 2022010};
		int[] student_grades={1, 2, 1, 2, 1, 2, 1, 2, 1, 2};

		// Teachers info
		String teacher_names[]={"Johnson", "Williams", "Brown", "Davis", "Miller", "Wilson", "Taylor", "Martinez", "Anderson", "Thomas"};
		int[] teacher_birthYears={1985, 1978, 1990, 1983, 1975, 1992, 1988, 1979, 1995, 1980};
		String teacher_subjects[]={"Math", "English", "Chinese", "Math", "Chinese", "English", "Math", "Chinese", "Math", "English"};

		// create students and teachers
		for (int i = 0; i < num; i++) {
			students[i] = new Student(student_names[i], student_birthYears[i], student_studentIDs[i], student_grades[i]);
			teachers[i] = new Teacher(teacher_names[i], teacher_birthYears[i], teacher_subjects[i]);
		}

		// Question3, print students name
		System.out.println("\033[1;31m\nStudent info: \033[0m");
		for (Student student : students) {
			System.out.println(student);
		}

		// Question3, print teachers name
		System.out.println("\033[1;31m\nTeacher info: \033[0m");
		for (Teacher teacher : teachers) {
			System.out.println(teacher);
		}
	
		// Question4, Sort students by name
		System.out.println("\033[1;31m\nSort students by name: \033[0m");
		InfoSorter.showInfoByName(students);
		System.out.println("\033[1;31m\nSort teachers by name: \033[0m");
		InfoSorter.showInfoByName(teachers);
        
		// Question5, Sort students by age
        System.out.println("\033[1;31m\nSort students by age: \033[0m");
		InfoSorter.showInfoByAge(students);
		System.out.println("\033[1;31m\nSort teachers by age: \033[0m");
		InfoSorter.showInfoByAge(teachers);

    }

}


/*
John Smith, 2002, 2024001, 2
Emily Johnson, 2003, 2024002, 1
Michael Williams, 2002, 2024003, 2
Sarah Brown, 2003, 2024004, 1
Jessica Davis, 2002, 2024005, 2
David Miller, 2003, 2024006, 1
Ashley Wilson, 2002, 2024007, 2
Matthew Taylor, 2003, 2024008, 1
Olivia Martinez, 2002, 2024009, 2
Ethan Anderson, 2003, 2024010, 1
*/

/*
Johnson, 1985, Math
Williams, 1978, English
Brown, 1990, Chinese
Davis, 1983, Math
Miller, 1975, Chinese
Wilson, 1992, English
Taylor, 1988, Math
Martinez, 1979, Chinese
Anderson, 1995, Math
Thomas, 1980, English
*/