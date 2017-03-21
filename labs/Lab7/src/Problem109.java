
public class Problem109 {
	public static void main(String[] args) {
		String[] currentStudents;
        Course course = new Course("Software Development");
        
        course.addStudent("Monica Figueroa");
        course.addStudent("Cora Curtis");
        course.addStudent("William Norman");
        System.out.println("The students enrolled in the course: ");
        currentStudents = course.getStudents();
        
        for(int i=0; i<course.getNumberOfStudents(); i++)
        	System.out.print(currentStudents[i]+",");
        System.out.println();
        
        course.dropStudent("Cora Curtis");
        System.out.println("\n Cora Curtis has been removed from the course.");
        
        System.out.println("\nThe remaining students in the course: ");
        currentStudents = course.getStudents();
        
        for(int i=0; i<course.getNumberOfStudents(); i++)
        	System.out.print(currentStudents[i]+",");
        System.out.println();
	}
}

