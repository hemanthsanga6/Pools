package Decorator;
import Builder.Pool;
import Builder.PoolBuilder;
import Builder.SpoolPoolBuilder;
public class SpoolPool extends PoolDecorator{
	PoolBuilder SpoolPoolBuilder = new SpoolPoolBuilder();
	Pool SpoolPool = SpoolPoolBuilder.addBase().fixSupportingStructure().addPlumbing().addElectrical().addBuildingMaterial().addInterior().addDeck().build();
	
	public SpoolPool(Extras extras)
	{
		this.extras =extras;
	}
	@Override
	public String GetDescription() {
		// TODO Auto-generated method stub
		return extras.getDescription()+" added to Spool In Ground Pool"; 
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return SpoolPool.getCost()+extras.cost();
	}
	

}
