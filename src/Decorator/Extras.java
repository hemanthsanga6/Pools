package Decorator;
import Builder.Pool;
import Builder.PoolBuilder;
import Observer.Subject;
public abstract class Extras {
	String description = "Unknown extra";
	int count;
	public String getDescription() {
		return description;
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
 
	public abstract double cost();
}