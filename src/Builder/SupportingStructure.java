package Builder;

public class SupportingStructure {
	String name;
	String material;
	
	public SupportingStructure(String material) {
		this.name = "Pool Supporting Structure is made out of " + material;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return this.name;
	}
}

 