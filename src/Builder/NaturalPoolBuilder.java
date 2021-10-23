package Builder;

import Builder.PoolBuilder.Category;
import Builder.PoolBuilder.PoolLayout;
import Builder.PoolBuilder.PoolType;

public class NaturalPoolBuilder extends PoolBuilder {
	String poolName;
	PoolBuilder.PoolType poolType;
	PoolBuilder.Category category;
	//PoolLayout poolLayout;
	PoolBuilder.PoolLayout poolLayout;
	
	String poolBase="Digging";
	
	String poolPlumbing = "Plants for filtration equipment";
	String poolElectrical = "Electrical Connections";
	
	String poolInterior = "Pebbles";
	String poolStartUp = "Water";
	String poolDeck = "Customized Rocks";
	
	String structuringMaterial = "Steel";
	String buildingMaterial = "Concrete";
	
	public NaturalPoolBuilder() {
		this.builderName = "Infinity In Ground Pool Builder";
		setPoolType(PoolType.INGROUND);
		setPoolCategory(Category.NATURAL);
		setPoolLayout(PoolLayout.CUSTOM);
		setCost(100000);
	}
	
	//public HouseBuilder addWalls() {
		// add exterior walls
		//for (int i = 0; i < numWalls; i++) {
			//System.out.println("Adding wall made out of " + wallMaterial);
			//house.addWall(new Wall(wallMaterial));
		//}
		//return this;
	//}
	
	
	
	@Override
	public PoolBuilder addBase() {
		// TODO Auto-generated method stub
		System.out.println("The construction of the pool starts by constructing the base by "+poolBase);
		pool.addBase(new PoolBase(poolBase));
		return this;
	}
	@Override
	public PoolBuilder fixSupportingStructure() {
		// TODO Auto-generated method stub
		System.out.println("The supporting structure is fixed by "+structuringMaterial);
		pool.fixSupportingStructure(new SupportingStructure(structuringMaterial));
		return this;
		
	}
	@Override
	public PoolBuilder addPlumbing() {
		// TODO Auto-generated method stub
		System.out.println("All the water in and out connections have been fixed and "+poolPlumbing+ " has been added");
		pool.addPlumbing(new PoolPlumbing(poolPlumbing));
		return this;
	}
	@Override
	public PoolBuilder addElectrical() {
		// TODO Auto-generated method stub
		System.out.println("All the "+ poolElectrical + " required for the pool have been fixed");
		pool.addElectrical(new PoolElectrical(poolElectrical));
		
		return this;
	}
	@Override
	public PoolBuilder addBuildingMaterial() {
		// TODO Auto-generated method stub
		System.out.println("The pool is constructed using "+ buildingMaterial);
		pool.addBuildingMaterial(new PoolBuildingMaterial(buildingMaterial));
		return this;
	}
	@Override
	public PoolBuilder addInterior() {
		// TODO Auto-generated method stub
		System.out.println("The interior of the pool is constructed with "+poolInterior);
		pool.addInterior(new PoolInterior(poolInterior));
		return this;
	}
	@Override
	public PoolBuilder poolStartUp() {
		// TODO Auto-generated method stub
		System.out.println(" The pool is constructed and is filled with "+poolStartUp);
		pool.poolStartUp(new PoolStartUp(poolStartUp));
		return this;
	}
	@Override
	public PoolBuilder addDeck() {
		// TODO Auto-generated method stub
		System.out.println(" The pool deck is constructed with "+poolDeck);
		pool.addDeck(new PoolDeck(poolDeck));
		return this;
	}
	public Pool build() {
		System.out.println("Pool layout is selected, base is digged, Steel is used as supporting structure, plumbing and electrical works are done, Concrete is added, interior is finished using pebbles, and deck has been added");
		return pool;
	}
}