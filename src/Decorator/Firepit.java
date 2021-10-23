package Decorator;
import Observer.Subject;
public class Firepit extends Extras {
	int count;
	public Firepit() {
		description = "Firepit installed in pool";
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