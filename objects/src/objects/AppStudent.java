package objects;

public class AppStudent {

	public static void main(String[] args) {
		Student student1 = new Student();
		Student student2 = new Student();
		
		student1.name = "Raphaela";
		student1.age = 25;
		
		student2.name = "John";
		student2.age = 21;

		System.out.println("Student1");
		System.out.println("Student1�s color: " + student1.getName());
		System.out.println("Student1�s age: " + student1.getAge());
		
		System.out.println("Student2");
		System.out.println("Student2�s color: " + student2.getName());
		System.out.println("Student2�s weight: " + student2.getAge());

	}

}
