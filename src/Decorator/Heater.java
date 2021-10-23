package Decorator;
import Observer.Subject;
public class Heater extends Extras {
	int count;
	public Heater() {
		description = "Thermal heaters installed in pool for temperature control";
	}
	public void setCount(int count)
	{
		this.count = count;
	Subject s = new Subject();
	s.notifyUsers();
	}
	public int getCount()
	{
		return count;
	}
	 
	public double cost() {
		return 3000;
	}
}

