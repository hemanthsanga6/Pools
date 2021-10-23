package Builder;

public class PoolPlumbing {
	String name;
	String equipement;
	
	public PoolPlumbing(String equipment) {
		this.name = "Pool is equiped with  " + equipement;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return this.name;
	}
}

 