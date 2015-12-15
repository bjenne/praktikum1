package objects;

public class Person {

	String vorname;
	String nachname;
	Integer alter;

	
	
	public Person (String vorname, String nachname, Integer alter){
		this.vorname = vorname;
		this.nachname = nachname;
		this.alter = alter;

	}
	
	String getVorname(){
		return vorname;
	}
	
	public void setVorname(String vorname){
		this.vorname = vorname;
	}
	
	String getNachname(){
		return nachname;
	}
	
	public void setNachname (String nachname) {
		this.nachname = nachname;
	}
	
	Integer getAlter(){
		return alter;
	}
	
	public void setAlter (Integer alter) {
		this.alter = alter;
	}
	
public Person () {}
	
	public String toString() { 
		
		StringBuffer buffer = new StringBuffer();
		buffer.append(vorname);
		buffer.append("");
		buffer.append(nachname);
		buffer.append("\t");
		buffer.append(alter);
		buffer.append("");
		buffer.append(super.toString());
		
		return buffer.toString();
	}
}
