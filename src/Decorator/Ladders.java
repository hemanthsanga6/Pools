package Decorator;
import Observer.Subject;
public class Ladders extends Extras {
	int count;
	public Ladders() {
		description = "Ladders installed in pool for safety and accessability purpose";
	}
	public void setCount(int count)
	{
		this.count = count;
		Subject s = new Subject();
	}
	public int getCount()
	{
		return count;
	}
	 
	public double cost() {
		return 2000;
	}
}