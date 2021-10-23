package Builder;

public class PoolBuildingMaterial {
	String name;
	String material;
	
	public PoolBuildingMaterial(String material) {
		this.name = "Pool is constructed with " + material;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return this.name;
	}
}