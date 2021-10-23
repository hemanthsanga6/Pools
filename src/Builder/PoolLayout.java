package Builder;

public class PoolLayout {
	String name;
	String design;
	
	public PoolLayout(String design) {
		this.name = "Pool Layout is in the shape of " + design;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return this.name;
	}
}

