package Decorator;
import Builder.Pool;
import Builder.PoolBuilder;
import Builder.LapAboveGroundPoolBuilder;
public class LapAboveGroundPool extends PoolDecorator{
	PoolBuilder LapAboveGroundPoolBuilder = new LapAboveGroundPoolBuilder();
	Pool LapAboveGroundPool = LapAboveGroundPoolBuilder.addBase().fixSupportingStructure().addPlumbing().addElectrical().addBuildingMaterial().addInterior().addDeck().build();
	
	public LapAboveGroundPool(Extras extras)
	{
		this.extras =extras;
	}
	@Override
	public String GetDescription() {
		// TODO Auto-generated method stub
		return extras.getDescription()+" added to Lap Above Ground Pool"; 
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return LapAboveGroundPool.getCost()+extras.cost();
	}
	

}
