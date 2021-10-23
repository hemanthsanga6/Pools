package Decorator;
import Builder.Pool;
import Builder.PoolBuilder;
import Builder.LapInGroundPoolBuilder;
public class LapInGroundPool extends PoolDecorator{
	PoolBuilder LapInGroundPoolBuilder = new LapInGroundPoolBuilder();
	Pool LapInGroundPool = LapInGroundPoolBuilder.addBase().fixSupportingStructure().addPlumbing().addElectrical().addBuildingMaterial().addInterior().addDeck().build();
	
	public LapInGroundPool(Extras extras)
	{
		this.extras =extras;
	}
	@Override
	public String GetDescription() {
		// TODO Auto-generated method stub
		return extras.getDescription()+" added to Lap In Ground Pool"; 
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return LapInGroundPool.getCost()+extras.cost();
	}
	

}
