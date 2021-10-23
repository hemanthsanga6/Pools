package Decorator;
import Observer.Subject;
public class Cover extends Extras {
	int count;
	public Cover() {
		description = "Automatic Pool covers have been installed for protection against environment factors";
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
		return 8000;
	}
}