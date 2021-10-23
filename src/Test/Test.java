package Test;
import Builder.ArchitecturalAboveGroundPoolBuilder;
import Builder.ArchitecturalInGroundPoolBuilder;
import Builder.ConcreteInGroundPoolBuilder;
import Builder.FiberGlassAboveGroundPoolBuilder;
import Builder.FiberGlassInGroundPoolBuilder;
import Builder.HottubPoolBuilder;
import Builder.InfinityAboveGroundPoolBuilder;
import Builder.InfinityInGroundPoolBuilder;
import Builder.LapAboveGroundPoolBuilder;
import Builder.LapInGroundPoolBuilder;
import Builder.NaturalPoolBuilder;
import Builder.OceanPoolBuilder;
import Builder.PlungeAboveGroundPoolBuilder;
import Builder.PlungeInGroundPoolBuilder;
import Builder.Pool;
import Builder.PoolBase;
import Builder.PoolBuilder;
import Builder.PoolBuildingMaterial;
import Builder.PoolDeck;
import Builder.PoolElectrical;
import Builder.PoolInterior;
import Builder.PoolLayout;
import Builder.PoolPlumbing;
import Builder.PoolStartUp;
import Builder.SpoolPoolBuilder;
import Builder.SupportingStructure;
import Builder.VinylLinerAboveGroundPoolBuilder;
import Builder.VinylLinerInGroundPoolBuilder;
import Builder.ZeroEntryPoolBuilder;
import Decorator.ArchitecturalAboveGroundPool;
import Decorator.ArchitecturalInGroundPool;
import Decorator.ConcreteInGroundPool;
import Decorator.Cover;
import Decorator.DivingBoards;
import Decorator.Extras;
import Decorator.FiberGlassAboveGroundPool;
import Decorator.FiberGlassInGroundPool;
import Decorator.Firepit;
import Decorator.Fountain;
import Decorator.Heater;
import Decorator.HottubPool;
import Decorator.InfinityAboveGroundPool;
import Decorator.InfinityInGroundPool;
import Decorator.JetSpray;
import Decorator.Ladders;
import Decorator.LapAboveGroundPool;
import Decorator.LapInGroundPool;
import Decorator.Lounge;
import Decorator.NaturalPool;
import Decorator.OceanPool;
import Decorator.PlungeAboveGroundPool;
import Decorator.PlungeInGroundPool;
import Decorator.PoolDecorator;
import Decorator.Ramp;
import Decorator.Skimmers;
import Decorator.Speakers;
import Decorator.SpoolPool;
import Decorator.TanningLedge;
import Decorator.VinylLinerAboveGroundPool;
import Decorator.VinylLinerInGroundPool;
import Decorator.WaterSlide;
import Decorator.ZeroEntryPool;
import Factory.Questionnaire;
import Factory.AboutPools;
import Factory.UserPool;
import Observer.extrasUsers;
import Observer.Inventory;
import Observer.Subject;

import java.util.*;

public class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Swimming pools\n");
		System.out.println("Do you wanna know more about swimming pools?\n");
		System.out.println("Enter y or n");
		char c=sc.next().charAt(0);
		if(c=='y')
		{
			AboutPools aboutPools = new AboutPools();
			aboutPools.aboutPools();
		}
		System.out.println("\nDo you want us to select the perfect pool depending on all the factors? \n");
		System.out.println("press y or n\n");
		char d = sc.next().charAt(0);
		if(d=='y')
		{
			Questionnaire questionnaire = new Questionnaire();
			questionnaire.Questions();
			questionnaire.result();
		}
		System.out.println("Do you have a specific pool in mind?\n");
		System.out.println("Enter y or n\n");
		char p = sc.next().charAt(0);
		if(p=='y')
		{
		Questionnaire questionnaire = new Questionnaire();
		questionnaire.userChoice();
		}
		System.out.println("Do you want any amenities added to the pool?\n");
		char a =sc.next().charAt(0);
		if(a=='y')
		extras();
		
		Observer();
	}
	public static void extras()
	{
		Decorator.Extras e = new Heater();
		e=new ConcreteInGroundPool(e);
		System.out.println(e.getDescription() 
				+ " $" + e.cost());
	}
	public static void Observer()
	{
		 Subject sanga = new Subject();
	        
	        extrasUsers user1 = new extrasUsers("user1");
	        sanga.registerUser(user1);
	        user1.registerUser(sanga);
	        sanga.setCount(2);
	        
	        
	}
	
}