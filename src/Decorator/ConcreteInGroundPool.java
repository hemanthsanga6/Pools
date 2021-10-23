package Decorator;
import Builder.Pool;
import Builder.PoolBuilder;
import Builder.ConcreteInGroundPoolBuilder;
public class ConcreteInGroundPool extends PoolDecorator{
	PoolBuilder ConcreteInGroundPoolBuilder = new ConcreteInGroundPoolBuilder();
	Pool ConcreteInGroundPool = ConcreteInGroundPoolBuilder.addBase().fixSupportingStructure().addPlumbing().addElectrical().addBuildingMaterial().addInterior().addDeck().build();
	
	public ConcreteInGroundPool(Extras extras)
	{
		this.extras =extras;
	}
	@Override
	public String GetDescription() {
		// TODO Auto-generated method stub
		return extras.getDescription()+" added to Concete In Ground Pool"; 
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return ConcreteInGroundPool.getCost()+extras.cost();
	}
	

}
