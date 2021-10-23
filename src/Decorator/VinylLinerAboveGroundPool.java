package Decorator;
import Builder.Pool;
import Builder.PoolBuilder;
import Builder.VinylLinerAboveGroundPoolBuilder;
public class VinylLinerAboveGroundPool extends PoolDecorator{
	PoolBuilder VinylLinerAboveGroundPoolBuilder = new VinylLinerAboveGroundPoolBuilder();
	Pool VinylLinerAboveGroundPool = VinylLinerAboveGroundPoolBuilder.addBase().fixSupportingStructure().addPlumbing().addElectrical().addBuildingMaterial().addInterior().addDeck().build();
	
	public VinylLinerAboveGroundPool(Extras extras)
	{
		this.extras =extras;
	}
	@Override
	public String GetDescription() {
		// TODO Auto-generated method stub
		return extras.getDescription()+" added to Vinyl Liner Above Ground Pool"; 
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return VinylLinerAboveGroundPool.getCost()+extras.cost();
	}
	

}
