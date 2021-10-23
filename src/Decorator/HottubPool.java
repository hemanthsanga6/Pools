package Decorator;
import Builder.Pool;
import Builder.PoolBuilder;
import Builder.HottubPoolBuilder;
public class HottubPool extends PoolDecorator{
	PoolBuilder HottubPoolBuilder = new HottubPoolBuilder();
	Pool HottubPool = HottubPoolBuilder.addBase().fixSupportingStructure().addPlumbing().addElectrical().addBuildingMaterial().addInterior().addDeck().build();
	
	public HottubPool(Extras extras)
	{
		this.extras =extras;
	}
	@Override
	public String GetDescription() {
		// TODO Auto-generated method stub
		return extras.getDescription()+" added to Hottub Pool"; 
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return HottubPool.getCost()+extras.cost();
	}
	

}
