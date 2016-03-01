import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class TeachingAssistantStudent extends Student {

	private int hours; // total hours of TA
	HashMap<String, Integer> courseHour = new HashMap<String, Integer>();

	public TeachingAssistantStudent(String name, String address) {
		super(name, address);
		this.hours = 0;
	}

	// It adds a course into the HashMap with the key of course and hours as the
	// value.
	// This method throws ArrayElementException when the course that is being
	// added to the HashMap already exists in it.
	public void addCourseHour(String course, int hours) throws ArrayElementException {
		if (courseHour.get(course) != null) {
			throw new ArrayElementException("Course already exist (in addCourHour Method)");
		}		
		courseHour.put(course, hours);	
		this.hours += hours;
	}

	// This method first should print the courses along with the grades that the
	// TA is taking as a student and then print out the courses with the
	// corresponding hours which the TA is assisting in each line.
	// Use Iterator to iterate the HashMap.
	@Override
	public void printCourses() {
		super.printCourses();		
		Iterator<Entry<String, Integer>> it = courseHour.entrySet().iterator();
		while (it.hasNext()) {
			Entry<String, Integer> pair = it.next();
			System.out.println(pair.getKey() + "    " + pair.getValue());
			
			
		}
	}

	public int getHours() {
		return this.hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	@Override
	public String toString() {
		return super.toString() + " Also serving as Teaching Assistant.";
	}

}