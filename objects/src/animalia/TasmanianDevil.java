package animalia;

public class TasmanianDevil extends Mammal {

	private String infraclass;
	private String order;
	private String family;
	private String genus;
	private String species;
	private String name;

	public TasmanianDevil(boolean isVertebrate, String phylum, String superclass, String clade, String classs,
			String infraclass, String order, String family, String genus, String species, String name) {
		super(isVertebrate, phylum, superclass, clade, classs);

		this.infraclass = infraclass;
		this.order = order;
		this.family = family;
		this.genus = genus;
		this.species = species;
		this.name = name;

	}

	public String getInfraclass() {
		return infraclass;
	}

	public void setInfraclass(String infraclass) {
		this.infraclass = infraclass;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	public String getGenus() {
		return genus;
	}

	public void setGenus(String genus) {
		this.genus = genus;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {

		StringBuffer buffer = new StringBuffer();

		buffer.append(name);
		buffer.append("\n");
		buffer.append(super.toString());
		buffer.append("Infraclass: ");
		buffer.append(infraclass);
		buffer.append("\n");
		buffer.append("Order: ");
		buffer.append(order);
		buffer.append("\n");
		buffer.append("Family: ");
		buffer.append(family);
		buffer.append("\n");
		buffer.append("Genus: ");
		buffer.append(genus);
		buffer.append("\n");
		buffer.append("Species: ");
		buffer.append(species);
		buffer.append("\n");

		return buffer.toString();

	}

}
