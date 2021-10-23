package Decorator;
import Observer.Subject;
public class JetSpray extends Extras {
	int count;
	public JetSpray() {
		description = "JetSprays installed in pool for wave control";
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
		return 5000;
	}
}