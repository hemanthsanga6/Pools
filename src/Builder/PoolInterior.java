package Builder;

public class PoolInterior {
	String name;
	String material;
	
	public PoolInterior(String material) {
		this.name = "Pool interior is built with " + material;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return this.name;
	}
}

 