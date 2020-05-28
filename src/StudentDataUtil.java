import java.util.ArrayList;
import java.util.List;

//Model to be called by servlet
public class StudentDataUtil {
	
	
	//Return list of student objects when called by servlet
	public static List<Student> getStudents() {
		
		
		//Create an empty list
		List<Student> students = new ArrayList<>();
		
		
		
		//Add sample data
		students.add(new Student("Jake", "Taylor", "jake@jaketaylor.com"));
		students.add(new Student("Dean", "Smith", "dean@deansmith.com"));
		students.add(new Student("Jon", "Doe", "jon@jondoe.com"));
		students.add(new Student("Luke", "Skywalker", "luke@lukeskywalker.com"));
		
		
		
		//Return the list
		return students;
		
		
		
		
		
	}
	
	

}
