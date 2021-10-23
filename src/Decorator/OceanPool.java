package Decorator;
import Builder.Pool;
import Builder.PoolBuilder;
import Builder.OceanPoolBuilder;
public class OceanPool extends PoolDecorator{
	PoolBuilder OceanPoolBuilder = new OceanPoolBuilder();
	Pool OceanPool = OceanPoolBuilder.addBase().fixSupportingStructure().addPlumbing().addElectrical().addBuildingMaterial().addInterior().addDeck().build();
	
	public OceanPool(Extras extras)
	{
		this.extras =extras;
	}
	@Override
	public String GetDescription() {
		// TODO Auto-generated method stub
		return extras.getDescription()+" added to Ocean Pool"; 
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return OceanPool.getCost()+extras.cost();
	}
}
