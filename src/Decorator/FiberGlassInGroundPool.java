package Decorator;
import Builder.Pool;
import Builder.PoolBuilder;
import Builder.FiberGlassInGroundPoolBuilder;
public class FiberGlassInGroundPool extends PoolDecorator{
	PoolBuilder FiberGlassInGroundPoolBuilder = new FiberGlassInGroundPoolBuilder();
	Pool FiberGlassInGroundPool = FiberGlassInGroundPoolBuilder.addBase().fixSupportingStructure().addPlumbing().addElectrical().addBuildingMaterial().addInterior().addDeck().build();
	
	public FiberGlassInGroundPool(Extras extras)
	{
		this.extras =extras;
	}
	@Override
	public String GetDescription() {
		// TODO Auto-generated method stub
		return extras.getDescription()+" added to FiberGlass In Ground Pool"; 
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return FiberGlassInGroundPool.getCost()+extras.cost();
	}
	

}
