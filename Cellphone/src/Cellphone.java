
	public class Cellphone {

	String marke;
	String modell;
	int seriennummer;
	int preis;

	String getMarke(){
			return marke;
	}
	
	String getModell(){
		return modell;
	}
	
	int getSeriennummer(){
		return seriennummer;
	}

	int getPreis() {
		return preis;
	}
	

	public Cellphone() {
		// TODO Auto-generated constructor stub
	}

	public void print() {
	System.out.println("Marke: " + marke + "  Modell: " + modell + "  Seriennummer: " + seriennummer + "  Preis: " + preis + "€");	
	}
	}
	
