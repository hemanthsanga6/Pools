package Decorator;
import Builder.Pool;
import Builder.PoolBuilder;
import Builder.InfinityAboveGroundPoolBuilder;
public class InfinityAboveGroundPool extends PoolDecorator{
	PoolBuilder InfinityAboveGroundPoolBuilder = new InfinityAboveGroundPoolBuilder();
	Pool InfinityAboveGroundPool = InfinityAboveGroundPoolBuilder.addBase().fixSupportingStructure().addPlumbing().addElectrical().addBuildingMaterial().addInterior().addDeck().build();
	
	public InfinityAboveGroundPool(Extras extras)
	{
		this.extras =extras;
	}
	@Override
	public String GetDescription() {
		// TODO Auto-generated method stub
		return extras.getDescription()+" added to Infinity Above Ground Pool"; 
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return InfinityAboveGroundPool.getCost()+extras.cost();
	}
	

}
