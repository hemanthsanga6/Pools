package Factory;

import Builder.Pool;
import java.util.*;
public class Questionnaire {
String activityResult;
String costResult;
String typeResult;
String maintananceResult;
String shapeResult;
String userResult;
String locationResult;
String accessabilityResult;
String extrasResult;
String termResult;
String durationResult;
String userChoice;
List<String> poolList= new ArrayList<String>();
List<String> result = new ArrayList<String>();
List<String> activityPool = new ArrayList<String>();
List<String> costPool = new ArrayList<String>();
List<String> maintanancePool = new ArrayList<String>();
List<String> shapePool = new ArrayList<String>();
List<String> userTypePool = new ArrayList<String>();
List<String> locationPool = new ArrayList<String>();
List<String> termPool = new ArrayList<String>();
List<String> durationPool = new ArrayList<String>();
List<String> typePool = new ArrayList<String>();
public void poolList() {
	poolList.add("ConcreteInGroundPool");
	poolList.add("FiberGlassInGroundPool");
	poolList.add("VinylLinerInGroundPool");
	poolList.add("InfinityInGroundPool");
	poolList.add("LapInGroundPool");
	poolList.add("PlungeInGroundPool");
	poolList.add("NaturalPool");
	poolList.add("SpoolPool");
	poolList.add("ArchitecturalInGroundPool");
	poolList.add("ZeroEntryInGroundPool");
	poolList.add("OceanPool");
	poolList.add("FiberGlassAboveGroundPool");
	poolList.add("VinylLinerAboveGroundPool");
	poolList.add("InfinityAboveGroundPool");
	poolList.add("LapAboveGroundPool");
	poolList.add("PlungeAboveGroundPool");
	poolList.add("HottubPool");
	poolList.add("ArchitecturalAboveGroundPool");
}

Scanner sc =  new Scanner(System.in);

public void activityQuestion()
{
	System.out.println("What is the primary activity purpose for the pool? \n");
	System.out.println("relaxation(r) hydrotherapy(h) plunge(p) laps(l) diving(d) \n");
	System.out.println("Enter the corresponding options : ");
	char activityChoice = sc.next().charAt(0);
	
	{
		if(activityChoice=='r')
		{	
			System.out.println("You have selected primary activity of swimming pool as relaxation\n");
			activityResult = "relaxation";
			activityPool.add("ConcreteInGroundPool");
			activityPool.add("FiberGlassInGroundPool");
			activityPool.add("VinylLinerInGroundPool");
			activityPool.add("InfinityInGroundPool");
			activityPool.add("NaturalPool");
			activityPool.add("ArchitecturalInGroundPool");
			activityPool.add("ZeroEntryGroundPool");
			activityPool.add("OceanPool");
			activityPool.add("FiberGlassAboveGroundPool");
			activityPool.add("VinylLinerInGroundPool");
			activityPool.add("InfinityAboveGroundPool");
			activityPool.add("ArchitecturalAboveGroundPool");
		}
		else if(activityChoice=='h')
		{	
			System.out.println("You have selected primary activity of swimming pool as hydrotherapy\n");
			activityResult = "hydrotherapy";
			activityPool.add("SpoolPool");
			activityPool.add("HottubPool");
		}
		else if(activityChoice=='p')
		{	
			System.out.println("You have selected primary activity of swimming pool as plunge\n");
			activityResult = "plunge";
			activityPool.add("PlungeInGroundPool");
			activityPool.add("PlungeAboveGroundPool");
		}
		else if(activityChoice=='l')
		{	
			System.out.println("You have selected primary activity of swimming pool as laps practice\n");
			activityResult = "laps";
			activityPool.add("LapInGroundPool");
			activityPool.add("LapAboveGroundPool");
		
		}
		else if(activityChoice=='d')
		{	
			System.out.println("You have selected primary activity of swimming pool as diving\n");
			activityResult = "diving";
			activityPool.add("ConcreteInGroundPool");
			activityPool.add("ArchitecturalInGroundPool");
		}
		else
		{	
			System.out.println("You have not selected primary activity with the corresponding choices, try lower case and please select again\n");
			activityQuestion();
		}
	}	
}
public void costRangeQuestion()
{
	System.out.println("What is the estimated budget for the pool? \n");
	System.out.println("basic-under 10k(b) moderate-10k to 30k(m) high-30k to 50k(h) luxury-50k to 100k(l) dream-above 100k(d) \n");
	System.out.println("Enter the corresponding options : \n");
	char costChoice = sc.next().charAt(0);
	{
		if(costChoice=='b')
		{	
			System.out.println("You have selected basic budget which is under $10000 for the swimming pool\n");
			costResult = "basic";
			costPool.add("FiberGlassAboveGroundPool");
			costPool.add("VinylLinerAboveGroundPool");
			costPool.add("PlungeAboveGroundPool");
			costPool.add("HottubPool");
		}
		else if(costChoice=='m')
		{	
			System.out.println("You have selected moderate budget which is $10000 to $30000 for the swimming pool\n");
			costResult = "moderate";
			costPool.add("FiberGlassInGroundPool");
			costPool.add("VinylLinerInGroundPool");
			costPool.add("PlungeInGroundPool");
			costPool.add("SpoolPool");
			costPool.add("LapAboveGroundPool");
		}
		else if(costChoice=='h')
		{	
			System.out.println("You have selected high budget which is $30000 to $50000 for the swimming pool\n");
			costResult = "high";
			costPool.add("ConcreteInGroundPool");
			costPool.add("InfinityInGroundPool");
			costPool.add("LapInGroundPool");
			costPool.add("ZeroEntryPool");
			costPool.add("InfinityAboveGroundPool");
		}
		else if(costChoice=='l')
		{	
			System.out.println("You have selected luxury budget which is $50000 to $100000 for the swimming pool\n");
			costResult = "luxury";
			costPool.add("NaturalPool");
			costPool.add("OceanPool");
			costPool.add("ArchitecturalAboveGroundPool");
		}
		else if(costChoice=='d')
		{	
			System.out.println("You have selected dream budget which is $100000 and above for the swimming pool\n");
			costResult = "dream";
			costPool.add("ArchitecturalInGroundPool");
		}
		else
		{	
			System.out.println("You have not selected the corresponding choices, try lower case and please select again\n");
			costRangeQuestion();
		}
	}	
}
public void typeQuestion()
{
	System.out.println("Do you want the pool to be above ground or in ground? \n");
	System.out.println("select 'i' for in ground and 'a' for above ground \n");
	System.out.println("Enter the corresponding options : \n");
	char typeChoice = sc.next().charAt(0);
	{
		if(typeChoice=='i')
		{	
			System.out.println("You have selected an in ground swimming pool\n");
			typeResult = "inGround";
			typePool.add("ConcreteInGroundPool");
			typePool.add("FiberGlassInGroundPool");
			typePool.add("VinylLinerInGroundPool");
			typePool.add("InfinityInGroundPool");
			typePool.add("LapInGroundPool");
			typePool.add("PlungeInGroundPool");
			typePool.add("NaturalPool");
			typePool.add("SpoolPool");
			typePool.add("ArchitecturalInGroundPool");
			typePool.add("ZeroEntryInGroundPool");
			typePool.add("OceanPool");
			
		}
		else if(typeChoice=='a')
		{	
			System.out.println("You have selected an above ground swimming pool\n");
			typeResult = "aboveGround";
			typePool.add("FiberGlassAboveGroundPool");
			typePool.add("VinylLinerAboveGroundPool");
			typePool.add("InfinityAboveGroundPool");
			typePool.add("LapAboveGroundPool");
			typePool.add("PlungeAboveGroundPool");
			typePool.add("HottubPool");
			typePool.add("ArchitecturalAboveGroundPool");
		}
		else
		{	
			System.out.println("You have not selected the corresponding choices, try lower case and please select again\n");
			typeQuestion();
		}
	}	
}
public void maintananceQuestion()
{
	System.out.println("What maintanance requirement are you expecting for the pool? \n");
	System.out.println("less(l) moderate(m) high(h)\n");
	System.out.println("Enter the corresponding options : \n");
	char maintananceChoice = sc.next().charAt(0);
	{
		if(maintananceChoice=='l')
		{	
			System.out.println("You have selected basic maintanance for the swimming pool\n");
			maintananceResult = "basic";
			maintanancePool.add("FiberGlassInGroundPool");
			maintanancePool.add("LapInGroundPool");
			maintanancePool.add("PlungeInGroundPool");
			maintanancePool.add("SpoolPool");
			maintanancePool.add("HottubPool");
		}
		else if(maintananceChoice=='m')
		{	
			System.out.println("You have selected moderate maintanance for the swimming pool\n");
			maintananceResult = "moderate";
			maintananceResult = "basic";
			maintanancePool.add("ConcreteInGroundPool");
			maintanancePool.add("ArchitecturalInGroundPool");
			maintanancePool.add("ZeroEntryInGroundPool");
			maintanancePool.add("OceanPool");
			
		}
		else if(maintananceChoice=='h')
		{	
			System.out.println("You have selected high maintanance for the swimming pool\n");
			maintananceResult = "high";
			maintananceResult = "basic";
			maintanancePool.add("VinylLinerInGroundPool");
			maintanancePool.add("InfinityInGroundPool");
			maintanancePool.add("FiberGlassAboveGroundPool");
			maintanancePool.add("VinylLinerAboveGroundPool");
			maintanancePool.add("InfinityAboveGroundPool");
			maintanancePool.add("LapAboveGroundPool");
			maintanancePool.add("PlungeAboveGroundPool");
			maintanancePool.add("ArchitecturalAboveGroundPool");
		}
		else
		{	
			System.out.println("You have not selected the corresponding choices, try lower case and please select again\n");
			maintananceQuestion();
		}
	}	
}
public void shapeQuestion()
{
	System.out.println("What design you want for the pool? \n");
	System.out.println("circle(c) rectangular(r) square(s) triangle(t) custom(c) \n");
	System.out.println("Enter the corresponding options : \n");
	char shapeChoice = sc.next().charAt(0);
	{
		if(shapeChoice=='c')
		{	
			System.out.println("You selected circle as the layout for the swimming pool\n");
			shapeResult = "circle";
			shapePool.add("ConcreteInGroundPool");
			shapePool.add("FiberGlassInGroundPool");
			shapePool.add("VinylLinerInGroundPool");
			shapePool.add("PlungeInGroundPool");
			shapePool.add("NaturalPool");
			shapePool.add("SpoolPool");
			shapePool.add("ArchitecturalInGroundPool");
			shapePool.add("OceanPool");
			shapePool.add("FiberGlassAboveGroundPool");
			shapePool.add("VinylLinerAboveGroundPool");
			shapePool.add("PlungeAboveGroundPool");
			shapePool.add("HottubPool");
			shapePool.add("ArchitecturalAboveGroundPool");
		}
		else if(shapeChoice=='r')
		{	
			System.out.println("You selected rectangle as the layout for the swimming pool\n");
			shapeResult = "rectangle";
			shapePool.add("ConcreteInGroundPool");
			shapePool.add("FiberGlassInGroundPool");
			shapePool.add("VinylLinerInGroundPool");
			shapePool.add("InfinityInGroundPool");
			shapePool.add("LapInGroundPool");
			shapePool.add("PlungeInGroundPool");
			shapePool.add("NaturalPool");
			shapePool.add("SpoolPool");
			shapePool.add("ArchitecturalInGroundPool");
			shapePool.add("ZeroEntryInGroundPool");
			shapePool.add("OceanPool");
			shapePool.add("FiberGlassAboveGroundPool");
			shapePool.add("VinylLinerAboveGroundPool");
			shapePool.add("InfinityAboveGroundPool");
			shapePool.add("LapAboveGroundPool");
			shapePool.add("PlungeAboveGroundPool");
			shapePool.add("HottubPool");
			shapePool.add("ArchitecturalAboveGroundPool");
		}
		else if(shapeChoice=='s')
		{	
			System.out.println("You selected square as the layout for the swimming pool\n");
			shapeResult = "square";
			shapePool.add("ConcreteInGroundPool");
			shapePool.add("FiberGlassInGroundPool");
			shapePool.add("VinylLinerInGroundPool");
			shapePool.add("InfinityInGroundPool");
			shapePool.add("LapInGroundPool");
			shapePool.add("PlungeInGroundPool");
			shapePool.add("NaturalPool");
			shapePool.add("SpoolPool");
			shapePool.add("ArchitecturalInGroundPool");
			shapePool.add("ZeroEntryInGroundPool");
			shapePool.add("OceanPool");
			shapePool.add("FiberGlassAboveGroundPool");
			shapePool.add("VinylLinerAboveGroundPool");
			shapePool.add("InfinityAboveGroundPool");
			shapePool.add("LapAboveGroundPool");
			shapePool.add("PlungeAboveGroundPool");
			shapePool.add("HottubPool");
			shapePool.add("ArchitecturalAboveGroundPool");
		}
		else if(shapeChoice=='t')
		{	
			System.out.println("You selected triangle layout for the swimming pool\n");
			shapeResult = "triangle";
			shapePool.add("ConcreteInGroundPool");
			shapePool.add("FiberGlassInGroundPool");
			shapePool.add("VinylLinerInGroundPool");
			shapePool.add("PlungeInGroundPool");
			shapePool.add("NaturalPool");
			shapePool.add("SpoolPool");
			shapePool.add("ArchitecturalInGroundPool");
			shapePool.add("OceanPool");
			shapePool.add("FiberGlassAboveGroundPool");
			shapePool.add("VinylLinerAboveGroundPool");
			shapePool.add("PlungeAboveGroundPool");
			shapePool.add("HottubPool");
			shapePool.add("ArchitecturalAboveGroundPool");
		}
		else if(shapeChoice=='c')
		{	
			System.out.println("You have selected custom layout for the swimming pool\n");
			shapeResult = "custom";
			shapePool.add("ConcreteInGroundPool");
			shapePool.add("FiberGlassInGroundPool");
			shapePool.add("VinylLinerInGroundPool");
			shapePool.add("PlungeInGroundPool");
			shapePool.add("NaturalPool");
			shapePool.add("SpoolPool");
			shapePool.add("ArchitecturalInGroundPool");
			shapePool.add("OceanPool");
			shapePool.add("ArchitecturalAboveGroundPool");
			
		}
		else
		{	
			System.out.println("You have not selected the corresponding choices, try lower case and please select again\n");
			shapeQuestion();
		}
	}	
}
public void userQuestion()
{
	System.out.println("Who are the primary users for the pool? \n");
	System.out.println("children(c) elderly(e) middleAged(m) athletes(a)\n");
	System.out.println("Enter the corresponding options : \n");
	char userChoice = sc.next().charAt(0);
	{
		if(userChoice=='c')
		{	
			System.out.println("You have selected children as the primary users of the swimming pool\n");
			userResult = "children";
			userTypePool.add("ConcreteInGroundPool");
			userTypePool.add("FiberGlassInGroundPool");
			userTypePool.add("VinylLinerInGroundPool");
			userTypePool.add("NaturalPool");
			userTypePool.add("SpoolPool");
			userTypePool.add("ArchitecturalInGroundPool");
			userTypePool.add("ZeroEntryPool");
			userTypePool.add("FiberGlassAboveGroundPool");
			userTypePool.add("VinylLinerAboveGroundPool");
			userTypePool.add("HottubPool");
			userTypePool.add("ArchitecturalAboveGroundPool");
			
		}
		else if(userChoice=='e')
		{	
			System.out.println("You have selected elders as the primary users of the swimming pool\n");
			userResult = "elderly";
			userTypePool.add("ConcreteInGroundPool");
			userTypePool.add("FiberGlassInGroundPool");
			userTypePool.add("VinylLinerInGroundPool");
			userTypePool.add("NaturalPool");
			userTypePool.add("SpoolPool");
			userTypePool.add("ArchitecturalInGroundPool");
			userTypePool.add("ZeroEntryPool");
			userTypePool.add("FiberGlassAboveGroundPool");
			userTypePool.add("VinylLinerAboveGroundPool");
			userTypePool.add("HottubPool");
			userTypePool.add("ArchitecturalAboveGroundPool");
		}
		else if(userChoice=='m')
		{	
			System.out.println("You have selected middle aged people as the primary users of the swimming pool\n");
			userResult = "middle aged";
			userTypePool.add("ConcreteInGroundPool");
			userTypePool.add("FiberGlassInGroundPool");
			userTypePool.add("VinylLinerInGroundPool");
			userTypePool.add("InfinityInGroundPool");
			userTypePool.add("LapInGroundPool");
			userTypePool.add("PlungeInGroundPool");
			userTypePool.add("NaturalPool");
			userTypePool.add("SpoolPool");
			userTypePool.add("ArchitecturalInGroundPool");
			userTypePool.add("ZeroEntryInGroundPool");
			userTypePool.add("OceanPool");
			userTypePool.add("FiberGlassAboveGroundPool");
			userTypePool.add("VinylLinerAboveGroundPool");
			userTypePool.add("InfinityAboveGroundPool");
			userTypePool.add("LapAboveGroundPool");
			userTypePool.add("PlungeAboveGroundPool");
			userTypePool.add("HottubPool");
			userTypePool.add("ArchitecturalAboveGroundPool");
		}
		else if(userChoice=='a')
		{	
			System.out.println("You have selected athletes as the primary users of the swimming pool\n");
			userResult = "athlete";
			userTypePool.add("LapInGroundPool");
			userTypePool.add("ArchitecturalInGroundPool");
			userTypePool.add("LapAboveGroundPool");
			userTypePool.add("ArchitecturalAboveGroundPool");
		}
		
		else
		{	
			System.out.println("You have not selected the corresponding choices, try lower case and please select again\n");
			userQuestion();
		}
	}	
}
public void locationQuestion()
{
	System.out.println("Where are you planning to install the pool? \n");
	System.out.println("indoor(i) outdoor(o)\n");
	System.out.println("Enter the corresponding options : \n");
	char locationChoice = sc.next().charAt(0);
	{
		if(locationChoice=='i')
		{	
			System.out.println("You have selected indoor swimming pool\n");
			locationResult = "indoor";
			locationPool.add("ConcreteInGroundPool");
			locationPool.add("FiberGlassInGroundPool");
			locationPool.add("VinylLinerInGroundPool");
			locationPool.add("InfinityInGroundPool");
			locationPool.add("LapInGroundPool");
			locationPool.add("PlungeInGroundPool");
			locationPool.add("NaturalPool");
			locationPool.add("SpoolPool");
			locationPool.add("ArchitecturalInGroundPool");
			locationPool.add("ZeroEntryInGroundPool");
			locationPool.add("OceanPool");
			locationPool.add("FiberGlassAboveGroundPool");
			locationPool.add("HottubPool");
			locationPool.add("ArchitecturalAboveGroundPool");
		}
		else if(locationChoice=='o')
		{	
			System.out.println("You have selected outdoor swimming pool\n");
			locationResult = "outddoor";
			locationPool.add("ConcreteInGroundPool");
			locationPool.add("FiberGlassInGroundPool");
			locationPool.add("VinylLinerInGroundPool");
			locationPool.add("InfinityInGroundPool");
			locationPool.add("LapInGroundPool");
			locationPool.add("PlungeInGroundPool");
			locationPool.add("NaturalPool");
			locationPool.add("SpoolPool");
			locationPool.add("ArchitecturalInGroundPool");
			locationPool.add("ZeroEntryInGroundPool");
			locationPool.add("OceanPool");
			locationPool.add("FiberGlassAboveGroundPool");
			locationPool.add("VinylLinerAboveGroundPool");
			locationPool.add("InfinityAboveGroundPool");
			locationPool.add("LapAboveGroundPool");
			locationPool.add("PlungeAboveGroundPool");
			locationPool.add("HottubPool");
			locationPool.add("ArchitecturalAboveGroundPool");
		}
		else
		{	
			System.out.println("You have not selected the corresponding choices, try lower case and please select again\n");
			locationQuestion();
		}
	}	
}
public void accessabilityQuestion()
{
	System.out.println("Do you want a private pool or a public pool? \n");
	System.out.println("private(1) public(2)\n");
	System.out.println("Enter the corresponding options : \n");
	int accessabilityChoice = sc.nextInt();
	{
		if(accessabilityChoice==1)
		{	
			System.out.println("You wamt a private swimming pool\n");
			accessabilityResult = "private";
		}
		else if(accessabilityChoice==2)
		{	
			System.out.println("You wamt a public swimming pool\n");
			accessabilityResult = "public";
		}
		else
		{	
			System.out.println("You have not selected the corresponding choices, try lower case and please select again\n");
			accessabilityQuestion();
		}
	}	
}
public void extrasQuestion()
{
	System.out.println("Are you planning to install any extra features like jet sprays, fountains for the swimming pool? \n");
	System.out.println("yes(y) no(n)\n");
	System.out.println("Enter the corresponding options : \n");
	char extrasChoice = sc.next().charAt(0);
	{
		if(extrasChoice=='y')
		{	
			System.out.println("You opted to install additional amenities during the construction of the swimming pool\n");
			extrasResult = "yes";
		}
		else if(extrasChoice=='n')
		{	
			System.out.println("You opted not to install any additional amenities during the construction of the swimming pool\n");
			userResult = "elderly";
		}
		else
		{	
			System.out.println("You have not selected the corresponding choices, try lower case and please select again\n");
			extrasQuestion();
		}
	}	
}
public void termQuestion()
{
	System.out.println("Are you planning to construct a pool for long term or short term? \n");
	System.out.println("longTerm(l) shortTerm(s)\n");
	System.out.println("Enter the corresponding options : \n");
	char termChoice = sc.next().charAt(0);
	{
		if(termChoice=='l')
		{	
			System.out.println("You want to construct a long lasting swimming pool\n");
			termResult = "longTerm";
			termPool.add("ConcreteInGroundPool");
			termPool.add("FiberGlassInGroundPool");
			termPool.add("VinylLinerInGroundPool");
			termPool.add("InfinityInGroundPool");
			termPool.add("LapInGroundPool");
			termPool.add("NaturalPool");
			termPool.add("ArchitecturalInGroundPool");
			termPool.add("ZeroEntryInGroundPool");
			termPool.add("OceanPool");
			termPool.add("ArchitecturalAboveGroundPool");
			
		}
		else if(termChoice=='s')
		{	
			System.out.println("You want to construct a short term swimming pool\n");
			termResult = "shortTerm";
			termPool.add("PlungeInGroundPool");
			termPool.add("SpoolPool");
			termPool.add("FiberGlassAboveGroundPool");
			termPool.add("VinylLinerAboveGroundPool");
			termPool.add("InfinityAboveGroundPool");
			termPool.add("LapAboveGroundPool");
			termPool.add("PlungeAboveGroundPool");
			termPool.add("HottubPool");
		}
		else
		{	
			System.out.println("You have not selected the corresponding choices, try lower case and please select again\n");
			termQuestion();
		}
	}	
}
public void durationQuestion()
{
	System.out.println("How quickly you want the pool to be constructed? \n");
	System.out.println("longTerm(l) moderate(m) shortTerm(s)\n");
	System.out.println("Enter the corresponding options : \n");
	char durationChoice = sc.next().charAt(0);
	{
		if(durationChoice=='l')
		{	
			System.out.println("The pool construction duration will be long, could be more than six months\n");
			durationResult = "longTerm";
			durationPool.add("ConcreteInGroundPool");
			durationPool.add("InfinityInGroundPool");
			durationPool.add("LapInGroundPool");
			durationPool.add("NaturalPool");
			durationPool.add("ArchitecturalInGroundPool");
			durationPool.add("ZeroEntryInGroundPool");
			durationPool.add("OceanPool");
			durationPool.add("ArchitecturalAboveGroundPool");
		}
		else if(durationChoice=='m')
		{	
			System.out.println("The pool construction duration will be moderate, might take somewhere from 3 to 6 months\n");
			durationResult = "moderate";
			durationPool.add("FiberGlassInGroundPool");
			durationPool.add("VinylLinerInGroundPool");
			durationPool.add("InfinityAboveGroundPool");
			durationPool.add("LapAboveGroundPool");
		}
		else if(durationChoice=='s')
		{	
			System.out.println("The pool construction duration will be considerably shorter, should be able to complete within 3 months\n");
			durationResult = "shortTerm";
			durationPool.add("PlungeInGroundPool");
			durationPool.add("SpoolPool");
			durationPool.add("FiberGlassAboveGroundPool");
			durationPool.add("VinylLinerAboveGroundPool");
			durationPool.add("PlungeAboveGroundPool");
			durationPool.add("HottubPool");
		}
		else
		{	
			System.out.println("You have not selected the corresponding choices, try lower case and please select again\n");
			durationQuestion();
		}
	}	
}

public void Questions()
{
	typeQuestion();
	userQuestion();
	
	activityQuestion();
	shapeQuestion();
	locationQuestion();
	
	costRangeQuestion();
	termQuestion();
	durationQuestion();
	maintananceQuestion();
	
	
	
	accessabilityQuestion();
	extrasQuestion();
	
}
public void result()
{
	
	//activityPool costPool maintancePool shapePool userPool locationPool termPool durationPool typePool
	userTypePool.retainAll(typePool);
	activityPool.retainAll(userTypePool);
	shapePool.retainAll(activityPool);
	locationPool.retainAll(shapePool);
	costPool.retainAll(locationPool);
	termPool.retainAll(costPool);
	durationPool.retainAll(termPool);
	maintanancePool.retainAll(durationPool);
	result = maintanancePool;
	if(result.isEmpty())
	{
		if(typeResult=="inGround")
		{
			if(activityResult=="relaxation")
			{
				List<String> recommender = new ArrayList<String>();
				recommender.add("ConcreteInGroundPool");
				recommender.add("FiberGlassInGroundPool");
				recommender.add("VinylLinerInGroundPool");
				recommender.add("InfinityInGroundPool");
				recommender.add("NaturalPool");
				recommender.add("ArchitecturalInGroundPool");
				recommender.add("ZeroEntryGroundPool");
				recommender.add("OceanPool");
				System.out.println("We recommend "+recommender);
				result = recommender;
				useResult();
			}
			else if(activityResult=="hydrotherapy")
			{
				List<String> recommender = new ArrayList<String>();
				recommender.add("SpoolPool");
				System.out.println("We recommend "+recommender);
				result = recommender;
				useResult();
			}
			else if(activityResult=="plunge")
			{
				List<String> recommender = new ArrayList<String>();
				recommender.add("PlungeInGroundPool");
				System.out.println("We recommend "+recommender);
				result = recommender;
				useResult();
			}
			else if(activityResult=="laps")
			{
				List<String> recommender = new ArrayList<String>();
				recommender.add("LapInGroundPool");
				System.out.println("We recommend "+recommender);
				result = recommender;
				useResult();
			}
			else if(activityResult=="diving")
			{
				List<String> recommender = new ArrayList<String>();
				recommender.add("ConcreteInGroundPool");
				recommender.add("ArchitecturalInGroundPool");
				System.out.println("We recommend "+recommender);
				result = recommender;
				useResult();
			}
			
		}
		else if(typeResult == "aboveGround")
		{
			if(activityResult=="relaxation")
			{
				List<String> recommender = new ArrayList<String>();
				recommender.add("FiberGlassAboveGroundPool");
				recommender.add("VinylLinerInGroundPool");
				recommender.add("InfinityAboveGroundPool");
				recommender.add("ArchitecturalAboveGroundPool");
				System.out.println("We recommend "+recommender);
				result = recommender;
				useResult();
			}
			if(activityResult=="hydrotherapy")
			{
				List<String> recommender = new ArrayList<String>();
				recommender.add("HottubPool");
				System.out.println("We recommend "+recommender);
				result = recommender;
				useResult();
			}
			if(activityResult=="plunge")
			{
				List<String> recommender = new ArrayList<String>();
				recommender.add("PlungeAboveGroundPool");
				System.out.println("We recommend "+recommender);
				result = recommender;
				useResult();
			}
			if(activityResult=="laps")
			{
				List<String> recommender = new ArrayList<String>();
				recommender.add("LapAboveGroundPool");
				System.out.println("We recommend "+recommender);
				result = recommender;
				useResult();
			}
			if(activityResult=="diving")
			{
				List<String> recommender = new ArrayList<String>();
				recommender.add("ArchitecturalAboveGroundPool");
				System.out.println("We recommend "+recommender);
				result = recommender;
				useResult();
			}
			
		}
	}
	else
	System.out.println("We recommend "+ result);
	useResult();
}
public void useResult()
{
	System.out.println("Do you wanna use the pool recommended by us? \n");
	System.out.println("yes(y) no(n) \n");
	System.out.println("Enter the corresponding choice\n");
	char c1 = sc.next().charAt(0);
	if(c1=='y')
	{
		userChoice();
	}
	else if(c1=='n')
	{
		System.out.println("Do you want to select any other pool?\n");
		System.out.println("yes(y) no(n) \n");
		System.out.println("Enter the corresponding choice\n");
		char c2 = sc.next().charAt(0);
		if(c2=='y')
		{
			userChoice();
		}
		else if(c2=='n')
		{
			System.out.println("Do you want to know more about the different kinds of swimming pools?\n");
			System.out.println("yes(y) no(n) \n");
			System.out.println("Enter the corresponding choice\n");
			char c3 = sc.next().charAt(0);
			if(c3=='y')
			{
				AboutPools aboutPools = new AboutPools();
				aboutPools.aboutPools();
			}
			else if(c3=='n')
			{
				System.out.println("hope we can help you find the right swimming pools?\n");
				
			}
		}
	
	}
}
private static void aboutPools() {
	// TODO Auto-generated method stub
	
}
public void userChoice()
{
	System.out.println("Enter the desired pool you selected\n");
	userChoice = sc.next();
	for(int i=0;i<result.size();i++)
	{
		if(userChoice==result.get(i))
		{
			userChoice = result.get(i);
		}
		else
		{
			for(i=0;i<poolList.size();i++)
			{
				if(userChoice == poolList.get(i))
				{
					userChoice = result.get(i);
				}
				else
				{
					System.out.println("The pool you have selected is not in the poolList\n");
					userChoice();
				}
			}
		}
	}
}

}

