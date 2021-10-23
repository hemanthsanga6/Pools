package Decorator;
import Observer.Subject;
public class Skimmers extends Extras {
	int count;
	public Skimmers() {
		description = "Skimmers installed in pool for protection against leafs and dust";
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