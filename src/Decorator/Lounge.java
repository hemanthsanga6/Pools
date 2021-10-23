package Decorator;
import Observer.Subject;
public class Lounge extends Extras {
	int count;
	public Lounge() {
		description = "Lounge installed in pool";
	}
	public void setCount(int count)
	{
		this.count = count;
		Subject s= new Subject();
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