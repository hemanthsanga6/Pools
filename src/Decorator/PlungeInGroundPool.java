package Decorator;
import Builder.Pool;
import Builder.PoolBuilder;
import Builder.PlungeInGroundPoolBuilder;
public class PlungeInGroundPool extends PoolDecorator{
	PoolBuilder PlungeInGroundPoolBuilder = new PlungeInGroundPoolBuilder();
	Pool PlungeInGroundPool = PlungeInGroundPoolBuilder.addBase().fixSupportingStructure().addPlumbing().addElectrical().addBuildingMaterial().addInterior().addDeck().build();
	
	public PlungeInGroundPool(Extras extras)
	{
		this.extras =extras;
	}
	@Override
	public String GetDescription() {
		// TODO Auto-generated method stub
		return extras.getDescription()+" added to Plunge In Ground Pool"; 
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return PlungeInGroundPool.getCost()+extras.cost();
	}
	

}
