package Builder;

import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
public abstract class PoolBuilder {
	public static String description;
	String builderName;
	enum PoolType {
		INGROUND, ABOVEGROUND//  INFINITY, LAP, PLUNGE, NATURAL, SPOOL, HOTTUB, ARCHITECHTURAL, ZEROENTRY, OCEANPOOLS   
	}
	PoolType poolType;
	double PoolCost;
	enum Category
	{
		CONCRETE, FIBERGLASS, VINYLLINER, INFINITY, LAP, PLUNGE, NATURAL, SPOOL, HOTTUB, ARCHITECTURAL, ZEROENTRY, OCEANPOOLS
	}
	Category category;
	enum PoolLayout
	{
		SQUARE, TRIANGLE, RECTANGLE, CIRCLE , CUSTOM
	}
	PoolLayout poolLayout;
	
	Pool pool = new Pool();
	
	public void setPoolType(PoolType poolType) {
		this.poolType = poolType;
		pool.setPoolType(poolType);
	}
	public void setPoolCategory(Category category)
	{
		this.category = category;
		pool.setPoolCategory(category);
	}
	public void setPoolLayout(PoolLayout poolLayout)
	{
		this.poolLayout = poolLayout;
		pool.setPoolLayout(poolLayout);
	}
	
	double poolCost;
	public void setCost(double poolCost)
	{
		this.poolCost = poolCost;
		pool.setCost(poolCost);
	}
	public double getCost()
	{
		return PoolCost;
		
	}
	
	// Each method in the Builder returns the Builder so we can use the Fluent Interface Pattern
	//public abstract PoolBuilder setLayout();
	public String getDescription(Pool pool)
	{
		return pool.description;
	}
	public abstract PoolBuilder addBase();
	public abstract PoolBuilder fixSupportingStructure();
	public abstract PoolBuilder addPlumbing();
	public abstract PoolBuilder addElectrical();
	public abstract PoolBuilder addBuildingMaterial();
	public abstract PoolBuilder addInterior();
	public abstract PoolBuilder poolStartUp();
	public abstract PoolBuilder addDeck();
	//public abstract PoolBuilder addExtras();
	

	public Pool build() {
		System.out.println("Build the pool!");
		// Very simple build -- just return the house!
		// We've added all the parts... 
		// In a real build, we'd have to nail and screw everything together of course.
		// And add wiring and so on.
		return pool;
	}
}