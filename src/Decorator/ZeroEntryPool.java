package Decorator;
import Builder.Pool;
import Builder.PoolBuilder;
import Builder.ZeroEntryPoolBuilder;
public class ZeroEntryPool extends PoolDecorator{
	PoolBuilder ZeroEntryPoolBuilder = new ZeroEntryPoolBuilder();
	Pool ZeroEntryPool = ZeroEntryPoolBuilder.addBase().fixSupportingStructure().addPlumbing().addElectrical().addBuildingMaterial().addInterior().addDeck().build();
	
	public ZeroEntryPool(Extras extras)
	{
		this.extras =extras;
	}
	@Override
	public String GetDescription() {
		// TODO Auto-generated method stub
		return extras.getDescription()+" added to Zero Entry In Ground Pool"; 
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return ZeroEntryPool.getCost()+extras.cost();
	}
	

}
