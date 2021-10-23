package Decorator;
import Builder.Pool;
import Builder.PoolBuilder;
import Builder.ArchitecturalInGroundPoolBuilder;
public class ArchitecturalInGroundPool extends PoolDecorator{
	PoolBuilder ArchitecturalInGroundPoolBuilder = new ArchitecturalInGroundPoolBuilder();
	Pool ArchitecturalInGroundPool = ArchitecturalInGroundPoolBuilder.addBase().fixSupportingStructure().addPlumbing().addElectrical().addBuildingMaterial().addInterior().addDeck().build();
	
	public ArchitecturalInGroundPool(Extras extras)
	{
		this.extras =extras;
	}
	@Override
	public String GetDescription() {
		// TODO Auto-generated method stub
		return extras.getDescription()+" added to Architectural In Ground Pool"; 
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return ArchitecturalInGroundPool.getCost()+extras.cost();
	}
	

}
