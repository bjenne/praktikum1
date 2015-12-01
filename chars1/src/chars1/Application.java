package chars1;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		CharChecker cc = new CharChecker();
		String toCheck = "fsfsfsfaaaa";
		
		char[] charArray = cc.toArray(toCheck);
		cc.printArray(charArray);
	}

}
