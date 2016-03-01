// Define class Teacher, subclass of AcademicPerson
public class Teacher extends AcademicPerson {
	// Instance variables
	private static final int MAX_COURSES = 10; // maximum courses

	// Constructor
	public Teacher(String name, String address) {
		super(name, address);
		courses = new String[MAX_COURSES];
	}

	
	// It adds a course into the list of courses.
	// This method throws ArrayElementException when the course that is being
	// added to the list already exists in it.
	public void addCourse(String course) throws ArrayElementException{
		for (int i = 0; i < numCourses; i++) {
			if (courses[i].equals(course)) {
				throw new ArrayElementException("Course already exists");
			}
		}
		courses[numCourses] = course;
		numCourses++;					
	}

	// It removes a course into the list of courses.
	// This method throws ArrayElementException when the course does not exist
	// in the list.
	public void removeCourse(String course) throws ArrayElementException {
		int flag = 0;
		for (int i = 0; i < numCourses; i++) {
			if (courses[i].equals(course)) {
				flag = 1;
			}			
		}
		
		if (flag != 1) {
			throw new ArrayElementException("Course does not exist");
		}
			
		int index = 0;
		
		for (int i = 0; i < numCourses; i++) {
			if (courses[i].equals(course)) {
				courses[i] = courses[i + 1];
				index = i + 1;
			}
		}
		
		for (int i = index; index < numCourses - 1; index++ ) {
			courses[index] = courses[i+1];
		}
		courses[numCourses] = null;
		numCourses--;
	}

	// It prints all the courses in the list in each line
	@Override
	public void printCourses() {
		for (int i = 0; i < numCourses; i++) {
			System.out.println(courses[i]);
		}
	}

	@Override
	public String toString() {
		return "Teacher: " + super.toString();
	}

}