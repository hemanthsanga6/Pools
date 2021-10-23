package Factory;
import Test.Test;
import java.util.*;
public class AboutPools {
public void aboutPools()
{
	System.out.println("So you decided to build a pool for yourself\n");
	System.out.println("In the process of deciding which pool is suitable for you, you got to know about many kinds of pools and their functioanlities\n");
	System.out.println("Selecting the right kind of pool will not only save you money, but also help you to build a perfect pool which requires no major changes to be done to it in the future as well\n");
	System.out.println("There are many kinds of pools whose users range from children to elderly\n");
	System.out.println("Pools can be mainly categorized into two types mainly in ground pools and above ground pools\n");
	System.out.println("As their names suggest, in ground pools are built underground with the base constructed by digging and filling it with building materials like concrete\n");
	System.out.println("Above ground pools on the other hand are built in using a structural component above ground\n");
	System.out.println("All kinds of swimming pools mainly fall into these two types\n");
	System.out.println("Above ground pools are not as much expensive to install compared to in ground pools which require a lot of sophisticated planning and time for cosntruction\n");
	System.out.println("Above ground pools are easier to assemble as well as most of their parts come in a diy package\n");
	System.out.println("In ground pools have their own advantages though, even though they cost considerably much expensive than above ground pools, in the long run they are actually more profitable\n");
	System.out.println("Pools can be of different categories based on several criteria\n");
	System.out.println("For instance athletes have a different requirement than elderly people when selecting a pool\n");
	System.out.println("Luxury, Comfort, HydroTherapy, etc are few other scenarios to be taken into consideration which can categorize the type of pool\n");
	System.out.println("The most common type of pools are\n");
	System.out.println("\nConcrete in ground pool:\n");
	System.out.println("In ground pools typically fall into 3 types depending on the materials used to construct them, with concrete being the most expensive and durable type of pool\n");
	System.out.println("Concrete pool layout can be selected into any custom shape and they usually cost about $30000 for construction and installation\n");
	System.out.println("\nFiber Glass in ground pools:\n");
	System.out.println("They are other type of commonly used in ground pools\n");
	System.out.println("Fiber Glass pools require minimal maintanance and they last much longer too\n");
	System.out.println("They typically cost about $25000 to cosntruct\n");
	System.out.println("\nVinyl Liner in ground pool: \n");
	System.out.println("They usually are a little bit cheaper compared to the other two in ground pools and typically cost about $15000\n");
	System.out.println("They require much maintanance too as vinyl liners need to be changed once in every 5 years\n");
	System.out.println("\nIf you want to consider taking a plunge then we have plunge swimming pools\n");
	System.out.println("For athletes it is best recommended to go with lap pools as they are specifically designed for swimming laps\n");
	System.out.println("\nThere are luxury pools available as well\n");
	System.out.println("Infinity pools or vanishing edge pools are usually the ones which are most commonly seen on any instagram influencer page\n");
	System.out.println("For relaxation purposes we can go with hot tub pools or spools which is spa and a pool\n");
	System.out.println("It is possible to custom design your own pools and blend them into your house\n");
	System.out.println("Architectural swimming pools help you do that, but as the name suggests every little detail is carefully planned and constructed using a architect plan and they are the most expensive kind of pools\n");
	System.out.println("You can select natural pools too which rely on plants for filtration of the swimming pools\n");
	
	
	System.out.println("\nDo you want us to select the perfect pool depending on all the factors? \n");
	System.out.println("press y or n\n");
	Scanner sc = new Scanner(System.in);
	char c = sc.next().charAt(0);
	if(c=='y')
	{
		Questionnaire questionnaire = new Questionnaire();
		questionnaire.Questions();
	}
	else if(c=='n')
	{
		System.out.println("Do you have a specific pool in mind?\n");
		System.out.println("Enter y or n\n");
		char p = sc.next().charAt(0);
		if(p=='y')
		{
		Questionnaire questionnaire = new Questionnaire();
		questionnaire.userChoice();
		}
		
	}
	
	
	
}
}
