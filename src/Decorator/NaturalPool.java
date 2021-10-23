package Decorator;
import Builder.Pool;
import Builder.PoolBuilder;
import Builder.NaturalPoolBuilder;
public class NaturalPool extends PoolDecorator{
	PoolBuilder NaturalPoolBuilder = new NaturalPoolBuilder();
	Pool NaturalPool = NaturalPoolBuilder.addBase().fixSupportingStructure().addPlumbing().addElectrical().addBuildingMaterial().addInterior().addDeck().build();
	
	public NaturalPool(Extras extras)
	{
		this.extras =extras;
	}
	@Override
	public String GetDescription() {
		// TODO Auto-generated method stub
		return extras.getDescription()+" added to Natural In Ground Pool"; 
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return NaturalPool.getCost()+extras.cost();
	}
}
