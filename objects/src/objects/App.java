package objects;

public class App {

	public static void main(String[] args) {
		
		Banane banane1 = new Banane();
		Banane banane2 = new Banane();
		
		banane1.color = "green";
		banane1.weight = 100;
		
		banane2.color = "yellow";
		banane1.weight = 150;

		System.out.println("Banane1");
		System.out.println("banane1큦 color: " + banane1.getColor());
		System.out.println("banane1큦 weight: " + banane1.getWeight());
		
		System.out.println("Banane2");
		System.out.println("banane2큦 color: " + banane2.getColor());
		System.out.println("banane2큦 weight: " + banane2.getWeight());
	}

}
