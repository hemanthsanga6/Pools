package Decorator;
import Builder.Pool;
import Builder.PoolBuilder;
import Builder.FiberGlassAboveGroundPoolBuilder;
public class FiberGlassAboveGroundPool extends PoolDecorator{
	PoolBuilder FiberGlassAboveGroundPoolBuilder = new FiberGlassAboveGroundPoolBuilder();
	Pool FiberGlassAboveGroundPool = FiberGlassAboveGroundPoolBuilder.addBase().fixSupportingStructure().addPlumbing().addElectrical().addBuildingMaterial().addInterior().addDeck().build();
	
	public FiberGlassAboveGroundPool(Extras extras)
	{
		this.extras =extras;
	}
	@Override
	public String GetDescription() {
		// TODO Auto-generated method stub
		return extras.getDescription()+" added to Fiber Glass Above Ground Pool"; 
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return FiberGlassAboveGroundPool.getCost()+extras.cost();
	}
	

}
