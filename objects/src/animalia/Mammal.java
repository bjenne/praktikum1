package animalia;

public class Mammal extends animalia {

	private String phlyum;
	private String superclass;
	private String clade;
	private String classs;

	public Mammal(boolean isVertebrate, String phylum, String superclass, String clade, String classs) {
		super(isVertebrate);
		this.phlyum = phylum;
		this.superclass = superclass;
		this.clade = clade;
		this.classs = classs;
	}

	public String getPhlyum() {
		return phlyum;
	}

	public void setPhlyum(String phlyum) {
		this.phlyum = phlyum;
	}

	public String getSuperclass() {
		return superclass;
	}

	public void setSuperclass(String superclass) {
		this.superclass = superclass;
	}

	public String getClade() {
		return clade;
	}

	public void setClade(String clade) {
		this.clade = clade;
	}

	public String getClasss() {
		return classs;
	}

	public void setClasss(String classs) {
		this.classs = classs;
	}

	@Override
	public String toString() {

		StringBuffer buffer = new StringBuffer();
		buffer.append(super.toString());
		buffer.append("\n");
		buffer.append("Phylum: ");
		buffer.append(phlyum);
		buffer.append("\n");
		buffer.append("Superclass: ");
		buffer.append(superclass);
		buffer.append("\n");
		buffer.append("Clade: ");
		buffer.append(clade);
		buffer.append("\n");
		buffer.append("Class: ");
		buffer.append(classs);
		buffer.append("\n");

		return buffer.toString();
	}

}
