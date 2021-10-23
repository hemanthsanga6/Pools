package Builder;

public class PoolElectrical {
	String name;
	String connections;
	
	public PoolElectrical(String connections) {
		this.name = "Pool electrical connections " + connections+" has been installed";
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return this.name;
	}
}

 