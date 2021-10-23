package Decorator;
import Observer.Subject;
public class Speakers extends Extras {
	int count;
	public Speakers() {
		description = "Speakers installed in pool for entertainment purpose";
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
		return 2000;
	}
}
