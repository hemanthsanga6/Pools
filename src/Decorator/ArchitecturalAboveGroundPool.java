package Decorator;
import Builder.Pool;
import Builder.PoolBuilder;
import Builder.ArchitecturalInGroundPoolBuilder;
public class ArchitecturalAboveGroundPool extends PoolDecorator{
	PoolBuilder ArchitecturalAboveGroundPoolBuilder = new ArchitecturalInGroundPoolBuilder();
	Pool ArchitecturalAboveGroundPool = ArchitecturalAboveGroundPoolBuilder.addBase().fixSupportingStructure().addPlumbing().addElectrical().addBuildingMaterial().addInterior().addDeck().build();
	
	public ArchitecturalAboveGroundPool(Extras extras)
	{
		this.extras =extras;
	}
	@Override
	public String GetDescription() {
		// TODO Auto-generated method stub
		return extras.getDescription()+" added to Architectural Above Ground Pool"; 
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return ArchitecturalAboveGroundPool.getCost()+extras.cost();
	}
	

}
