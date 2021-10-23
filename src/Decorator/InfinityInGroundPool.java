package Decorator;
import Builder.Pool;
import Builder.PoolBuilder;
import Builder.InfinityInGroundPoolBuilder;
public class InfinityInGroundPool extends PoolDecorator{
	PoolBuilder InfinityInGroundPoolBuilder = new InfinityInGroundPoolBuilder();
	Pool InfinityInGroundPool = InfinityInGroundPoolBuilder.addBase().fixSupportingStructure().addPlumbing().addElectrical().addBuildingMaterial().addInterior().addDeck().build();
	
	public InfinityInGroundPool(Extras extras)
	{
		this.extras =extras;
	}
	@Override
	public String GetDescription() {
		// TODO Auto-generated method stub
		return extras.getDescription()+" added to Infinity In Ground Pool"; 
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return InfinityInGroundPool.getCost()+extras.cost();
	}
	

}
