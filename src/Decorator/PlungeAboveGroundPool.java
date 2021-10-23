package Decorator;
import Builder.Pool;
import Builder.PoolBuilder;
import Builder.PlungeAboveGroundPoolBuilder;
public class PlungeAboveGroundPool extends PoolDecorator{
	PoolBuilder PlungeAboveGroundPoolBuilder = new PlungeAboveGroundPoolBuilder();
	Pool PlungeAboveGroundPool = PlungeAboveGroundPoolBuilder.addBase().fixSupportingStructure().addPlumbing().addElectrical().addBuildingMaterial().addInterior().addDeck().build();
	
	public PlungeAboveGroundPool(Extras extras)
	{
		this.extras =extras;
	}
	@Override
	public String GetDescription() {
		// TODO Auto-generated method stub
		return extras.getDescription()+" added to Plunge Above Ground Pool"; 
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return PlungeAboveGroundPool.getCost()+extras.cost();
	}
	

}
