package Builder;

import java.util.List;


public class Pool
{
	String poolName;
	PoolBuilder.PoolType poolType;
	PoolBuilder.Category category;
	double poolCost;
	String description;
	String poolCategory;
	PoolBuilder.PoolLayout poolLayout;
	String poolDesign;
	PoolBase poolBase;
	SupportingStructure supportingStructure;
	PoolPlumbing poolPlumbing;
	PoolElectrical poolElectrical;
	PoolBuildingMaterial poolBuildingMaterial;
	PoolInterior poolInterior;
	PoolStartUp poolStartUp;
	PoolDeck poolDeck;
	List<String> poolAmenities;
	//public Pool() {
	//	this.walls = new ArrayList<Wall>();
	//	this.windows = new ArrayList<Window>();
	//}
	public void setCost(double poolCost)
	{
		this.poolCost = poolCost;
	}
	public double getCost()
	{
		return this.poolCost;
	}
	public Pool setPoolType(PoolBuilder.PoolType poolType) {
		this.poolType = poolType;
		switch (poolType) {
		//INGROUND, ABOVEGROUND, INFINITY, LAP, PLUNGE, NATURAL, SPOOL, HOTTUB, ARCHITECHTURAL, ZEROENTRY, OCEANPOOLS
			case INGROUND: this.poolName = "IN GROUND SWIMMING POOL"; break;
			case ABOVEGROUND: this.poolName = "ABOVE GROUND SWIMMING POOL"; break;
			//case INFINITY: this.poolName = "INFINITY POOL"; break;
			//case LAP: this.poolName = "LAP SWIMMING POOL"; break;
			//case PLUNGE: this.poolName = "PLUNGE SWIMMING POOL"; break;
			//case NATURAL: this.poolName = "NATURAL SWIMMING POOL"; break;
			//case SPOOL: this.poolName = "SPA SWIMMING POOL"; break;
			//case HOTTUB: this.poolName = "HOTTUB POOL"; break;
			//case ARCHITECHTURAL: this.poolName = "ARCHITECTURAL SWIMMING POOL"; break;
			//case ZEROENTRY: this.poolName = "ZERO ENTRY SWIMMING POOL"; break;
			//case OCEANPOOLS: this.poolName = "OCEAN SIDE VIEW POOL"; break;
			
		}
		return this;
	}
	public Pool setPoolCategory(PoolBuilder.Category category) {
		this.category = category;
		switch (category) {
		//INGROUND, ABOVEGROUND, INFINITY, LAP, PLUNGE, NATURAL, SPOOL, HOTTUB, ARCHITECHTURAL, ZEROENTRY, OCEANPOOLS
			case CONCRETE: this.poolCategory = "CONCRETE SWIMMING POOL"; break;
			case FIBERGLASS: this.poolCategory = "FIBER GLASS SWIMMING POOL"; break;
			case VINYLLINER: this.poolCategory = "VINYL LINER SWIMMING POOL"; break;
			case INFINITY: this.poolCategory = "INFINITY POOL"; break;
			case LAP: this.poolCategory = "LAP SWIMMING POOL"; break;
			case PLUNGE: this.poolCategory = "PLUNGE SWIMMING POOL"; break;
			case NATURAL: this.poolCategory = "NATURAL SWIMMING POOL"; break;
			case SPOOL: this.poolCategory = "SPA SWIMMING POOL"; break;
			case HOTTUB: this.poolCategory = "HOTTUB POOL"; break;
			case ARCHITECTURAL: this.poolCategory = "ARCHITECTURAL SWIMMING POOL"; break;
			case ZEROENTRY: this.poolCategory = "ZERO ENTRY SWIMMING POOL"; break;
			case OCEANPOOLS: this.poolCategory = "OCEAN SIDE VIEW POOL"; break;
			
		}
		return this;
	}
	public Pool setPoolLayout(PoolBuilder.PoolLayout poolLayout) {
		this.poolLayout = poolLayout;
		switch (poolLayout) {
		//INGROUND, ABOVEGROUND, INFINITY, LAP, PLUNGE, NATURAL, SPOOL, HOTTUB, ARCHITECHTURAL, ZEROENTRY, OCEANPOOLS
			case SQUARE: this.poolDesign = "SQUARE SHAPE POOL"; break;
			case TRIANGLE: this.poolDesign = "TRIANGLE SHAPE POOL"; break;
			case RECTANGLE: this.poolDesign = "RECTANGLE SHAPE POOL"; break;
			
			case CIRCLE: this.poolDesign = "CIRCULAR SWIMMING POOL"; break;
			case CUSTOM: this.poolDesign = "CUSTOM DESIGNED SWIMMING POOL"; break;
				
		}
		return this;
	}
	
	//Pool setLayout(PoolLayout poolLayout)
	//{
	//	this.poolLayout = poolLayout;
	//	return this;
	//}
	Pool addBase(PoolBase poolBase)
	{
		this.poolBase = poolBase;
		return this;
	}
	Pool fixSupportingStructure(SupportingStructure supoprtingStructure) {
		this.supportingStructure = supportingStructure;
		return this;
	}
	Pool addPlumbing(PoolPlumbing poolPlumbing)
	{
		this.poolPlumbing = poolPlumbing;
		return this;
	}
	Pool addElectrical(PoolElectrical poolElectrical)
	{
		this.poolElectrical = poolElectrical;
		return this;
	}
	Pool addBuildingMaterial(PoolBuildingMaterial poolBuildingMaterial)
	{
		this.poolBuildingMaterial = poolBuildingMaterial;
		return this;
	}
	Pool addInterior(PoolInterior poolInterior)
	{
		this.poolInterior = poolInterior;
		return this;
	}
	Pool poolStartUp(PoolStartUp poolStartUp)
	{
		this.poolStartUp = poolStartUp;
		return this;
	}
	Pool addDeck(PoolDeck poolDeck)
	{
		this.poolDeck = poolDeck;
		return this;
	}
	
	public void setName(String poolName) {
		this.poolName = poolName;
	}

	public String toString() {
		// Use a StringBuilder to build the string :-)
		// Like StringBuffer, but not synchronized
		StringBuilder display = new StringBuilder();
		display.append("---- " + this.poolName + " ----\n");
		//for (Wall wall : walls) {
		//	display.append("--- " + wall.name + " ---\n");
		//}
		display.append("--- " + this.poolType + "---\n");
		display.append("---" + this.category + "---\n");
		display.append("--- " + this.poolLayout + "---\n");
		display.append("--- " + this.poolBase + "---\n");
		display.append("--- " + this.poolPlumbing + "---\n");
		display.append("--- " + this.poolElectrical + "---\n");
		display.append("--- " + this.poolBuildingMaterial + "---\n");
		display.append("--- " + this.poolInterior + "---\n");
		display.append("--- " + this.poolStartUp + "---\n");
		display.append("--- " + this.poolDeck + "---\n");
		
		//for (Window window : windows) {
		//	display.append("--- " + window.name + " ---\n");
		//}
		//display.append("--- " + roof.name + " ---\n");
		return display.toString();
		
		// There is some difference of opinion about StringBuilder and whether it's using
		// the Builder pattern or not. Some say yes, some say no.
		// StringBuilder does not provide an abstract API with multiple subclasses for
		//   creating different representations (variations).
	}
}