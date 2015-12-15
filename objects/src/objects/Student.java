package objects;

public class Student extends Person{

	String studienfach;

	public Student (String vorname, String nachname, Integer alter, String studienfach){
		super(vorname, nachname, alter);
		this.studienfach = studienfach;
	}
	
	
	String getStudienfach(){
		return studienfach;
	}
	
	public void setStudienfach(String studienfach){
		this.studienfach = studienfach;
	}
}
