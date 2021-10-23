package Factory;
import java.util.*;
import Builder.Pool;
import Builder.PoolBuilder;
import Builder.ConcreteInGroundPoolBuilder;
import Builder.FiberGlassInGroundPoolBuilder;
import Builder.VinylLinerInGroundPoolBuilder;
import Builder.InfinityInGroundPoolBuilder;
import Builder.LapInGroundPoolBuilder;
import Builder.PlungeInGroundPoolBuilder;
import Builder.NaturalPoolBuilder;
import Builder.SpoolPoolBuilder;
import Builder.ArchitecturalInGroundPoolBuilder;
import Builder.ZeroEntryPoolBuilder;
import Builder.OceanPoolBuilder;
import Builder.FiberGlassAboveGroundPoolBuilder;
import Builder.VinylLinerAboveGroundPoolBuilder;
import Builder.InfinityAboveGroundPoolBuilder;
import Builder.LapAboveGroundPoolBuilder;
import Builder.PlungeAboveGroundPoolBuilder;
import Builder.HottubPoolBuilder;
import Builder.ArchitecturalAboveGroundPoolBuilder;


public class UserPool
{
	String userChoice;
	public Pool userPool(String userChoice)
	{
		Pool pool = userPool(userChoice);
		{
			if(userChoice=="ConcreteInGroundPool")
			{
				PoolBuilder ConcreteInGroundPoolBuilder = new ConcreteInGroundPoolBuilder();
				Pool concreteInGroundPool = ConcreteInGroundPoolBuilder.addBase().fixSupportingStructure().addPlumbing().addElectrical().addBuildingMaterial().addInterior().poolStartUp().addDeck().build();
				System.out.println(concreteInGroundPool);
			}
			else if(userChoice=="FiberGlassInGroundPool")
			{
				PoolBuilder FiberGlassInGroundPoolBuilder = new FiberGlassInGroundPoolBuilder();
				Pool fiberGlassInGroundPool = FiberGlassInGroundPoolBuilder.addBase().fixSupportingStructure().addPlumbing().addElectrical().addBuildingMaterial().addInterior().poolStartUp().addDeck().build();
				System.out.println(fiberGlassInGroundPool);
			}
			else if(userChoice=="VinylLinerInGroundPool")
			{
				PoolBuilder VinylLinerInGroundPoolBuilder = new VinylLinerInGroundPoolBuilder();
				Pool vinylLinerInGroundPool = VinylLinerInGroundPoolBuilder.addBase().fixSupportingStructure().addPlumbing().addElectrical().addBuildingMaterial().addInterior().poolStartUp().addDeck().build();
				System.out.println(vinylLinerInGroundPool);
			}
			else if(userChoice=="InfinityInGroundPool")
			{
				PoolBuilder InfinityInGroundPoolBuilder = new InfinityInGroundPoolBuilder();
				Pool infinityInGroundPool = InfinityInGroundPoolBuilder.addBase().fixSupportingStructure().addPlumbing().addElectrical().addBuildingMaterial().addInterior().poolStartUp().addDeck().build();
				System.out.println(infinityInGroundPool);
			}
			else if(userChoice=="LapInGroundPool")
			{
				PoolBuilder LapInGroundPoolBuilder = new LapInGroundPoolBuilder();
				Pool lapInGroundPool = LapInGroundPoolBuilder.addBase().fixSupportingStructure().addPlumbing().addElectrical().addBuildingMaterial().addInterior().poolStartUp().addDeck().build();
				System.out.println(lapInGroundPool);
			}
			else if(userChoice=="PlungeInGroundPool")
			{
				PoolBuilder PlungeInGroundPoolBuilder = new PlungeInGroundPoolBuilder();
				Pool plungeInGroundPool = PlungeInGroundPoolBuilder.addBase().fixSupportingStructure().addPlumbing().addElectrical().addBuildingMaterial().addInterior().poolStartUp().addDeck().build();
				System.out.println(plungeInGroundPool);
			}
			else if(userChoice=="NaturalPool")
			{
				PoolBuilder NaturalPoolBuilder = new NaturalPoolBuilder();
				Pool naturalPool = NaturalPoolBuilder.addBase().fixSupportingStructure().addPlumbing().addElectrical().addBuildingMaterial().addInterior().poolStartUp().addDeck().build();
				System.out.println(naturalPool);
			}
			else if(userChoice=="SpoolPool")
			{
				PoolBuilder SpoolPoolBuilder = new SpoolPoolBuilder();
				Pool spoolPool = SpoolPoolBuilder.addBase().fixSupportingStructure().addPlumbing().addElectrical().addBuildingMaterial().addInterior().poolStartUp().addDeck().build();
				System.out.println(spoolPool);
			}
			else if(userChoice=="ArchitecturalInGroundPool")
			{
				PoolBuilder ArchitecturalInGroundPoolBuilder = new ArchitecturalInGroundPoolBuilder();
				Pool architecturalInGroundPool = ArchitecturalInGroundPoolBuilder.addBase().fixSupportingStructure().addPlumbing().addElectrical().addBuildingMaterial().addInterior().poolStartUp().addDeck().build();
				System.out.println(architecturalInGroundPool);
			}
			else if(userChoice=="ZeroEntryPool")
			{
				PoolBuilder ZeroEntryPoolBuilder = new ZeroEntryPoolBuilder();
				Pool zeroEntryPool = ZeroEntryPoolBuilder.addBase().fixSupportingStructure().addPlumbing().addElectrical().addBuildingMaterial().addInterior().poolStartUp().addDeck().build();
				System.out.println(zeroEntryPool);
			}
			else if(userChoice=="OceanPool")
			{
				PoolBuilder OceanPoolBuilder = new OceanPoolBuilder();
				Pool oceanPool = OceanPoolBuilder.addBase().fixSupportingStructure().addPlumbing().addElectrical().addBuildingMaterial().addInterior().poolStartUp().addDeck().build();
				System.out.println(oceanPool);
			}
			else if(userChoice=="FiberGlassAboveGroundPool")
			{
				PoolBuilder FiberGlassAboveGroundPoolBuilder = new FiberGlassAboveGroundPoolBuilder();
				Pool fiberGlassAboveGroundPool = FiberGlassAboveGroundPoolBuilder.addBase().fixSupportingStructure().addPlumbing().addElectrical().addBuildingMaterial().addInterior().poolStartUp().addDeck().build();
				System.out.println(fiberGlassAboveGroundPool);
			}
			else if(userChoice=="VinylLinerAboveGroundPool")
			{
				PoolBuilder VinylLinerAboveGroundPoolBuilder = new VinylLinerAboveGroundPoolBuilder();
				Pool vinylLinerAboveGroundPool = VinylLinerAboveGroundPoolBuilder.addBase().fixSupportingStructure().addPlumbing().addElectrical().addBuildingMaterial().addInterior().poolStartUp().addDeck().build();
				System.out.println(vinylLinerAboveGroundPool);
			}
			else if(userChoice=="InfinityAboveGroundPool")
			{
				PoolBuilder InfinityAboveGroundPoolBuilder = new InfinityAboveGroundPoolBuilder();
				Pool infinityAboveGroundPool = InfinityAboveGroundPoolBuilder.addBase().fixSupportingStructure().addPlumbing().addElectrical().addBuildingMaterial().addInterior().poolStartUp().addDeck().build();
				System.out.println(infinityAboveGroundPool);
			}
			else if(userChoice=="LapAboveGroundPoolBuilder")
			{
				PoolBuilder LapAboveGroundPoolBuilder = new LapAboveGroundPoolBuilder();
				Pool lapAboveGroundPool = LapAboveGroundPoolBuilder.addBase().fixSupportingStructure().addPlumbing().addElectrical().addBuildingMaterial().addInterior().poolStartUp().addDeck().build();
				System.out.println(lapAboveGroundPool);
			}
			else if(userChoice=="PlungeAboveGroundPool")
			{
				PoolBuilder PlungeAboveGroundPoolBuilder = new PlungeAboveGroundPoolBuilder();
				Pool plungeAboveGroundPool = PlungeAboveGroundPoolBuilder.addBase().fixSupportingStructure().addPlumbing().addElectrical().addBuildingMaterial().addInterior().poolStartUp().addDeck().build();
				System.out.println(plungeAboveGroundPool);
			}
			else if(userChoice=="HottubPool")
			{
				PoolBuilder HottubPoolBuilder = new HottubPoolBuilder();
				Pool hottubPool = HottubPoolBuilder.addBase().fixSupportingStructure().addPlumbing().addElectrical().addBuildingMaterial().addInterior().poolStartUp().addDeck().build();
				System.out.println(hottubPool);
			}
			else if(userChoice=="ArchitecturalAboveGroundPool")
			{
				PoolBuilder ArchitecturalAboveGroundPoolBuilder = new ArchitecturalAboveGroundPoolBuilder();
				Pool architecturalAboveGroundPool = ArchitecturalAboveGroundPoolBuilder.addBase().fixSupportingStructure().addPlumbing().addElectrical().addBuildingMaterial().addInterior().poolStartUp().addDeck().build();
				System.out.println(architecturalAboveGroundPool);
			}
		}
		return pool;
	}
	
}