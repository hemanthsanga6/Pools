package Builder;

public class PoolBase {
	String name;
	String material;
	
	public PoolBase(String material) {
		this.name = "Base made out of " + material;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return this.name;
	}
}
