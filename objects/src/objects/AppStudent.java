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
		System.out.println("Student1큦 color: " + student1.getName());
		System.out.println("Student1큦 age: " + student1.getAge());
		
		System.out.println("Student2");
		System.out.println("Student2큦 color: " + student2.getName());
		System.out.println("Student2큦 weight: " + student2.getAge());

	}

}
