
	public class Cellphone {

	String marke;
	String modell;
	String seriennummer;
	int preis;
	

	public Cellphone( String marke, String modell, String seriennummer, int preis)
	{
		this.marke = marke;
		this.modell = modell;
		this.seriennummer = seriennummer;
		this.preis = preis;

	}
	
	//public Cellphone() {
	//	super();
	//}

	public void setMarke(String marke) {
		this.marke = marke;
	}

	public void setModell(String modell) {
		this.modell = modell;
	}

	public void setSeriennummer(String seriennummer) {
		this.seriennummer = seriennummer;
	}

	public void setPreis(int preis) {
		this.preis = preis;
	}

	String getMarke(){
			return marke;
	}
	
	String getModell(){
		return modell;
	}
	
	String getSeriennummer(){
		return seriennummer;
	}

	int getPreis() {
		return preis;
	}
	

	public void print() {
	System.out.println("Marke: " + this.marke + "  Modell: " + this.modell + "  Seriennummer: " + this.seriennummer + "  Preis: " + this.preis + "€");	
	}
	}
	
	
