package Observer;
import Decorator.Extras;
import Decorator.Cover;
import Decorator.DivingBoards;
import Decorator.Firepit;
import Decorator.Fountain;
import Decorator.Heater;
import Decorator.JetSpray;
import Decorator.Ladders;
import Decorator.Lounge;
import Decorator.Ramp;
import Decorator.Skimmers;
import Decorator.Speakers;
import Decorator.TanningLedge;
import Decorator.WaterSlide;


public class Inventory {
	
public static void Inventory() {
		// TODO Auto-generated method stub
		Cover c = new Cover();
		c.setCount(3);
		System.out.println("We have "+c.getCount()+" covers" );
		DivingBoards d = new DivingBoards();
		d.setCount(3);
		System.out.println("We have "+d.getCount()+" DivingBoards" );
		Firepit f = new Firepit();
		f.setCount(3);
		System.out.println("We have "+f.getCount()+" Firepits" );
		Fountain fntn = new Fountain();
		fntn.setCount(3);
		System.out.println("We have "+fntn.getCount()+" Fountains" );
		Heater h = new Heater();
		h.setCount(3);
		System.out.println("We have "+h.getCount()+" heaters" );
		JetSpray j = new JetSpray();
		j.setCount(3);
		System.out.println("We have "+j.getCount()+" jetSprays" );
		Ladders l = new Ladders();
		l.setCount(3);
		System.out.println("We have "+l.getCount()+" ladders" );
		Lounge lng = new Lounge();
		lng.setCount(3);
		System.out.println("We have "+lng.getCount()+" Lounge's" );
		Ramp r = new Ramp();
		r.setCount(3);
		System.out.println("We have "+r.getCount()+" ramps" );
		Skimmers s = new Skimmers();
		s.setCount(3);
		System.out.println("We have "+s.getCount()+" skimmers" );
		Speakers spkr = new Speakers();
		spkr.setCount(3);
		System.out.println("We have "+spkr.getCount()+" Speakers" );
		TanningLedge t = new TanningLedge();
		t.setCount(3);
		System.out.println("We have "+t.getCount()+" Tanning Ledges" );
		WaterSlide w = new WaterSlide();
		w.setCount(3);
		System.out.println("We have "+w.getCount()+" water slides" );
	}
	
}