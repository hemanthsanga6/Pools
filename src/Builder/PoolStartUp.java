package Builder;

public class PoolStartUp {
	String name;
	String water;
	
	public PoolStartUp(String water) {
		this.name = "Pool is started with  " + water;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return this.name;
	}
}
