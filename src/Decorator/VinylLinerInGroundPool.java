package Decorator;
import Builder.Pool;
import Builder.PoolBuilder;
import Builder.VinylLinerInGroundPoolBuilder;
public class VinylLinerInGroundPool extends PoolDecorator{
	PoolBuilder VinylLinerInGroundPoolBuilder = new VinylLinerInGroundPoolBuilder();
	Pool VinylLinerInGroundPool = VinylLinerInGroundPoolBuilder.addBase().fixSupportingStructure().addPlumbing().addElectrical().addBuildingMaterial().addInterior().addDeck().build();
	
	public VinylLinerInGroundPool(Extras extras)
	{
		this.extras =extras;
	}
	@Override
	public String GetDescription() {
		// TODO Auto-generated method stub
		return extras.getDescription()+" added to Vinyl Liner In Ground Pool"; 
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return VinylLinerInGroundPool.getCost()+extras.cost();
	}
}
