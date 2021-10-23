package Builder;

public class PoolDeck {
	String name;
	String material;
	
	public PoolDeck(String material) {
		this.name = "Pool deck is cosntructed using " + material;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return this.name;
	}
}

 