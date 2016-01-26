package animalia;

public class App {

	public static void main(String[] args) {

		TasmanianDevil t1 = new TasmanianDevil(true, "Chordata", "Tetrapoda", "Mammaliaformes", "Mammalia",
				"Marsupialia", "Dasyuromorphia", "Dasyuridae", "Sarcophilus", "Sarcophilus harrisii", "John");

		TasmanianDevil t2 = new TasmanianDevil(true, "Chordata", "Tetrapoda", "Mammaliaformes", "Mammalia",
				"Marsupialia", "Dasyuromorphia", "Dasyuridae", "Sarcophilus", "Sarcophilus harrisii", "Peter");

		System.out.print(t1.toString());
		System.out.println("+++++++++++++");
		System.out.print(t2.toString());

	}

}