package objects;

public class App2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student("Raphaela", "Bachmann", 21, "PSychologie");
		
		Student [] students = new Student[1];
		students[0] = s1;

		for (int i = 0; i < students.length; i++){
			
			System.out.println (students[i].toString());
		}
	}

}
